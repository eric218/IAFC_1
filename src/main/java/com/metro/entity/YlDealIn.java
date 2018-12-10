package com.metro.entity;

import java.math.BigDecimal;
import java.util.Date;

public class YlDealIn {
    private String eventNo;

    private Date saveTime;

    private String dealDeviceCode;

    private String dealSeqGroupNo;

    private String dealSeqNo;

    private String dealStation;

    private String dealType;

    private String mainType;

    private String subType;

    private String areaCode;

    private String samCode;

    private String logicalCode;

    private Integer readCount;

    private BigDecimal dealAmount;

    private BigDecimal balance;

    private Date dealTime;

    private String tac;

    private Date operationDate;

    private String dealMode;

    private String recFlag;

    private String matchFlag;

    private Date matchTime;

    private String accFlag;

    private String accFileName;

    private Date accFileTime;

    private Long accFileLineCode;

    private Date splitTime;

    public String getEventNo() {
        return eventNo;
    }

    public void setEventNo(String eventNo) {
        this.eventNo = eventNo == null ? null : eventNo.trim();
    }

    public Date getSaveTime() {
        return saveTime;
    }

    public void setSaveTime(Date saveTime) {
        this.saveTime = saveTime;
    }

    public String getDealDeviceCode() {
        return dealDeviceCode;
    }

    public void setDealDeviceCode(String dealDeviceCode) {
        this.dealDeviceCode = dealDeviceCode == null ? null : dealDeviceCode.trim();
    }

    public String getDealSeqGroupNo() {
        return dealSeqGroupNo;
    }

    public void setDealSeqGroupNo(String dealSeqGroupNo) {
        this.dealSeqGroupNo = dealSeqGroupNo == null ? null : dealSeqGroupNo.trim();
    }

    public String getDealSeqNo() {
        return dealSeqNo;
    }

    public void setDealSeqNo(String dealSeqNo) {
        this.dealSeqNo = dealSeqNo == null ? null : dealSeqNo.trim();
    }

    public String getDealStation() {
        return dealStation;
    }

    public void setDealStation(String dealStation) {
        this.dealStation = dealStation == null ? null : dealStation.trim();
    }

    public String getDealType() {
        return dealType;
    }

    public void setDealType(String dealType) {
        this.dealType = dealType == null ? null : dealType.trim();
    }

    public String getMainType() {
        return mainType;
    }

    public void setMainType(String mainType) {
        this.mainType = mainType == null ? null : mainType.trim();
    }

    public String getSubType() {
        return subType;
    }

    public void setSubType(String subType) {
        this.subType = subType == null ? null : subType.trim();
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode == null ? null : areaCode.trim();
    }

    public String getSamCode() {
        return samCode;
    }

    public void setSamCode(String samCode) {
        this.samCode = samCode == null ? null : samCode.trim();
    }

    public String getLogicalCode() {
        return logicalCode;
    }

    public void setLogicalCode(String logicalCode) {
        this.logicalCode = logicalCode == null ? null : logicalCode.trim();
    }

    public Integer getReadCount() {
        return readCount;
    }

    public void setReadCount(Integer readCount) {
        this.readCount = readCount;
    }

    public BigDecimal getDealAmount() {
        return dealAmount;
    }

    public void setDealAmount(BigDecimal dealAmount) {
        this.dealAmount = dealAmount;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public Date getDealTime() {
        return dealTime;
    }

    public void setDealTime(Date dealTime) {
        this.dealTime = dealTime;
    }

    public String getTac() {
        return tac;
    }

    public void setTac(String tac) {
        this.tac = tac == null ? null : tac.trim();
    }

    public Date getOperationDate() {
        return operationDate;
    }

    public void setOperationDate(Date operationDate) {
        this.operationDate = operationDate;
    }

    public String getDealMode() {
        return dealMode;
    }

    public void setDealMode(String dealMode) {
        this.dealMode = dealMode == null ? null : dealMode.trim();
    }

    public String getRecFlag() {
        return recFlag;
    }

    public void setRecFlag(String recFlag) {
        this.recFlag = recFlag == null ? null : recFlag.trim();
    }

    public String getMatchFlag() {
        return matchFlag;
    }

    public void setMatchFlag(String matchFlag) {
        this.matchFlag = matchFlag == null ? null : matchFlag.trim();
    }

    public Date getMatchTime() {
        return matchTime;
    }

    public void setMatchTime(Date matchTime) {
        this.matchTime = matchTime;
    }

    public String getAccFlag() {
        return accFlag;
    }

    public void setAccFlag(String accFlag) {
        this.accFlag = accFlag == null ? null : accFlag.trim();
    }

    public String getAccFileName() {
        return accFileName;
    }

    public void setAccFileName(String accFileName) {
        this.accFileName = accFileName == null ? null : accFileName.trim();
    }

    public Date getAccFileTime() {
        return accFileTime;
    }

    public void setAccFileTime(Date accFileTime) {
        this.accFileTime = accFileTime;
    }

    public Long getAccFileLineCode() {
        return accFileLineCode;
    }

    public void setAccFileLineCode(Long accFileLineCode) {
        this.accFileLineCode = accFileLineCode;
    }

    public Date getSplitTime() {
        return splitTime;
    }

    public void setSplitTime(Date splitTime) {
        this.splitTime = splitTime;
    }
}