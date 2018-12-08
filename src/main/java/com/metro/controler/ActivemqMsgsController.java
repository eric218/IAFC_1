package com.metro.controler;


import com.metro.entity.ActivemqMsgs;
import com.metro.service.IActivemqMsgsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author wangwei
 * @since 2018-12-08
 */
@Api(description = "联谊会菜单接口(前台)")
@RestController
@RequestMapping("/test")
@CrossOrigin(origins = "*")
public class ActivemqMsgsController {
    @Autowired
    IActivemqMsgsService activemqMsgsService;
    @ApiOperation(value = "前台首页静态菜单" ,  notes="siteId:网站id")
    @RequestMapping(value = "/getIndexMenuBySiteId" ,  method = RequestMethod.GET)
    public String getIndexMenuBySiteId(@RequestParam(name = "siteId") int siteId){
        ActivemqMsgs msg = activemqMsgsService.selectById(siteId);
       return msg!=null?msg.getContainer():null;
    }
}

