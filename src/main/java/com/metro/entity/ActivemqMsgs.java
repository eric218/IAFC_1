package com.metro.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author wangwei
 * @since 2018-12-08
 */
@TableName("ACTIVEMQ_MSGS")
public class ActivemqMsgs extends Model<ActivemqMsgs> {

    private static final long serialVersionUID = 1L;

    @TableId("ID")
    private Double id;
    @TableField("CONTAINER")
    private String container;
    @TableField("MSGID_PROD")
    private String msgidProd;
    @TableField("MSGID_SEQ")
    private Double msgidSeq;
    @TableField("EXPIRATION")
    private Double expiration;
    @TableField("MSG")
    private Object msg;
    @TableField("PRIORITY")
    private Double priority;
    @TableField("XID")
    private String xid;


    public Double getId() {
        return id;
    }

    public ActivemqMsgs setId(Double id) {
        this.id = id;
        return this;
    }

    public String getContainer() {
        return container;
    }

    public ActivemqMsgs setContainer(String container) {
        this.container = container;
        return this;
    }

    public String getMsgidProd() {
        return msgidProd;
    }

    public ActivemqMsgs setMsgidProd(String msgidProd) {
        this.msgidProd = msgidProd;
        return this;
    }

    public Double getMsgidSeq() {
        return msgidSeq;
    }

    public ActivemqMsgs setMsgidSeq(Double msgidSeq) {
        this.msgidSeq = msgidSeq;
        return this;
    }

    public Double getExpiration() {
        return expiration;
    }

    public ActivemqMsgs setExpiration(Double expiration) {
        this.expiration = expiration;
        return this;
    }

    public Object getMsg() {
        return msg;
    }

    public ActivemqMsgs setMsg(Object msg) {
        this.msg = msg;
        return this;
    }

    public Double getPriority() {
        return priority;
    }

    public ActivemqMsgs setPriority(Double priority) {
        this.priority = priority;
        return this;
    }

    public String getXid() {
        return xid;
    }

    public ActivemqMsgs setXid(String xid) {
        this.xid = xid;
        return this;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "ActivemqMsgs{" +
        ", id=" + id +
        ", container=" + container +
        ", msgidProd=" + msgidProd +
        ", msgidSeq=" + msgidSeq +
        ", expiration=" + expiration +
        ", msg=" + msg +
        ", priority=" + priority +
        ", xid=" + xid +
        "}";
    }
}
