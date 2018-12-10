package com.metro.controler;


import com.metro.entity.ActivemqMsgs;
import com.metro.mapper.YlDealInMapper;
import com.metro.mq.IMessageProducerService;
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
@Api(description = "1.测试")
@RestController
@RequestMapping("/test")
@CrossOrigin(origins = "*")
public class ActivemqMsgsController {
    @Autowired
    IActivemqMsgsService activemqMsgsService;

    @Autowired
    private YlDealInMapper ylDealInMapper;

    @Autowired
    IMessageProducerService messageProducer;
    @ApiOperation(value = "1.1测试" ,  notes="id:id")
    @RequestMapping(value = "/getIndexMenuBySiteId" ,  method = RequestMethod.GET)
    public String getIndexMenuBySiteId(@RequestParam(name = "id") int id){
        ActivemqMsgs msg = activemqMsgsService.selectById(id);
        for (int x = 0; x < 10; x++) {
            this.messageProducer.sendMessage("study - " + x);
        }
       return msg!=null?msg.getContainer():null;
    }

    @ApiOperation(value = "1.1测试" ,  notes="id:id")
    @RequestMapping(value = "/test2" ,  method = RequestMethod.GET)
    public String test2(){
        ylDealInMapper.deleteByPrimaryKey("");
        return null;
    }
}

