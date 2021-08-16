package cn.toseektech.consumer.entity;

import java.util.ArrayList;
import java.util.List;

public class EmpolyeeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EmpolyeeExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andIdendityIsNull() {
            addCriterion("idendity is null");
            return (Criteria) this;
        }

        public Criteria andIdendityIsNotNull() {
            addCriterion("idendity is not null");
            return (Criteria) this;
        }

        public Criteria andIdendityEqualTo(String value) {
            addCriterion("idendity =", value, "idendity");
            return (Criteria) this;
        }

        public Criteria andIdendityNotEqualTo(String value) {
            addCriterion("idendity <>", value, "idendity");
            return (Criteria) this;
        }

        public Criteria andIdendityGreaterThan(String value) {
            addCriterion("idendity >", value, "idendity");
            return (Criteria) this;
        }

        public Criteria andIdendityGreaterThanOrEqualTo(String value) {
            addCriterion("idendity >=", value, "idendity");
            return (Criteria) this;
        }

        public Criteria andIdendityLessThan(String value) {
            addCriterion("idendity <", value, "idendity");
            return (Criteria) this;
        }

        public Criteria andIdendityLessThanOrEqualTo(String value) {
            addCriterion("idendity <=", value, "idendity");
            return (Criteria) this;
        }

        public Criteria andIdendityLike(String value) {
            addCriterion("idendity like", value, "idendity");
            return (Criteria) this;
        }

        public Criteria andIdendityNotLike(String value) {
            addCriterion("idendity not like", value, "idendity");
            return (Criteria) this;
        }

        public Criteria andIdendityIn(List<String> values) {
            addCriterion("idendity in", values, "idendity");
            return (Criteria) this;
        }

        public Criteria andIdendityNotIn(List<String> values) {
            addCriterion("idendity not in", values, "idendity");
            return (Criteria) this;
        }

        public Criteria andIdendityBetween(String value1, String value2) {
            addCriterion("idendity between", value1, value2, "idendity");
            return (Criteria) this;
        }

        public Criteria andIdendityNotBetween(String value1, String value2) {
            addCriterion("idendity not between", value1, value2, "idendity");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(Byte value) {
            addCriterion("gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(Byte value) {
            addCriterion("gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(Byte value) {
            addCriterion("gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(Byte value) {
            addCriterion("gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(Byte value) {
            addCriterion("gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(Byte value) {
            addCriterion("gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<Byte> values) {
            addCriterion("gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<Byte> values) {
            addCriterion("gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(Byte value1, Byte value2) {
            addCriterion("gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(Byte value1, Byte value2) {
            addCriterion("gender not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andIsQuiteIsNull() {
            addCriterion("is_quite is null");
            return (Criteria) this;
        }

        public Criteria andIsQuiteIsNotNull() {
            addCriterion("is_quite is not null");
            return (Criteria) this;
        }

        public Criteria andIsQuiteEqualTo(Boolean value) {
            addCriterion("is_quite =", value, "isQuite");
            return (Criteria) this;
        }

        public Criteria andIsQuiteNotEqualTo(Boolean value) {
            addCriterion("is_quite <>", value, "isQuite");
            return (Criteria) this;
        }

        public Criteria andIsQuiteGreaterThan(Boolean value) {
            addCriterion("is_quite >", value, "isQuite");
            return (Criteria) this;
        }

        public Criteria andIsQuiteGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_quite >=", value, "isQuite");
            return (Criteria) this;
        }

        public Criteria andIsQuiteLessThan(Boolean value) {
            addCriterion("is_quite <", value, "isQuite");
            return (Criteria) this;
        }

        public Criteria andIsQuiteLessThanOrEqualTo(Boolean value) {
            addCriterion("is_quite <=", value, "isQuite");
            return (Criteria) this;
        }

        public Criteria andIsQuiteIn(List<Boolean> values) {
            addCriterion("is_quite in", values, "isQuite");
            return (Criteria) this;
        }

        public Criteria andIsQuiteNotIn(List<Boolean> values) {
            addCriterion("is_quite not in", values, "isQuite");
            return (Criteria) this;
        }

        public Criteria andIsQuiteBetween(Boolean value1, Boolean value2) {
            addCriterion("is_quite between", value1, value2, "isQuite");
            return (Criteria) this;
        }

        public Criteria andIsQuiteNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_quite not between", value1, value2, "isQuite");
            return (Criteria) this;
        }

        public Criteria andPositionTypeIsNull() {
            addCriterion("position_type is null");
            return (Criteria) this;
        }

        public Criteria andPositionTypeIsNotNull() {
            addCriterion("position_type is not null");
            return (Criteria) this;
        }

        public Criteria andPositionTypeEqualTo(Integer value) {
            addCriterion("position_type =", value, "positionType");
            return (Criteria) this;
        }

        public Criteria andPositionTypeNotEqualTo(Integer value) {
            addCriterion("position_type <>", value, "positionType");
            return (Criteria) this;
        }

        public Criteria andPositionTypeGreaterThan(Integer value) {
            addCriterion("position_type >", value, "positionType");
            return (Criteria) this;
        }

        public Criteria andPositionTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("position_type >=", value, "positionType");
            return (Criteria) this;
        }

        public Criteria andPositionTypeLessThan(Integer value) {
            addCriterion("position_type <", value, "positionType");
            return (Criteria) this;
        }

        public Criteria andPositionTypeLessThanOrEqualTo(Integer value) {
            addCriterion("position_type <=", value, "positionType");
            return (Criteria) this;
        }

        public Criteria andPositionTypeIn(List<Integer> values) {
            addCriterion("position_type in", values, "positionType");
            return (Criteria) this;
        }

        public Criteria andPositionTypeNotIn(List<Integer> values) {
            addCriterion("position_type not in", values, "positionType");
            return (Criteria) this;
        }

        public Criteria andPositionTypeBetween(Integer value1, Integer value2) {
            addCriterion("position_type between", value1, value2, "positionType");
            return (Criteria) this;
        }

        public Criteria andPositionTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("position_type not between", value1, value2, "positionType");
            return (Criteria) this;
        }

        public Criteria andEducationDegreeIsNull() {
            addCriterion("education_degree is null");
            return (Criteria) this;
        }

        public Criteria andEducationDegreeIsNotNull() {
            addCriterion("education_degree is not null");
            return (Criteria) this;
        }

        public Criteria andEducationDegreeEqualTo(String value) {
            addCriterion("education_degree =", value, "educationDegree");
            return (Criteria) this;
        }

        public Criteria andEducationDegreeNotEqualTo(String value) {
            addCriterion("education_degree <>", value, "educationDegree");
            return (Criteria) this;
        }

        public Criteria andEducationDegreeGreaterThan(String value) {
            addCriterion("education_degree >", value, "educationDegree");
            return (Criteria) this;
        }

        public Criteria andEducationDegreeGreaterThanOrEqualTo(String value) {
            addCriterion("education_degree >=", value, "educationDegree");
            return (Criteria) this;
        }

        public Criteria andEducationDegreeLessThan(String value) {
            addCriterion("education_degree <", value, "educationDegree");
            return (Criteria) this;
        }

        public Criteria andEducationDegreeLessThanOrEqualTo(String value) {
            addCriterion("education_degree <=", value, "educationDegree");
            return (Criteria) this;
        }

        public Criteria andEducationDegreeLike(String value) {
            addCriterion("education_degree like", value, "educationDegree");
            return (Criteria) this;
        }

        public Criteria andEducationDegreeNotLike(String value) {
            addCriterion("education_degree not like", value, "educationDegree");
            return (Criteria) this;
        }

        public Criteria andEducationDegreeIn(List<String> values) {
            addCriterion("education_degree in", values, "educationDegree");
            return (Criteria) this;
        }

        public Criteria andEducationDegreeNotIn(List<String> values) {
            addCriterion("education_degree not in", values, "educationDegree");
            return (Criteria) this;
        }

        public Criteria andEducationDegreeBetween(String value1, String value2) {
            addCriterion("education_degree between", value1, value2, "educationDegree");
            return (Criteria) this;
        }

        public Criteria andEducationDegreeNotBetween(String value1, String value2) {
            addCriterion("education_degree not between", value1, value2, "educationDegree");
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