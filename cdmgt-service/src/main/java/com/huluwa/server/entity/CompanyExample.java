package com.huluwa.server.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CompanyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CompanyExample() {
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

        public Criteria andManagerIsNull() {
            addCriterion("manager is null");
            return (Criteria) this;
        }

        public Criteria andManagerIsNotNull() {
            addCriterion("manager is not null");
            return (Criteria) this;
        }

        public Criteria andManagerEqualTo(String value) {
            addCriterion("manager =", value, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerNotEqualTo(String value) {
            addCriterion("manager <>", value, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerGreaterThan(String value) {
            addCriterion("manager >", value, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerGreaterThanOrEqualTo(String value) {
            addCriterion("manager >=", value, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerLessThan(String value) {
            addCriterion("manager <", value, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerLessThanOrEqualTo(String value) {
            addCriterion("manager <=", value, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerLike(String value) {
            addCriterion("manager like", value, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerNotLike(String value) {
            addCriterion("manager not like", value, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerIn(List<String> values) {
            addCriterion("manager in", values, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerNotIn(List<String> values) {
            addCriterion("manager not in", values, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerBetween(String value1, String value2) {
            addCriterion("manager between", value1, value2, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerNotBetween(String value1, String value2) {
            addCriterion("manager not between", value1, value2, "manager");
            return (Criteria) this;
        }

        public Criteria andManageremailIsNull() {
            addCriterion("managerEmail is null");
            return (Criteria) this;
        }

        public Criteria andManageremailIsNotNull() {
            addCriterion("managerEmail is not null");
            return (Criteria) this;
        }

        public Criteria andManageremailEqualTo(String value) {
            addCriterion("managerEmail =", value, "manageremail");
            return (Criteria) this;
        }

        public Criteria andManageremailNotEqualTo(String value) {
            addCriterion("managerEmail <>", value, "manageremail");
            return (Criteria) this;
        }

        public Criteria andManageremailGreaterThan(String value) {
            addCriterion("managerEmail >", value, "manageremail");
            return (Criteria) this;
        }

        public Criteria andManageremailGreaterThanOrEqualTo(String value) {
            addCriterion("managerEmail >=", value, "manageremail");
            return (Criteria) this;
        }

        public Criteria andManageremailLessThan(String value) {
            addCriterion("managerEmail <", value, "manageremail");
            return (Criteria) this;
        }

        public Criteria andManageremailLessThanOrEqualTo(String value) {
            addCriterion("managerEmail <=", value, "manageremail");
            return (Criteria) this;
        }

        public Criteria andManageremailLike(String value) {
            addCriterion("managerEmail like", value, "manageremail");
            return (Criteria) this;
        }

        public Criteria andManageremailNotLike(String value) {
            addCriterion("managerEmail not like", value, "manageremail");
            return (Criteria) this;
        }

        public Criteria andManageremailIn(List<String> values) {
            addCriterion("managerEmail in", values, "manageremail");
            return (Criteria) this;
        }

        public Criteria andManageremailNotIn(List<String> values) {
            addCriterion("managerEmail not in", values, "manageremail");
            return (Criteria) this;
        }

        public Criteria andManageremailBetween(String value1, String value2) {
            addCriterion("managerEmail between", value1, value2, "manageremail");
            return (Criteria) this;
        }

        public Criteria andManageremailNotBetween(String value1, String value2) {
            addCriterion("managerEmail not between", value1, value2, "manageremail");
            return (Criteria) this;
        }

        public Criteria andManagerphoneIsNull() {
            addCriterion("managerPhone is null");
            return (Criteria) this;
        }

        public Criteria andManagerphoneIsNotNull() {
            addCriterion("managerPhone is not null");
            return (Criteria) this;
        }

        public Criteria andManagerphoneEqualTo(String value) {
            addCriterion("managerPhone =", value, "managerphone");
            return (Criteria) this;
        }

        public Criteria andManagerphoneNotEqualTo(String value) {
            addCriterion("managerPhone <>", value, "managerphone");
            return (Criteria) this;
        }

        public Criteria andManagerphoneGreaterThan(String value) {
            addCriterion("managerPhone >", value, "managerphone");
            return (Criteria) this;
        }

        public Criteria andManagerphoneGreaterThanOrEqualTo(String value) {
            addCriterion("managerPhone >=", value, "managerphone");
            return (Criteria) this;
        }

        public Criteria andManagerphoneLessThan(String value) {
            addCriterion("managerPhone <", value, "managerphone");
            return (Criteria) this;
        }

        public Criteria andManagerphoneLessThanOrEqualTo(String value) {
            addCriterion("managerPhone <=", value, "managerphone");
            return (Criteria) this;
        }

        public Criteria andManagerphoneLike(String value) {
            addCriterion("managerPhone like", value, "managerphone");
            return (Criteria) this;
        }

        public Criteria andManagerphoneNotLike(String value) {
            addCriterion("managerPhone not like", value, "managerphone");
            return (Criteria) this;
        }

        public Criteria andManagerphoneIn(List<String> values) {
            addCriterion("managerPhone in", values, "managerphone");
            return (Criteria) this;
        }

        public Criteria andManagerphoneNotIn(List<String> values) {
            addCriterion("managerPhone not in", values, "managerphone");
            return (Criteria) this;
        }

        public Criteria andManagerphoneBetween(String value1, String value2) {
            addCriterion("managerPhone between", value1, value2, "managerphone");
            return (Criteria) this;
        }

        public Criteria andManagerphoneNotBetween(String value1, String value2) {
            addCriterion("managerPhone not between", value1, value2, "managerphone");
            return (Criteria) this;
        }

        public Criteria andServicesphoneIsNull() {
            addCriterion("servicesPhone is null");
            return (Criteria) this;
        }

        public Criteria andServicesphoneIsNotNull() {
            addCriterion("servicesPhone is not null");
            return (Criteria) this;
        }

        public Criteria andServicesphoneEqualTo(String value) {
            addCriterion("servicesPhone =", value, "servicesphone");
            return (Criteria) this;
        }

        public Criteria andServicesphoneNotEqualTo(String value) {
            addCriterion("servicesPhone <>", value, "servicesphone");
            return (Criteria) this;
        }

        public Criteria andServicesphoneGreaterThan(String value) {
            addCriterion("servicesPhone >", value, "servicesphone");
            return (Criteria) this;
        }

        public Criteria andServicesphoneGreaterThanOrEqualTo(String value) {
            addCriterion("servicesPhone >=", value, "servicesphone");
            return (Criteria) this;
        }

        public Criteria andServicesphoneLessThan(String value) {
            addCriterion("servicesPhone <", value, "servicesphone");
            return (Criteria) this;
        }

        public Criteria andServicesphoneLessThanOrEqualTo(String value) {
            addCriterion("servicesPhone <=", value, "servicesphone");
            return (Criteria) this;
        }

        public Criteria andServicesphoneLike(String value) {
            addCriterion("servicesPhone like", value, "servicesphone");
            return (Criteria) this;
        }

        public Criteria andServicesphoneNotLike(String value) {
            addCriterion("servicesPhone not like", value, "servicesphone");
            return (Criteria) this;
        }

        public Criteria andServicesphoneIn(List<String> values) {
            addCriterion("servicesPhone in", values, "servicesphone");
            return (Criteria) this;
        }

        public Criteria andServicesphoneNotIn(List<String> values) {
            addCriterion("servicesPhone not in", values, "servicesphone");
            return (Criteria) this;
        }

        public Criteria andServicesphoneBetween(String value1, String value2) {
            addCriterion("servicesPhone between", value1, value2, "servicesphone");
            return (Criteria) this;
        }

        public Criteria andServicesphoneNotBetween(String value1, String value2) {
            addCriterion("servicesPhone not between", value1, value2, "servicesphone");
            return (Criteria) this;
        }

        public Criteria andIndustryIsNull() {
            addCriterion("industry is null");
            return (Criteria) this;
        }

        public Criteria andIndustryIsNotNull() {
            addCriterion("industry is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryEqualTo(String value) {
            addCriterion("industry =", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotEqualTo(String value) {
            addCriterion("industry <>", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryGreaterThan(String value) {
            addCriterion("industry >", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryGreaterThanOrEqualTo(String value) {
            addCriterion("industry >=", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLessThan(String value) {
            addCriterion("industry <", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLessThanOrEqualTo(String value) {
            addCriterion("industry <=", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLike(String value) {
            addCriterion("industry like", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotLike(String value) {
            addCriterion("industry not like", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryIn(List<String> values) {
            addCriterion("industry in", values, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotIn(List<String> values) {
            addCriterion("industry not in", values, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryBetween(String value1, String value2) {
            addCriterion("industry between", value1, value2, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotBetween(String value1, String value2) {
            addCriterion("industry not between", value1, value2, "industry");
            return (Criteria) this;
        }

        public Criteria andCreatatIsNull() {
            addCriterion("creatAt is null");
            return (Criteria) this;
        }

        public Criteria andCreatatIsNotNull() {
            addCriterion("creatAt is not null");
            return (Criteria) this;
        }

        public Criteria andCreatatEqualTo(Date value) {
            addCriterion("creatAt =", value, "creatat");
            return (Criteria) this;
        }

        public Criteria andCreatatNotEqualTo(Date value) {
            addCriterion("creatAt <>", value, "creatat");
            return (Criteria) this;
        }

        public Criteria andCreatatGreaterThan(Date value) {
            addCriterion("creatAt >", value, "creatat");
            return (Criteria) this;
        }

        public Criteria andCreatatGreaterThanOrEqualTo(Date value) {
            addCriterion("creatAt >=", value, "creatat");
            return (Criteria) this;
        }

        public Criteria andCreatatLessThan(Date value) {
            addCriterion("creatAt <", value, "creatat");
            return (Criteria) this;
        }

        public Criteria andCreatatLessThanOrEqualTo(Date value) {
            addCriterion("creatAt <=", value, "creatat");
            return (Criteria) this;
        }

        public Criteria andCreatatIn(List<Date> values) {
            addCriterion("creatAt in", values, "creatat");
            return (Criteria) this;
        }

        public Criteria andCreatatNotIn(List<Date> values) {
            addCriterion("creatAt not in", values, "creatat");
            return (Criteria) this;
        }

        public Criteria andCreatatBetween(Date value1, Date value2) {
            addCriterion("creatAt between", value1, value2, "creatat");
            return (Criteria) this;
        }

        public Criteria andCreatatNotBetween(Date value1, Date value2) {
            addCriterion("creatAt not between", value1, value2, "creatat");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Byte value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Byte value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Byte value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Byte value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Byte value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Byte> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Byte> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Byte value1, Byte value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("type not between", value1, value2, "type");
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