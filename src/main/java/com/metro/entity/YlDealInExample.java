package com.metro.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class YlDealInExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public YlDealInExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andEventNoIsNull() {
            addCriterion("EVENT_NO is null");
            return (Criteria) this;
        }

        public Criteria andEventNoIsNotNull() {
            addCriterion("EVENT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andEventNoEqualTo(String value) {
            addCriterion("EVENT_NO =", value, "eventNo");
            return (Criteria) this;
        }

        public Criteria andEventNoNotEqualTo(String value) {
            addCriterion("EVENT_NO <>", value, "eventNo");
            return (Criteria) this;
        }

        public Criteria andEventNoGreaterThan(String value) {
            addCriterion("EVENT_NO >", value, "eventNo");
            return (Criteria) this;
        }

        public Criteria andEventNoGreaterThanOrEqualTo(String value) {
            addCriterion("EVENT_NO >=", value, "eventNo");
            return (Criteria) this;
        }

        public Criteria andEventNoLessThan(String value) {
            addCriterion("EVENT_NO <", value, "eventNo");
            return (Criteria) this;
        }

        public Criteria andEventNoLessThanOrEqualTo(String value) {
            addCriterion("EVENT_NO <=", value, "eventNo");
            return (Criteria) this;
        }

        public Criteria andEventNoLike(String value) {
            addCriterion("EVENT_NO like", value, "eventNo");
            return (Criteria) this;
        }

        public Criteria andEventNoNotLike(String value) {
            addCriterion("EVENT_NO not like", value, "eventNo");
            return (Criteria) this;
        }

        public Criteria andEventNoIn(List<String> values) {
            addCriterion("EVENT_NO in", values, "eventNo");
            return (Criteria) this;
        }

        public Criteria andEventNoNotIn(List<String> values) {
            addCriterion("EVENT_NO not in", values, "eventNo");
            return (Criteria) this;
        }

        public Criteria andEventNoBetween(String value1, String value2) {
            addCriterion("EVENT_NO between", value1, value2, "eventNo");
            return (Criteria) this;
        }

        public Criteria andEventNoNotBetween(String value1, String value2) {
            addCriterion("EVENT_NO not between", value1, value2, "eventNo");
            return (Criteria) this;
        }

        public Criteria andSaveTimeIsNull() {
            addCriterion("SAVE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andSaveTimeIsNotNull() {
            addCriterion("SAVE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andSaveTimeEqualTo(Date value) {
            addCriterion("SAVE_TIME =", value, "saveTime");
            return (Criteria) this;
        }

        public Criteria andSaveTimeNotEqualTo(Date value) {
            addCriterion("SAVE_TIME <>", value, "saveTime");
            return (Criteria) this;
        }

        public Criteria andSaveTimeGreaterThan(Date value) {
            addCriterion("SAVE_TIME >", value, "saveTime");
            return (Criteria) this;
        }

        public Criteria andSaveTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("SAVE_TIME >=", value, "saveTime");
            return (Criteria) this;
        }

        public Criteria andSaveTimeLessThan(Date value) {
            addCriterion("SAVE_TIME <", value, "saveTime");
            return (Criteria) this;
        }

        public Criteria andSaveTimeLessThanOrEqualTo(Date value) {
            addCriterion("SAVE_TIME <=", value, "saveTime");
            return (Criteria) this;
        }

        public Criteria andSaveTimeIn(List<Date> values) {
            addCriterion("SAVE_TIME in", values, "saveTime");
            return (Criteria) this;
        }

        public Criteria andSaveTimeNotIn(List<Date> values) {
            addCriterion("SAVE_TIME not in", values, "saveTime");
            return (Criteria) this;
        }

        public Criteria andSaveTimeBetween(Date value1, Date value2) {
            addCriterion("SAVE_TIME between", value1, value2, "saveTime");
            return (Criteria) this;
        }

        public Criteria andSaveTimeNotBetween(Date value1, Date value2) {
            addCriterion("SAVE_TIME not between", value1, value2, "saveTime");
            return (Criteria) this;
        }

        public Criteria andDealDeviceCodeIsNull() {
            addCriterion("DEAL_DEVICE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andDealDeviceCodeIsNotNull() {
            addCriterion("DEAL_DEVICE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andDealDeviceCodeEqualTo(String value) {
            addCriterion("DEAL_DEVICE_CODE =", value, "dealDeviceCode");
            return (Criteria) this;
        }

        public Criteria andDealDeviceCodeNotEqualTo(String value) {
            addCriterion("DEAL_DEVICE_CODE <>", value, "dealDeviceCode");
            return (Criteria) this;
        }

        public Criteria andDealDeviceCodeGreaterThan(String value) {
            addCriterion("DEAL_DEVICE_CODE >", value, "dealDeviceCode");
            return (Criteria) this;
        }

        public Criteria andDealDeviceCodeGreaterThanOrEqualTo(String value) {
            addCriterion("DEAL_DEVICE_CODE >=", value, "dealDeviceCode");
            return (Criteria) this;
        }

        public Criteria andDealDeviceCodeLessThan(String value) {
            addCriterion("DEAL_DEVICE_CODE <", value, "dealDeviceCode");
            return (Criteria) this;
        }

        public Criteria andDealDeviceCodeLessThanOrEqualTo(String value) {
            addCriterion("DEAL_DEVICE_CODE <=", value, "dealDeviceCode");
            return (Criteria) this;
        }

        public Criteria andDealDeviceCodeLike(String value) {
            addCriterion("DEAL_DEVICE_CODE like", value, "dealDeviceCode");
            return (Criteria) this;
        }

        public Criteria andDealDeviceCodeNotLike(String value) {
            addCriterion("DEAL_DEVICE_CODE not like", value, "dealDeviceCode");
            return (Criteria) this;
        }

        public Criteria andDealDeviceCodeIn(List<String> values) {
            addCriterion("DEAL_DEVICE_CODE in", values, "dealDeviceCode");
            return (Criteria) this;
        }

        public Criteria andDealDeviceCodeNotIn(List<String> values) {
            addCriterion("DEAL_DEVICE_CODE not in", values, "dealDeviceCode");
            return (Criteria) this;
        }

        public Criteria andDealDeviceCodeBetween(String value1, String value2) {
            addCriterion("DEAL_DEVICE_CODE between", value1, value2, "dealDeviceCode");
            return (Criteria) this;
        }

        public Criteria andDealDeviceCodeNotBetween(String value1, String value2) {
            addCriterion("DEAL_DEVICE_CODE not between", value1, value2, "dealDeviceCode");
            return (Criteria) this;
        }

        public Criteria andDealSeqGroupNoIsNull() {
            addCriterion("DEAL_SEQ_GROUP_NO is null");
            return (Criteria) this;
        }

        public Criteria andDealSeqGroupNoIsNotNull() {
            addCriterion("DEAL_SEQ_GROUP_NO is not null");
            return (Criteria) this;
        }

        public Criteria andDealSeqGroupNoEqualTo(String value) {
            addCriterion("DEAL_SEQ_GROUP_NO =", value, "dealSeqGroupNo");
            return (Criteria) this;
        }

        public Criteria andDealSeqGroupNoNotEqualTo(String value) {
            addCriterion("DEAL_SEQ_GROUP_NO <>", value, "dealSeqGroupNo");
            return (Criteria) this;
        }

        public Criteria andDealSeqGroupNoGreaterThan(String value) {
            addCriterion("DEAL_SEQ_GROUP_NO >", value, "dealSeqGroupNo");
            return (Criteria) this;
        }

        public Criteria andDealSeqGroupNoGreaterThanOrEqualTo(String value) {
            addCriterion("DEAL_SEQ_GROUP_NO >=", value, "dealSeqGroupNo");
            return (Criteria) this;
        }

        public Criteria andDealSeqGroupNoLessThan(String value) {
            addCriterion("DEAL_SEQ_GROUP_NO <", value, "dealSeqGroupNo");
            return (Criteria) this;
        }

        public Criteria andDealSeqGroupNoLessThanOrEqualTo(String value) {
            addCriterion("DEAL_SEQ_GROUP_NO <=", value, "dealSeqGroupNo");
            return (Criteria) this;
        }

        public Criteria andDealSeqGroupNoLike(String value) {
            addCriterion("DEAL_SEQ_GROUP_NO like", value, "dealSeqGroupNo");
            return (Criteria) this;
        }

        public Criteria andDealSeqGroupNoNotLike(String value) {
            addCriterion("DEAL_SEQ_GROUP_NO not like", value, "dealSeqGroupNo");
            return (Criteria) this;
        }

        public Criteria andDealSeqGroupNoIn(List<String> values) {
            addCriterion("DEAL_SEQ_GROUP_NO in", values, "dealSeqGroupNo");
            return (Criteria) this;
        }

        public Criteria andDealSeqGroupNoNotIn(List<String> values) {
            addCriterion("DEAL_SEQ_GROUP_NO not in", values, "dealSeqGroupNo");
            return (Criteria) this;
        }

        public Criteria andDealSeqGroupNoBetween(String value1, String value2) {
            addCriterion("DEAL_SEQ_GROUP_NO between", value1, value2, "dealSeqGroupNo");
            return (Criteria) this;
        }

        public Criteria andDealSeqGroupNoNotBetween(String value1, String value2) {
            addCriterion("DEAL_SEQ_GROUP_NO not between", value1, value2, "dealSeqGroupNo");
            return (Criteria) this;
        }

        public Criteria andDealSeqNoIsNull() {
            addCriterion("DEAL_SEQ_NO is null");
            return (Criteria) this;
        }

        public Criteria andDealSeqNoIsNotNull() {
            addCriterion("DEAL_SEQ_NO is not null");
            return (Criteria) this;
        }

        public Criteria andDealSeqNoEqualTo(String value) {
            addCriterion("DEAL_SEQ_NO =", value, "dealSeqNo");
            return (Criteria) this;
        }

        public Criteria andDealSeqNoNotEqualTo(String value) {
            addCriterion("DEAL_SEQ_NO <>", value, "dealSeqNo");
            return (Criteria) this;
        }

        public Criteria andDealSeqNoGreaterThan(String value) {
            addCriterion("DEAL_SEQ_NO >", value, "dealSeqNo");
            return (Criteria) this;
        }

        public Criteria andDealSeqNoGreaterThanOrEqualTo(String value) {
            addCriterion("DEAL_SEQ_NO >=", value, "dealSeqNo");
            return (Criteria) this;
        }

        public Criteria andDealSeqNoLessThan(String value) {
            addCriterion("DEAL_SEQ_NO <", value, "dealSeqNo");
            return (Criteria) this;
        }

        public Criteria andDealSeqNoLessThanOrEqualTo(String value) {
            addCriterion("DEAL_SEQ_NO <=", value, "dealSeqNo");
            return (Criteria) this;
        }

        public Criteria andDealSeqNoLike(String value) {
            addCriterion("DEAL_SEQ_NO like", value, "dealSeqNo");
            return (Criteria) this;
        }

        public Criteria andDealSeqNoNotLike(String value) {
            addCriterion("DEAL_SEQ_NO not like", value, "dealSeqNo");
            return (Criteria) this;
        }

        public Criteria andDealSeqNoIn(List<String> values) {
            addCriterion("DEAL_SEQ_NO in", values, "dealSeqNo");
            return (Criteria) this;
        }

        public Criteria andDealSeqNoNotIn(List<String> values) {
            addCriterion("DEAL_SEQ_NO not in", values, "dealSeqNo");
            return (Criteria) this;
        }

        public Criteria andDealSeqNoBetween(String value1, String value2) {
            addCriterion("DEAL_SEQ_NO between", value1, value2, "dealSeqNo");
            return (Criteria) this;
        }

        public Criteria andDealSeqNoNotBetween(String value1, String value2) {
            addCriterion("DEAL_SEQ_NO not between", value1, value2, "dealSeqNo");
            return (Criteria) this;
        }

        public Criteria andDealStationIsNull() {
            addCriterion("DEAL_STATION is null");
            return (Criteria) this;
        }

        public Criteria andDealStationIsNotNull() {
            addCriterion("DEAL_STATION is not null");
            return (Criteria) this;
        }

        public Criteria andDealStationEqualTo(String value) {
            addCriterion("DEAL_STATION =", value, "dealStation");
            return (Criteria) this;
        }

        public Criteria andDealStationNotEqualTo(String value) {
            addCriterion("DEAL_STATION <>", value, "dealStation");
            return (Criteria) this;
        }

        public Criteria andDealStationGreaterThan(String value) {
            addCriterion("DEAL_STATION >", value, "dealStation");
            return (Criteria) this;
        }

        public Criteria andDealStationGreaterThanOrEqualTo(String value) {
            addCriterion("DEAL_STATION >=", value, "dealStation");
            return (Criteria) this;
        }

        public Criteria andDealStationLessThan(String value) {
            addCriterion("DEAL_STATION <", value, "dealStation");
            return (Criteria) this;
        }

        public Criteria andDealStationLessThanOrEqualTo(String value) {
            addCriterion("DEAL_STATION <=", value, "dealStation");
            return (Criteria) this;
        }

        public Criteria andDealStationLike(String value) {
            addCriterion("DEAL_STATION like", value, "dealStation");
            return (Criteria) this;
        }

        public Criteria andDealStationNotLike(String value) {
            addCriterion("DEAL_STATION not like", value, "dealStation");
            return (Criteria) this;
        }

        public Criteria andDealStationIn(List<String> values) {
            addCriterion("DEAL_STATION in", values, "dealStation");
            return (Criteria) this;
        }

        public Criteria andDealStationNotIn(List<String> values) {
            addCriterion("DEAL_STATION not in", values, "dealStation");
            return (Criteria) this;
        }

        public Criteria andDealStationBetween(String value1, String value2) {
            addCriterion("DEAL_STATION between", value1, value2, "dealStation");
            return (Criteria) this;
        }

        public Criteria andDealStationNotBetween(String value1, String value2) {
            addCriterion("DEAL_STATION not between", value1, value2, "dealStation");
            return (Criteria) this;
        }

        public Criteria andDealTypeIsNull() {
            addCriterion("DEAL_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andDealTypeIsNotNull() {
            addCriterion("DEAL_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDealTypeEqualTo(String value) {
            addCriterion("DEAL_TYPE =", value, "dealType");
            return (Criteria) this;
        }

        public Criteria andDealTypeNotEqualTo(String value) {
            addCriterion("DEAL_TYPE <>", value, "dealType");
            return (Criteria) this;
        }

        public Criteria andDealTypeGreaterThan(String value) {
            addCriterion("DEAL_TYPE >", value, "dealType");
            return (Criteria) this;
        }

        public Criteria andDealTypeGreaterThanOrEqualTo(String value) {
            addCriterion("DEAL_TYPE >=", value, "dealType");
            return (Criteria) this;
        }

        public Criteria andDealTypeLessThan(String value) {
            addCriterion("DEAL_TYPE <", value, "dealType");
            return (Criteria) this;
        }

        public Criteria andDealTypeLessThanOrEqualTo(String value) {
            addCriterion("DEAL_TYPE <=", value, "dealType");
            return (Criteria) this;
        }

        public Criteria andDealTypeLike(String value) {
            addCriterion("DEAL_TYPE like", value, "dealType");
            return (Criteria) this;
        }

        public Criteria andDealTypeNotLike(String value) {
            addCriterion("DEAL_TYPE not like", value, "dealType");
            return (Criteria) this;
        }

        public Criteria andDealTypeIn(List<String> values) {
            addCriterion("DEAL_TYPE in", values, "dealType");
            return (Criteria) this;
        }

        public Criteria andDealTypeNotIn(List<String> values) {
            addCriterion("DEAL_TYPE not in", values, "dealType");
            return (Criteria) this;
        }

        public Criteria andDealTypeBetween(String value1, String value2) {
            addCriterion("DEAL_TYPE between", value1, value2, "dealType");
            return (Criteria) this;
        }

        public Criteria andDealTypeNotBetween(String value1, String value2) {
            addCriterion("DEAL_TYPE not between", value1, value2, "dealType");
            return (Criteria) this;
        }

        public Criteria andMainTypeIsNull() {
            addCriterion("MAIN_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andMainTypeIsNotNull() {
            addCriterion("MAIN_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andMainTypeEqualTo(String value) {
            addCriterion("MAIN_TYPE =", value, "mainType");
            return (Criteria) this;
        }

        public Criteria andMainTypeNotEqualTo(String value) {
            addCriterion("MAIN_TYPE <>", value, "mainType");
            return (Criteria) this;
        }

        public Criteria andMainTypeGreaterThan(String value) {
            addCriterion("MAIN_TYPE >", value, "mainType");
            return (Criteria) this;
        }

        public Criteria andMainTypeGreaterThanOrEqualTo(String value) {
            addCriterion("MAIN_TYPE >=", value, "mainType");
            return (Criteria) this;
        }

        public Criteria andMainTypeLessThan(String value) {
            addCriterion("MAIN_TYPE <", value, "mainType");
            return (Criteria) this;
        }

        public Criteria andMainTypeLessThanOrEqualTo(String value) {
            addCriterion("MAIN_TYPE <=", value, "mainType");
            return (Criteria) this;
        }

        public Criteria andMainTypeLike(String value) {
            addCriterion("MAIN_TYPE like", value, "mainType");
            return (Criteria) this;
        }

        public Criteria andMainTypeNotLike(String value) {
            addCriterion("MAIN_TYPE not like", value, "mainType");
            return (Criteria) this;
        }

        public Criteria andMainTypeIn(List<String> values) {
            addCriterion("MAIN_TYPE in", values, "mainType");
            return (Criteria) this;
        }

        public Criteria andMainTypeNotIn(List<String> values) {
            addCriterion("MAIN_TYPE not in", values, "mainType");
            return (Criteria) this;
        }

        public Criteria andMainTypeBetween(String value1, String value2) {
            addCriterion("MAIN_TYPE between", value1, value2, "mainType");
            return (Criteria) this;
        }

        public Criteria andMainTypeNotBetween(String value1, String value2) {
            addCriterion("MAIN_TYPE not between", value1, value2, "mainType");
            return (Criteria) this;
        }

        public Criteria andSubTypeIsNull() {
            addCriterion("SUB_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andSubTypeIsNotNull() {
            addCriterion("SUB_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSubTypeEqualTo(String value) {
            addCriterion("SUB_TYPE =", value, "subType");
            return (Criteria) this;
        }

        public Criteria andSubTypeNotEqualTo(String value) {
            addCriterion("SUB_TYPE <>", value, "subType");
            return (Criteria) this;
        }

        public Criteria andSubTypeGreaterThan(String value) {
            addCriterion("SUB_TYPE >", value, "subType");
            return (Criteria) this;
        }

        public Criteria andSubTypeGreaterThanOrEqualTo(String value) {
            addCriterion("SUB_TYPE >=", value, "subType");
            return (Criteria) this;
        }

        public Criteria andSubTypeLessThan(String value) {
            addCriterion("SUB_TYPE <", value, "subType");
            return (Criteria) this;
        }

        public Criteria andSubTypeLessThanOrEqualTo(String value) {
            addCriterion("SUB_TYPE <=", value, "subType");
            return (Criteria) this;
        }

        public Criteria andSubTypeLike(String value) {
            addCriterion("SUB_TYPE like", value, "subType");
            return (Criteria) this;
        }

        public Criteria andSubTypeNotLike(String value) {
            addCriterion("SUB_TYPE not like", value, "subType");
            return (Criteria) this;
        }

        public Criteria andSubTypeIn(List<String> values) {
            addCriterion("SUB_TYPE in", values, "subType");
            return (Criteria) this;
        }

        public Criteria andSubTypeNotIn(List<String> values) {
            addCriterion("SUB_TYPE not in", values, "subType");
            return (Criteria) this;
        }

        public Criteria andSubTypeBetween(String value1, String value2) {
            addCriterion("SUB_TYPE between", value1, value2, "subType");
            return (Criteria) this;
        }

        public Criteria andSubTypeNotBetween(String value1, String value2) {
            addCriterion("SUB_TYPE not between", value1, value2, "subType");
            return (Criteria) this;
        }

        public Criteria andAreaCodeIsNull() {
            addCriterion("AREA_CODE is null");
            return (Criteria) this;
        }

        public Criteria andAreaCodeIsNotNull() {
            addCriterion("AREA_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andAreaCodeEqualTo(String value) {
            addCriterion("AREA_CODE =", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotEqualTo(String value) {
            addCriterion("AREA_CODE <>", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeGreaterThan(String value) {
            addCriterion("AREA_CODE >", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeGreaterThanOrEqualTo(String value) {
            addCriterion("AREA_CODE >=", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeLessThan(String value) {
            addCriterion("AREA_CODE <", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeLessThanOrEqualTo(String value) {
            addCriterion("AREA_CODE <=", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeLike(String value) {
            addCriterion("AREA_CODE like", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotLike(String value) {
            addCriterion("AREA_CODE not like", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeIn(List<String> values) {
            addCriterion("AREA_CODE in", values, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotIn(List<String> values) {
            addCriterion("AREA_CODE not in", values, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeBetween(String value1, String value2) {
            addCriterion("AREA_CODE between", value1, value2, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotBetween(String value1, String value2) {
            addCriterion("AREA_CODE not between", value1, value2, "areaCode");
            return (Criteria) this;
        }

        public Criteria andSamCodeIsNull() {
            addCriterion("SAM_CODE is null");
            return (Criteria) this;
        }

        public Criteria andSamCodeIsNotNull() {
            addCriterion("SAM_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andSamCodeEqualTo(String value) {
            addCriterion("SAM_CODE =", value, "samCode");
            return (Criteria) this;
        }

        public Criteria andSamCodeNotEqualTo(String value) {
            addCriterion("SAM_CODE <>", value, "samCode");
            return (Criteria) this;
        }

        public Criteria andSamCodeGreaterThan(String value) {
            addCriterion("SAM_CODE >", value, "samCode");
            return (Criteria) this;
        }

        public Criteria andSamCodeGreaterThanOrEqualTo(String value) {
            addCriterion("SAM_CODE >=", value, "samCode");
            return (Criteria) this;
        }

        public Criteria andSamCodeLessThan(String value) {
            addCriterion("SAM_CODE <", value, "samCode");
            return (Criteria) this;
        }

        public Criteria andSamCodeLessThanOrEqualTo(String value) {
            addCriterion("SAM_CODE <=", value, "samCode");
            return (Criteria) this;
        }

        public Criteria andSamCodeLike(String value) {
            addCriterion("SAM_CODE like", value, "samCode");
            return (Criteria) this;
        }

        public Criteria andSamCodeNotLike(String value) {
            addCriterion("SAM_CODE not like", value, "samCode");
            return (Criteria) this;
        }

        public Criteria andSamCodeIn(List<String> values) {
            addCriterion("SAM_CODE in", values, "samCode");
            return (Criteria) this;
        }

        public Criteria andSamCodeNotIn(List<String> values) {
            addCriterion("SAM_CODE not in", values, "samCode");
            return (Criteria) this;
        }

        public Criteria andSamCodeBetween(String value1, String value2) {
            addCriterion("SAM_CODE between", value1, value2, "samCode");
            return (Criteria) this;
        }

        public Criteria andSamCodeNotBetween(String value1, String value2) {
            addCriterion("SAM_CODE not between", value1, value2, "samCode");
            return (Criteria) this;
        }

        public Criteria andLogicalCodeIsNull() {
            addCriterion("LOGICAL_CODE is null");
            return (Criteria) this;
        }

        public Criteria andLogicalCodeIsNotNull() {
            addCriterion("LOGICAL_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andLogicalCodeEqualTo(String value) {
            addCriterion("LOGICAL_CODE =", value, "logicalCode");
            return (Criteria) this;
        }

        public Criteria andLogicalCodeNotEqualTo(String value) {
            addCriterion("LOGICAL_CODE <>", value, "logicalCode");
            return (Criteria) this;
        }

        public Criteria andLogicalCodeGreaterThan(String value) {
            addCriterion("LOGICAL_CODE >", value, "logicalCode");
            return (Criteria) this;
        }

        public Criteria andLogicalCodeGreaterThanOrEqualTo(String value) {
            addCriterion("LOGICAL_CODE >=", value, "logicalCode");
            return (Criteria) this;
        }

        public Criteria andLogicalCodeLessThan(String value) {
            addCriterion("LOGICAL_CODE <", value, "logicalCode");
            return (Criteria) this;
        }

        public Criteria andLogicalCodeLessThanOrEqualTo(String value) {
            addCriterion("LOGICAL_CODE <=", value, "logicalCode");
            return (Criteria) this;
        }

        public Criteria andLogicalCodeLike(String value) {
            addCriterion("LOGICAL_CODE like", value, "logicalCode");
            return (Criteria) this;
        }

        public Criteria andLogicalCodeNotLike(String value) {
            addCriterion("LOGICAL_CODE not like", value, "logicalCode");
            return (Criteria) this;
        }

        public Criteria andLogicalCodeIn(List<String> values) {
            addCriterion("LOGICAL_CODE in", values, "logicalCode");
            return (Criteria) this;
        }

        public Criteria andLogicalCodeNotIn(List<String> values) {
            addCriterion("LOGICAL_CODE not in", values, "logicalCode");
            return (Criteria) this;
        }

        public Criteria andLogicalCodeBetween(String value1, String value2) {
            addCriterion("LOGICAL_CODE between", value1, value2, "logicalCode");
            return (Criteria) this;
        }

        public Criteria andLogicalCodeNotBetween(String value1, String value2) {
            addCriterion("LOGICAL_CODE not between", value1, value2, "logicalCode");
            return (Criteria) this;
        }

        public Criteria andReadCountIsNull() {
            addCriterion("READ_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andReadCountIsNotNull() {
            addCriterion("READ_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andReadCountEqualTo(Integer value) {
            addCriterion("READ_COUNT =", value, "readCount");
            return (Criteria) this;
        }

        public Criteria andReadCountNotEqualTo(Integer value) {
            addCriterion("READ_COUNT <>", value, "readCount");
            return (Criteria) this;
        }

        public Criteria andReadCountGreaterThan(Integer value) {
            addCriterion("READ_COUNT >", value, "readCount");
            return (Criteria) this;
        }

        public Criteria andReadCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("READ_COUNT >=", value, "readCount");
            return (Criteria) this;
        }

        public Criteria andReadCountLessThan(Integer value) {
            addCriterion("READ_COUNT <", value, "readCount");
            return (Criteria) this;
        }

        public Criteria andReadCountLessThanOrEqualTo(Integer value) {
            addCriterion("READ_COUNT <=", value, "readCount");
            return (Criteria) this;
        }

        public Criteria andReadCountIn(List<Integer> values) {
            addCriterion("READ_COUNT in", values, "readCount");
            return (Criteria) this;
        }

        public Criteria andReadCountNotIn(List<Integer> values) {
            addCriterion("READ_COUNT not in", values, "readCount");
            return (Criteria) this;
        }

        public Criteria andReadCountBetween(Integer value1, Integer value2) {
            addCriterion("READ_COUNT between", value1, value2, "readCount");
            return (Criteria) this;
        }

        public Criteria andReadCountNotBetween(Integer value1, Integer value2) {
            addCriterion("READ_COUNT not between", value1, value2, "readCount");
            return (Criteria) this;
        }

        public Criteria andDealAmountIsNull() {
            addCriterion("DEAL_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andDealAmountIsNotNull() {
            addCriterion("DEAL_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andDealAmountEqualTo(BigDecimal value) {
            addCriterion("DEAL_AMOUNT =", value, "dealAmount");
            return (Criteria) this;
        }

        public Criteria andDealAmountNotEqualTo(BigDecimal value) {
            addCriterion("DEAL_AMOUNT <>", value, "dealAmount");
            return (Criteria) this;
        }

        public Criteria andDealAmountGreaterThan(BigDecimal value) {
            addCriterion("DEAL_AMOUNT >", value, "dealAmount");
            return (Criteria) this;
        }

        public Criteria andDealAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DEAL_AMOUNT >=", value, "dealAmount");
            return (Criteria) this;
        }

        public Criteria andDealAmountLessThan(BigDecimal value) {
            addCriterion("DEAL_AMOUNT <", value, "dealAmount");
            return (Criteria) this;
        }

        public Criteria andDealAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DEAL_AMOUNT <=", value, "dealAmount");
            return (Criteria) this;
        }

        public Criteria andDealAmountIn(List<BigDecimal> values) {
            addCriterion("DEAL_AMOUNT in", values, "dealAmount");
            return (Criteria) this;
        }

        public Criteria andDealAmountNotIn(List<BigDecimal> values) {
            addCriterion("DEAL_AMOUNT not in", values, "dealAmount");
            return (Criteria) this;
        }

        public Criteria andDealAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DEAL_AMOUNT between", value1, value2, "dealAmount");
            return (Criteria) this;
        }

        public Criteria andDealAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DEAL_AMOUNT not between", value1, value2, "dealAmount");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNull() {
            addCriterion("BALANCE is null");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNotNull() {
            addCriterion("BALANCE is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceEqualTo(BigDecimal value) {
            addCriterion("BALANCE =", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotEqualTo(BigDecimal value) {
            addCriterion("BALANCE <>", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThan(BigDecimal value) {
            addCriterion("BALANCE >", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BALANCE >=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThan(BigDecimal value) {
            addCriterion("BALANCE <", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BALANCE <=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceIn(List<BigDecimal> values) {
            addCriterion("BALANCE in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotIn(List<BigDecimal> values) {
            addCriterion("BALANCE not in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BALANCE between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BALANCE not between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andDealTimeIsNull() {
            addCriterion("DEAL_TIME is null");
            return (Criteria) this;
        }

        public Criteria andDealTimeIsNotNull() {
            addCriterion("DEAL_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andDealTimeEqualTo(Date value) {
            addCriterion("DEAL_TIME =", value, "dealTime");
            return (Criteria) this;
        }

        public Criteria andDealTimeNotEqualTo(Date value) {
            addCriterion("DEAL_TIME <>", value, "dealTime");
            return (Criteria) this;
        }

        public Criteria andDealTimeGreaterThan(Date value) {
            addCriterion("DEAL_TIME >", value, "dealTime");
            return (Criteria) this;
        }

        public Criteria andDealTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("DEAL_TIME >=", value, "dealTime");
            return (Criteria) this;
        }

        public Criteria andDealTimeLessThan(Date value) {
            addCriterion("DEAL_TIME <", value, "dealTime");
            return (Criteria) this;
        }

        public Criteria andDealTimeLessThanOrEqualTo(Date value) {
            addCriterion("DEAL_TIME <=", value, "dealTime");
            return (Criteria) this;
        }

        public Criteria andDealTimeIn(List<Date> values) {
            addCriterion("DEAL_TIME in", values, "dealTime");
            return (Criteria) this;
        }

        public Criteria andDealTimeNotIn(List<Date> values) {
            addCriterion("DEAL_TIME not in", values, "dealTime");
            return (Criteria) this;
        }

        public Criteria andDealTimeBetween(Date value1, Date value2) {
            addCriterion("DEAL_TIME between", value1, value2, "dealTime");
            return (Criteria) this;
        }

        public Criteria andDealTimeNotBetween(Date value1, Date value2) {
            addCriterion("DEAL_TIME not between", value1, value2, "dealTime");
            return (Criteria) this;
        }

        public Criteria andTacIsNull() {
            addCriterion("TAC is null");
            return (Criteria) this;
        }

        public Criteria andTacIsNotNull() {
            addCriterion("TAC is not null");
            return (Criteria) this;
        }

        public Criteria andTacEqualTo(String value) {
            addCriterion("TAC =", value, "tac");
            return (Criteria) this;
        }

        public Criteria andTacNotEqualTo(String value) {
            addCriterion("TAC <>", value, "tac");
            return (Criteria) this;
        }

        public Criteria andTacGreaterThan(String value) {
            addCriterion("TAC >", value, "tac");
            return (Criteria) this;
        }

        public Criteria andTacGreaterThanOrEqualTo(String value) {
            addCriterion("TAC >=", value, "tac");
            return (Criteria) this;
        }

        public Criteria andTacLessThan(String value) {
            addCriterion("TAC <", value, "tac");
            return (Criteria) this;
        }

        public Criteria andTacLessThanOrEqualTo(String value) {
            addCriterion("TAC <=", value, "tac");
            return (Criteria) this;
        }

        public Criteria andTacLike(String value) {
            addCriterion("TAC like", value, "tac");
            return (Criteria) this;
        }

        public Criteria andTacNotLike(String value) {
            addCriterion("TAC not like", value, "tac");
            return (Criteria) this;
        }

        public Criteria andTacIn(List<String> values) {
            addCriterion("TAC in", values, "tac");
            return (Criteria) this;
        }

        public Criteria andTacNotIn(List<String> values) {
            addCriterion("TAC not in", values, "tac");
            return (Criteria) this;
        }

        public Criteria andTacBetween(String value1, String value2) {
            addCriterion("TAC between", value1, value2, "tac");
            return (Criteria) this;
        }

        public Criteria andTacNotBetween(String value1, String value2) {
            addCriterion("TAC not between", value1, value2, "tac");
            return (Criteria) this;
        }

        public Criteria andOperationDateIsNull() {
            addCriterion("OPERATION_DATE is null");
            return (Criteria) this;
        }

        public Criteria andOperationDateIsNotNull() {
            addCriterion("OPERATION_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andOperationDateEqualTo(Date value) {
            addCriterion("OPERATION_DATE =", value, "operationDate");
            return (Criteria) this;
        }

        public Criteria andOperationDateNotEqualTo(Date value) {
            addCriterion("OPERATION_DATE <>", value, "operationDate");
            return (Criteria) this;
        }

        public Criteria andOperationDateGreaterThan(Date value) {
            addCriterion("OPERATION_DATE >", value, "operationDate");
            return (Criteria) this;
        }

        public Criteria andOperationDateGreaterThanOrEqualTo(Date value) {
            addCriterion("OPERATION_DATE >=", value, "operationDate");
            return (Criteria) this;
        }

        public Criteria andOperationDateLessThan(Date value) {
            addCriterion("OPERATION_DATE <", value, "operationDate");
            return (Criteria) this;
        }

        public Criteria andOperationDateLessThanOrEqualTo(Date value) {
            addCriterion("OPERATION_DATE <=", value, "operationDate");
            return (Criteria) this;
        }

        public Criteria andOperationDateIn(List<Date> values) {
            addCriterion("OPERATION_DATE in", values, "operationDate");
            return (Criteria) this;
        }

        public Criteria andOperationDateNotIn(List<Date> values) {
            addCriterion("OPERATION_DATE not in", values, "operationDate");
            return (Criteria) this;
        }

        public Criteria andOperationDateBetween(Date value1, Date value2) {
            addCriterion("OPERATION_DATE between", value1, value2, "operationDate");
            return (Criteria) this;
        }

        public Criteria andOperationDateNotBetween(Date value1, Date value2) {
            addCriterion("OPERATION_DATE not between", value1, value2, "operationDate");
            return (Criteria) this;
        }

        public Criteria andDealModeIsNull() {
            addCriterion("DEAL_MODE is null");
            return (Criteria) this;
        }

        public Criteria andDealModeIsNotNull() {
            addCriterion("DEAL_MODE is not null");
            return (Criteria) this;
        }

        public Criteria andDealModeEqualTo(String value) {
            addCriterion("DEAL_MODE =", value, "dealMode");
            return (Criteria) this;
        }

        public Criteria andDealModeNotEqualTo(String value) {
            addCriterion("DEAL_MODE <>", value, "dealMode");
            return (Criteria) this;
        }

        public Criteria andDealModeGreaterThan(String value) {
            addCriterion("DEAL_MODE >", value, "dealMode");
            return (Criteria) this;
        }

        public Criteria andDealModeGreaterThanOrEqualTo(String value) {
            addCriterion("DEAL_MODE >=", value, "dealMode");
            return (Criteria) this;
        }

        public Criteria andDealModeLessThan(String value) {
            addCriterion("DEAL_MODE <", value, "dealMode");
            return (Criteria) this;
        }

        public Criteria andDealModeLessThanOrEqualTo(String value) {
            addCriterion("DEAL_MODE <=", value, "dealMode");
            return (Criteria) this;
        }

        public Criteria andDealModeLike(String value) {
            addCriterion("DEAL_MODE like", value, "dealMode");
            return (Criteria) this;
        }

        public Criteria andDealModeNotLike(String value) {
            addCriterion("DEAL_MODE not like", value, "dealMode");
            return (Criteria) this;
        }

        public Criteria andDealModeIn(List<String> values) {
            addCriterion("DEAL_MODE in", values, "dealMode");
            return (Criteria) this;
        }

        public Criteria andDealModeNotIn(List<String> values) {
            addCriterion("DEAL_MODE not in", values, "dealMode");
            return (Criteria) this;
        }

        public Criteria andDealModeBetween(String value1, String value2) {
            addCriterion("DEAL_MODE between", value1, value2, "dealMode");
            return (Criteria) this;
        }

        public Criteria andDealModeNotBetween(String value1, String value2) {
            addCriterion("DEAL_MODE not between", value1, value2, "dealMode");
            return (Criteria) this;
        }

        public Criteria andRecFlagIsNull() {
            addCriterion("REC_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andRecFlagIsNotNull() {
            addCriterion("REC_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andRecFlagEqualTo(String value) {
            addCriterion("REC_FLAG =", value, "recFlag");
            return (Criteria) this;
        }

        public Criteria andRecFlagNotEqualTo(String value) {
            addCriterion("REC_FLAG <>", value, "recFlag");
            return (Criteria) this;
        }

        public Criteria andRecFlagGreaterThan(String value) {
            addCriterion("REC_FLAG >", value, "recFlag");
            return (Criteria) this;
        }

        public Criteria andRecFlagGreaterThanOrEqualTo(String value) {
            addCriterion("REC_FLAG >=", value, "recFlag");
            return (Criteria) this;
        }

        public Criteria andRecFlagLessThan(String value) {
            addCriterion("REC_FLAG <", value, "recFlag");
            return (Criteria) this;
        }

        public Criteria andRecFlagLessThanOrEqualTo(String value) {
            addCriterion("REC_FLAG <=", value, "recFlag");
            return (Criteria) this;
        }

        public Criteria andRecFlagLike(String value) {
            addCriterion("REC_FLAG like", value, "recFlag");
            return (Criteria) this;
        }

        public Criteria andRecFlagNotLike(String value) {
            addCriterion("REC_FLAG not like", value, "recFlag");
            return (Criteria) this;
        }

        public Criteria andRecFlagIn(List<String> values) {
            addCriterion("REC_FLAG in", values, "recFlag");
            return (Criteria) this;
        }

        public Criteria andRecFlagNotIn(List<String> values) {
            addCriterion("REC_FLAG not in", values, "recFlag");
            return (Criteria) this;
        }

        public Criteria andRecFlagBetween(String value1, String value2) {
            addCriterion("REC_FLAG between", value1, value2, "recFlag");
            return (Criteria) this;
        }

        public Criteria andRecFlagNotBetween(String value1, String value2) {
            addCriterion("REC_FLAG not between", value1, value2, "recFlag");
            return (Criteria) this;
        }

        public Criteria andMatchFlagIsNull() {
            addCriterion("MATCH_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andMatchFlagIsNotNull() {
            addCriterion("MATCH_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andMatchFlagEqualTo(String value) {
            addCriterion("MATCH_FLAG =", value, "matchFlag");
            return (Criteria) this;
        }

        public Criteria andMatchFlagNotEqualTo(String value) {
            addCriterion("MATCH_FLAG <>", value, "matchFlag");
            return (Criteria) this;
        }

        public Criteria andMatchFlagGreaterThan(String value) {
            addCriterion("MATCH_FLAG >", value, "matchFlag");
            return (Criteria) this;
        }

        public Criteria andMatchFlagGreaterThanOrEqualTo(String value) {
            addCriterion("MATCH_FLAG >=", value, "matchFlag");
            return (Criteria) this;
        }

        public Criteria andMatchFlagLessThan(String value) {
            addCriterion("MATCH_FLAG <", value, "matchFlag");
            return (Criteria) this;
        }

        public Criteria andMatchFlagLessThanOrEqualTo(String value) {
            addCriterion("MATCH_FLAG <=", value, "matchFlag");
            return (Criteria) this;
        }

        public Criteria andMatchFlagLike(String value) {
            addCriterion("MATCH_FLAG like", value, "matchFlag");
            return (Criteria) this;
        }

        public Criteria andMatchFlagNotLike(String value) {
            addCriterion("MATCH_FLAG not like", value, "matchFlag");
            return (Criteria) this;
        }

        public Criteria andMatchFlagIn(List<String> values) {
            addCriterion("MATCH_FLAG in", values, "matchFlag");
            return (Criteria) this;
        }

        public Criteria andMatchFlagNotIn(List<String> values) {
            addCriterion("MATCH_FLAG not in", values, "matchFlag");
            return (Criteria) this;
        }

        public Criteria andMatchFlagBetween(String value1, String value2) {
            addCriterion("MATCH_FLAG between", value1, value2, "matchFlag");
            return (Criteria) this;
        }

        public Criteria andMatchFlagNotBetween(String value1, String value2) {
            addCriterion("MATCH_FLAG not between", value1, value2, "matchFlag");
            return (Criteria) this;
        }

        public Criteria andMatchTimeIsNull() {
            addCriterion("MATCH_TIME is null");
            return (Criteria) this;
        }

        public Criteria andMatchTimeIsNotNull() {
            addCriterion("MATCH_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andMatchTimeEqualTo(Date value) {
            addCriterion("MATCH_TIME =", value, "matchTime");
            return (Criteria) this;
        }

        public Criteria andMatchTimeNotEqualTo(Date value) {
            addCriterion("MATCH_TIME <>", value, "matchTime");
            return (Criteria) this;
        }

        public Criteria andMatchTimeGreaterThan(Date value) {
            addCriterion("MATCH_TIME >", value, "matchTime");
            return (Criteria) this;
        }

        public Criteria andMatchTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("MATCH_TIME >=", value, "matchTime");
            return (Criteria) this;
        }

        public Criteria andMatchTimeLessThan(Date value) {
            addCriterion("MATCH_TIME <", value, "matchTime");
            return (Criteria) this;
        }

        public Criteria andMatchTimeLessThanOrEqualTo(Date value) {
            addCriterion("MATCH_TIME <=", value, "matchTime");
            return (Criteria) this;
        }

        public Criteria andMatchTimeIn(List<Date> values) {
            addCriterion("MATCH_TIME in", values, "matchTime");
            return (Criteria) this;
        }

        public Criteria andMatchTimeNotIn(List<Date> values) {
            addCriterion("MATCH_TIME not in", values, "matchTime");
            return (Criteria) this;
        }

        public Criteria andMatchTimeBetween(Date value1, Date value2) {
            addCriterion("MATCH_TIME between", value1, value2, "matchTime");
            return (Criteria) this;
        }

        public Criteria andMatchTimeNotBetween(Date value1, Date value2) {
            addCriterion("MATCH_TIME not between", value1, value2, "matchTime");
            return (Criteria) this;
        }

        public Criteria andAccFlagIsNull() {
            addCriterion("ACC_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andAccFlagIsNotNull() {
            addCriterion("ACC_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andAccFlagEqualTo(String value) {
            addCriterion("ACC_FLAG =", value, "accFlag");
            return (Criteria) this;
        }

        public Criteria andAccFlagNotEqualTo(String value) {
            addCriterion("ACC_FLAG <>", value, "accFlag");
            return (Criteria) this;
        }

        public Criteria andAccFlagGreaterThan(String value) {
            addCriterion("ACC_FLAG >", value, "accFlag");
            return (Criteria) this;
        }

        public Criteria andAccFlagGreaterThanOrEqualTo(String value) {
            addCriterion("ACC_FLAG >=", value, "accFlag");
            return (Criteria) this;
        }

        public Criteria andAccFlagLessThan(String value) {
            addCriterion("ACC_FLAG <", value, "accFlag");
            return (Criteria) this;
        }

        public Criteria andAccFlagLessThanOrEqualTo(String value) {
            addCriterion("ACC_FLAG <=", value, "accFlag");
            return (Criteria) this;
        }

        public Criteria andAccFlagLike(String value) {
            addCriterion("ACC_FLAG like", value, "accFlag");
            return (Criteria) this;
        }

        public Criteria andAccFlagNotLike(String value) {
            addCriterion("ACC_FLAG not like", value, "accFlag");
            return (Criteria) this;
        }

        public Criteria andAccFlagIn(List<String> values) {
            addCriterion("ACC_FLAG in", values, "accFlag");
            return (Criteria) this;
        }

        public Criteria andAccFlagNotIn(List<String> values) {
            addCriterion("ACC_FLAG not in", values, "accFlag");
            return (Criteria) this;
        }

        public Criteria andAccFlagBetween(String value1, String value2) {
            addCriterion("ACC_FLAG between", value1, value2, "accFlag");
            return (Criteria) this;
        }

        public Criteria andAccFlagNotBetween(String value1, String value2) {
            addCriterion("ACC_FLAG not between", value1, value2, "accFlag");
            return (Criteria) this;
        }

        public Criteria andAccFileNameIsNull() {
            addCriterion("ACC_FILE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andAccFileNameIsNotNull() {
            addCriterion("ACC_FILE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andAccFileNameEqualTo(String value) {
            addCriterion("ACC_FILE_NAME =", value, "accFileName");
            return (Criteria) this;
        }

        public Criteria andAccFileNameNotEqualTo(String value) {
            addCriterion("ACC_FILE_NAME <>", value, "accFileName");
            return (Criteria) this;
        }

        public Criteria andAccFileNameGreaterThan(String value) {
            addCriterion("ACC_FILE_NAME >", value, "accFileName");
            return (Criteria) this;
        }

        public Criteria andAccFileNameGreaterThanOrEqualTo(String value) {
            addCriterion("ACC_FILE_NAME >=", value, "accFileName");
            return (Criteria) this;
        }

        public Criteria andAccFileNameLessThan(String value) {
            addCriterion("ACC_FILE_NAME <", value, "accFileName");
            return (Criteria) this;
        }

        public Criteria andAccFileNameLessThanOrEqualTo(String value) {
            addCriterion("ACC_FILE_NAME <=", value, "accFileName");
            return (Criteria) this;
        }

        public Criteria andAccFileNameLike(String value) {
            addCriterion("ACC_FILE_NAME like", value, "accFileName");
            return (Criteria) this;
        }

        public Criteria andAccFileNameNotLike(String value) {
            addCriterion("ACC_FILE_NAME not like", value, "accFileName");
            return (Criteria) this;
        }

        public Criteria andAccFileNameIn(List<String> values) {
            addCriterion("ACC_FILE_NAME in", values, "accFileName");
            return (Criteria) this;
        }

        public Criteria andAccFileNameNotIn(List<String> values) {
            addCriterion("ACC_FILE_NAME not in", values, "accFileName");
            return (Criteria) this;
        }

        public Criteria andAccFileNameBetween(String value1, String value2) {
            addCriterion("ACC_FILE_NAME between", value1, value2, "accFileName");
            return (Criteria) this;
        }

        public Criteria andAccFileNameNotBetween(String value1, String value2) {
            addCriterion("ACC_FILE_NAME not between", value1, value2, "accFileName");
            return (Criteria) this;
        }

        public Criteria andAccFileTimeIsNull() {
            addCriterion("ACC_FILE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andAccFileTimeIsNotNull() {
            addCriterion("ACC_FILE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andAccFileTimeEqualTo(Date value) {
            addCriterion("ACC_FILE_TIME =", value, "accFileTime");
            return (Criteria) this;
        }

        public Criteria andAccFileTimeNotEqualTo(Date value) {
            addCriterion("ACC_FILE_TIME <>", value, "accFileTime");
            return (Criteria) this;
        }

        public Criteria andAccFileTimeGreaterThan(Date value) {
            addCriterion("ACC_FILE_TIME >", value, "accFileTime");
            return (Criteria) this;
        }

        public Criteria andAccFileTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ACC_FILE_TIME >=", value, "accFileTime");
            return (Criteria) this;
        }

        public Criteria andAccFileTimeLessThan(Date value) {
            addCriterion("ACC_FILE_TIME <", value, "accFileTime");
            return (Criteria) this;
        }

        public Criteria andAccFileTimeLessThanOrEqualTo(Date value) {
            addCriterion("ACC_FILE_TIME <=", value, "accFileTime");
            return (Criteria) this;
        }

        public Criteria andAccFileTimeIn(List<Date> values) {
            addCriterion("ACC_FILE_TIME in", values, "accFileTime");
            return (Criteria) this;
        }

        public Criteria andAccFileTimeNotIn(List<Date> values) {
            addCriterion("ACC_FILE_TIME not in", values, "accFileTime");
            return (Criteria) this;
        }

        public Criteria andAccFileTimeBetween(Date value1, Date value2) {
            addCriterion("ACC_FILE_TIME between", value1, value2, "accFileTime");
            return (Criteria) this;
        }

        public Criteria andAccFileTimeNotBetween(Date value1, Date value2) {
            addCriterion("ACC_FILE_TIME not between", value1, value2, "accFileTime");
            return (Criteria) this;
        }

        public Criteria andAccFileLineCodeIsNull() {
            addCriterion("ACC_FILE_LINE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andAccFileLineCodeIsNotNull() {
            addCriterion("ACC_FILE_LINE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andAccFileLineCodeEqualTo(Long value) {
            addCriterion("ACC_FILE_LINE_CODE =", value, "accFileLineCode");
            return (Criteria) this;
        }

        public Criteria andAccFileLineCodeNotEqualTo(Long value) {
            addCriterion("ACC_FILE_LINE_CODE <>", value, "accFileLineCode");
            return (Criteria) this;
        }

        public Criteria andAccFileLineCodeGreaterThan(Long value) {
            addCriterion("ACC_FILE_LINE_CODE >", value, "accFileLineCode");
            return (Criteria) this;
        }

        public Criteria andAccFileLineCodeGreaterThanOrEqualTo(Long value) {
            addCriterion("ACC_FILE_LINE_CODE >=", value, "accFileLineCode");
            return (Criteria) this;
        }

        public Criteria andAccFileLineCodeLessThan(Long value) {
            addCriterion("ACC_FILE_LINE_CODE <", value, "accFileLineCode");
            return (Criteria) this;
        }

        public Criteria andAccFileLineCodeLessThanOrEqualTo(Long value) {
            addCriterion("ACC_FILE_LINE_CODE <=", value, "accFileLineCode");
            return (Criteria) this;
        }

        public Criteria andAccFileLineCodeIn(List<Long> values) {
            addCriterion("ACC_FILE_LINE_CODE in", values, "accFileLineCode");
            return (Criteria) this;
        }

        public Criteria andAccFileLineCodeNotIn(List<Long> values) {
            addCriterion("ACC_FILE_LINE_CODE not in", values, "accFileLineCode");
            return (Criteria) this;
        }

        public Criteria andAccFileLineCodeBetween(Long value1, Long value2) {
            addCriterion("ACC_FILE_LINE_CODE between", value1, value2, "accFileLineCode");
            return (Criteria) this;
        }

        public Criteria andAccFileLineCodeNotBetween(Long value1, Long value2) {
            addCriterion("ACC_FILE_LINE_CODE not between", value1, value2, "accFileLineCode");
            return (Criteria) this;
        }

        public Criteria andSplitTimeIsNull() {
            addCriterion("SPLIT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andSplitTimeIsNotNull() {
            addCriterion("SPLIT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andSplitTimeEqualTo(Date value) {
            addCriterion("SPLIT_TIME =", value, "splitTime");
            return (Criteria) this;
        }

        public Criteria andSplitTimeNotEqualTo(Date value) {
            addCriterion("SPLIT_TIME <>", value, "splitTime");
            return (Criteria) this;
        }

        public Criteria andSplitTimeGreaterThan(Date value) {
            addCriterion("SPLIT_TIME >", value, "splitTime");
            return (Criteria) this;
        }

        public Criteria andSplitTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("SPLIT_TIME >=", value, "splitTime");
            return (Criteria) this;
        }

        public Criteria andSplitTimeLessThan(Date value) {
            addCriterion("SPLIT_TIME <", value, "splitTime");
            return (Criteria) this;
        }

        public Criteria andSplitTimeLessThanOrEqualTo(Date value) {
            addCriterion("SPLIT_TIME <=", value, "splitTime");
            return (Criteria) this;
        }

        public Criteria andSplitTimeIn(List<Date> values) {
            addCriterion("SPLIT_TIME in", values, "splitTime");
            return (Criteria) this;
        }

        public Criteria andSplitTimeNotIn(List<Date> values) {
            addCriterion("SPLIT_TIME not in", values, "splitTime");
            return (Criteria) this;
        }

        public Criteria andSplitTimeBetween(Date value1, Date value2) {
            addCriterion("SPLIT_TIME between", value1, value2, "splitTime");
            return (Criteria) this;
        }

        public Criteria andSplitTimeNotBetween(Date value1, Date value2) {
            addCriterion("SPLIT_TIME not between", value1, value2, "splitTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}