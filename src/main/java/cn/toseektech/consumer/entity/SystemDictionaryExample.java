package cn.toseektech.consumer.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SystemDictionaryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SystemDictionaryExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSystemCodeIsNull() {
            addCriterion("system_code is null");
            return (Criteria) this;
        }

        public Criteria andSystemCodeIsNotNull() {
            addCriterion("system_code is not null");
            return (Criteria) this;
        }

        public Criteria andSystemCodeEqualTo(String value) {
            addCriterion("system_code =", value, "systemCode");
            return (Criteria) this;
        }

        public Criteria andSystemCodeNotEqualTo(String value) {
            addCriterion("system_code <>", value, "systemCode");
            return (Criteria) this;
        }

        public Criteria andSystemCodeGreaterThan(String value) {
            addCriterion("system_code >", value, "systemCode");
            return (Criteria) this;
        }

        public Criteria andSystemCodeGreaterThanOrEqualTo(String value) {
            addCriterion("system_code >=", value, "systemCode");
            return (Criteria) this;
        }

        public Criteria andSystemCodeLessThan(String value) {
            addCriterion("system_code <", value, "systemCode");
            return (Criteria) this;
        }

        public Criteria andSystemCodeLessThanOrEqualTo(String value) {
            addCriterion("system_code <=", value, "systemCode");
            return (Criteria) this;
        }

        public Criteria andSystemCodeLike(String value) {
            addCriterion("system_code like", value, "systemCode");
            return (Criteria) this;
        }

        public Criteria andSystemCodeNotLike(String value) {
            addCriterion("system_code not like", value, "systemCode");
            return (Criteria) this;
        }

        public Criteria andSystemCodeIn(List<String> values) {
            addCriterion("system_code in", values, "systemCode");
            return (Criteria) this;
        }

        public Criteria andSystemCodeNotIn(List<String> values) {
            addCriterion("system_code not in", values, "systemCode");
            return (Criteria) this;
        }

        public Criteria andSystemCodeBetween(String value1, String value2) {
            addCriterion("system_code between", value1, value2, "systemCode");
            return (Criteria) this;
        }

        public Criteria andSystemCodeNotBetween(String value1, String value2) {
            addCriterion("system_code not between", value1, value2, "systemCode");
            return (Criteria) this;
        }

        public Criteria andDictTagIsNull() {
            addCriterion("dict_tag is null");
            return (Criteria) this;
        }

        public Criteria andDictTagIsNotNull() {
            addCriterion("dict_tag is not null");
            return (Criteria) this;
        }

        public Criteria andDictTagEqualTo(String value) {
            addCriterion("dict_tag =", value, "dictTag");
            return (Criteria) this;
        }

        public Criteria andDictTagNotEqualTo(String value) {
            addCriterion("dict_tag <>", value, "dictTag");
            return (Criteria) this;
        }

        public Criteria andDictTagGreaterThan(String value) {
            addCriterion("dict_tag >", value, "dictTag");
            return (Criteria) this;
        }

        public Criteria andDictTagGreaterThanOrEqualTo(String value) {
            addCriterion("dict_tag >=", value, "dictTag");
            return (Criteria) this;
        }

        public Criteria andDictTagLessThan(String value) {
            addCriterion("dict_tag <", value, "dictTag");
            return (Criteria) this;
        }

        public Criteria andDictTagLessThanOrEqualTo(String value) {
            addCriterion("dict_tag <=", value, "dictTag");
            return (Criteria) this;
        }

        public Criteria andDictTagLike(String value) {
            addCriterion("dict_tag like", value, "dictTag");
            return (Criteria) this;
        }

        public Criteria andDictTagNotLike(String value) {
            addCriterion("dict_tag not like", value, "dictTag");
            return (Criteria) this;
        }

        public Criteria andDictTagIn(List<String> values) {
            addCriterion("dict_tag in", values, "dictTag");
            return (Criteria) this;
        }

        public Criteria andDictTagNotIn(List<String> values) {
            addCriterion("dict_tag not in", values, "dictTag");
            return (Criteria) this;
        }

        public Criteria andDictTagBetween(String value1, String value2) {
            addCriterion("dict_tag between", value1, value2, "dictTag");
            return (Criteria) this;
        }

        public Criteria andDictTagNotBetween(String value1, String value2) {
            addCriterion("dict_tag not between", value1, value2, "dictTag");
            return (Criteria) this;
        }

        public Criteria andDictCodeIsNull() {
            addCriterion("dict_code is null");
            return (Criteria) this;
        }

        public Criteria andDictCodeIsNotNull() {
            addCriterion("dict_code is not null");
            return (Criteria) this;
        }

        public Criteria andDictCodeEqualTo(String value) {
            addCriterion("dict_code =", value, "dictCode");
            return (Criteria) this;
        }

        public Criteria andDictCodeNotEqualTo(String value) {
            addCriterion("dict_code <>", value, "dictCode");
            return (Criteria) this;
        }

        public Criteria andDictCodeGreaterThan(String value) {
            addCriterion("dict_code >", value, "dictCode");
            return (Criteria) this;
        }

        public Criteria andDictCodeGreaterThanOrEqualTo(String value) {
            addCriterion("dict_code >=", value, "dictCode");
            return (Criteria) this;
        }

        public Criteria andDictCodeLessThan(String value) {
            addCriterion("dict_code <", value, "dictCode");
            return (Criteria) this;
        }

        public Criteria andDictCodeLessThanOrEqualTo(String value) {
            addCriterion("dict_code <=", value, "dictCode");
            return (Criteria) this;
        }

        public Criteria andDictCodeLike(String value) {
            addCriterion("dict_code like", value, "dictCode");
            return (Criteria) this;
        }

        public Criteria andDictCodeNotLike(String value) {
            addCriterion("dict_code not like", value, "dictCode");
            return (Criteria) this;
        }

        public Criteria andDictCodeIn(List<String> values) {
            addCriterion("dict_code in", values, "dictCode");
            return (Criteria) this;
        }

        public Criteria andDictCodeNotIn(List<String> values) {
            addCriterion("dict_code not in", values, "dictCode");
            return (Criteria) this;
        }

        public Criteria andDictCodeBetween(String value1, String value2) {
            addCriterion("dict_code between", value1, value2, "dictCode");
            return (Criteria) this;
        }

        public Criteria andDictCodeNotBetween(String value1, String value2) {
            addCriterion("dict_code not between", value1, value2, "dictCode");
            return (Criteria) this;
        }

        public Criteria andDictKeyIsNull() {
            addCriterion("dict_key is null");
            return (Criteria) this;
        }

        public Criteria andDictKeyIsNotNull() {
            addCriterion("dict_key is not null");
            return (Criteria) this;
        }

        public Criteria andDictKeyEqualTo(String value) {
            addCriterion("dict_key =", value, "dictKey");
            return (Criteria) this;
        }

        public Criteria andDictKeyNotEqualTo(String value) {
            addCriterion("dict_key <>", value, "dictKey");
            return (Criteria) this;
        }

        public Criteria andDictKeyGreaterThan(String value) {
            addCriterion("dict_key >", value, "dictKey");
            return (Criteria) this;
        }

        public Criteria andDictKeyGreaterThanOrEqualTo(String value) {
            addCriterion("dict_key >=", value, "dictKey");
            return (Criteria) this;
        }

        public Criteria andDictKeyLessThan(String value) {
            addCriterion("dict_key <", value, "dictKey");
            return (Criteria) this;
        }

        public Criteria andDictKeyLessThanOrEqualTo(String value) {
            addCriterion("dict_key <=", value, "dictKey");
            return (Criteria) this;
        }

        public Criteria andDictKeyLike(String value) {
            addCriterion("dict_key like", value, "dictKey");
            return (Criteria) this;
        }

        public Criteria andDictKeyNotLike(String value) {
            addCriterion("dict_key not like", value, "dictKey");
            return (Criteria) this;
        }

        public Criteria andDictKeyIn(List<String> values) {
            addCriterion("dict_key in", values, "dictKey");
            return (Criteria) this;
        }

        public Criteria andDictKeyNotIn(List<String> values) {
            addCriterion("dict_key not in", values, "dictKey");
            return (Criteria) this;
        }

        public Criteria andDictKeyBetween(String value1, String value2) {
            addCriterion("dict_key between", value1, value2, "dictKey");
            return (Criteria) this;
        }

        public Criteria andDictKeyNotBetween(String value1, String value2) {
            addCriterion("dict_key not between", value1, value2, "dictKey");
            return (Criteria) this;
        }

        public Criteria andDictValueIsNull() {
            addCriterion("dict_value is null");
            return (Criteria) this;
        }

        public Criteria andDictValueIsNotNull() {
            addCriterion("dict_value is not null");
            return (Criteria) this;
        }

        public Criteria andDictValueEqualTo(String value) {
            addCriterion("dict_value =", value, "dictValue");
            return (Criteria) this;
        }

        public Criteria andDictValueNotEqualTo(String value) {
            addCriterion("dict_value <>", value, "dictValue");
            return (Criteria) this;
        }

        public Criteria andDictValueGreaterThan(String value) {
            addCriterion("dict_value >", value, "dictValue");
            return (Criteria) this;
        }

        public Criteria andDictValueGreaterThanOrEqualTo(String value) {
            addCriterion("dict_value >=", value, "dictValue");
            return (Criteria) this;
        }

        public Criteria andDictValueLessThan(String value) {
            addCriterion("dict_value <", value, "dictValue");
            return (Criteria) this;
        }

        public Criteria andDictValueLessThanOrEqualTo(String value) {
            addCriterion("dict_value <=", value, "dictValue");
            return (Criteria) this;
        }

        public Criteria andDictValueLike(String value) {
            addCriterion("dict_value like", value, "dictValue");
            return (Criteria) this;
        }

        public Criteria andDictValueNotLike(String value) {
            addCriterion("dict_value not like", value, "dictValue");
            return (Criteria) this;
        }

        public Criteria andDictValueIn(List<String> values) {
            addCriterion("dict_value in", values, "dictValue");
            return (Criteria) this;
        }

        public Criteria andDictValueNotIn(List<String> values) {
            addCriterion("dict_value not in", values, "dictValue");
            return (Criteria) this;
        }

        public Criteria andDictValueBetween(String value1, String value2) {
            addCriterion("dict_value between", value1, value2, "dictValue");
            return (Criteria) this;
        }

        public Criteria andDictValueNotBetween(String value1, String value2) {
            addCriterion("dict_value not between", value1, value2, "dictValue");
            return (Criteria) this;
        }

        public Criteria andActiveIsNull() {
            addCriterion("active is null");
            return (Criteria) this;
        }

        public Criteria andActiveIsNotNull() {
            addCriterion("active is not null");
            return (Criteria) this;
        }

        public Criteria andActiveEqualTo(Boolean value) {
            addCriterion("active =", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveNotEqualTo(Boolean value) {
            addCriterion("active <>", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveGreaterThan(Boolean value) {
            addCriterion("active >", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveGreaterThanOrEqualTo(Boolean value) {
            addCriterion("active >=", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveLessThan(Boolean value) {
            addCriterion("active <", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveLessThanOrEqualTo(Boolean value) {
            addCriterion("active <=", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveIn(List<Boolean> values) {
            addCriterion("active in", values, "active");
            return (Criteria) this;
        }

        public Criteria andActiveNotIn(List<Boolean> values) {
            addCriterion("active not in", values, "active");
            return (Criteria) this;
        }

        public Criteria andActiveBetween(Boolean value1, Boolean value2) {
            addCriterion("active between", value1, value2, "active");
            return (Criteria) this;
        }

        public Criteria andActiveNotBetween(Boolean value1, Boolean value2) {
            addCriterion("active not between", value1, value2, "active");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCreateIdIsNull() {
            addCriterion("create_id is null");
            return (Criteria) this;
        }

        public Criteria andCreateIdIsNotNull() {
            addCriterion("create_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreateIdEqualTo(Long value) {
            addCriterion("create_id =", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotEqualTo(Long value) {
            addCriterion("create_id <>", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdGreaterThan(Long value) {
            addCriterion("create_id >", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdGreaterThanOrEqualTo(Long value) {
            addCriterion("create_id >=", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdLessThan(Long value) {
            addCriterion("create_id <", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdLessThanOrEqualTo(Long value) {
            addCriterion("create_id <=", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdIn(List<Long> values) {
            addCriterion("create_id in", values, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotIn(List<Long> values) {
            addCriterion("create_id not in", values, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdBetween(Long value1, Long value2) {
            addCriterion("create_id between", value1, value2, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotBetween(Long value1, Long value2) {
            addCriterion("create_id not between", value1, value2, "createId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdIsNull() {
            addCriterion("update_id is null");
            return (Criteria) this;
        }

        public Criteria andUpdateIdIsNotNull() {
            addCriterion("update_id is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateIdEqualTo(Long value) {
            addCriterion("update_id =", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdNotEqualTo(Long value) {
            addCriterion("update_id <>", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdGreaterThan(Long value) {
            addCriterion("update_id >", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdGreaterThanOrEqualTo(Long value) {
            addCriterion("update_id >=", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdLessThan(Long value) {
            addCriterion("update_id <", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdLessThanOrEqualTo(Long value) {
            addCriterion("update_id <=", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdIn(List<Long> values) {
            addCriterion("update_id in", values, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdNotIn(List<Long> values) {
            addCriterion("update_id not in", values, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdBetween(Long value1, Long value2) {
            addCriterion("update_id between", value1, value2, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdNotBetween(Long value1, Long value2) {
            addCriterion("update_id not between", value1, value2, "updateId");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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