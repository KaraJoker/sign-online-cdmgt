package com.huluwa.server.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @program: sign-online-cdmgt
 * @description: deptment example class
 * @author: Outcaster
 * @create: 2018-08-01 10:07
 **/
public class DeptExample {

    protected String orderByClause;

    protected boolean distinct;

    protected List<DeptExample.Criteria> oredCriteria;

    public DeptExample() {
        oredCriteria = new ArrayList<DeptExample.Criteria>();
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

    public List<DeptExample.Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(DeptExample.Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public DeptExample.Criteria or() {
        DeptExample.Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public DeptExample.Criteria createCriteria() {
        DeptExample.Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected DeptExample.Criteria createCriteriaInternal() {
        DeptExample.Criteria criteria = new DeptExample.Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<DeptExample.Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<DeptExample.Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<DeptExample.Criterion> getAllCriteria() {
            return criteria;
        }

        public List<DeptExample.Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new DeptExample.Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new DeptExample.Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new DeptExample.Criterion(condition, value1, value2));
        }

        public DeptExample.Criteria andIdIsNull() {
            addCriterion("id is null");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andNameIsNull() {
            addCriterion("name is null");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andManagerIsNull() {
            addCriterion("manager is null");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andManagerIsNotNull() {
            addCriterion("manager is not null");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andManagerEqualTo(String value) {
            addCriterion("manager =", value, "manager");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andManagerNotEqualTo(String value) {
            addCriterion("manager <>", value, "manager");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andManagerGreaterThan(String value) {
            addCriterion("manager >", value, "manager");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andManagerGreaterThanOrEqualTo(String value) {
            addCriterion("manager >=", value, "manager");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andManagerLessThan(String value) {
            addCriterion("manager <", value, "manager");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andManagerLessThanOrEqualTo(String value) {
            addCriterion("manager <=", value, "manager");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andManagerLike(String value) {
            addCriterion("manager like", value, "manager");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andManagerNotLike(String value) {
            addCriterion("manager not like", value, "manager");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andManagerIn(List<String> values) {
            addCriterion("manager in", values, "manager");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andManagerNotIn(List<String> values) {
            addCriterion("manager not in", values, "manager");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andManagerBetween(String value1, String value2) {
            addCriterion("manager between", value1, value2, "manager");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andManagerNotBetween(String value1, String value2) {
            addCriterion("manager not between", value1, value2, "manager");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andManageremailIsNull() {
            addCriterion("managerEmail is null");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andManageremailIsNotNull() {
            addCriterion("managerEmail is not null");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andManageremailEqualTo(String value) {
            addCriterion("managerEmail =", value, "manageremail");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andManageremailNotEqualTo(String value) {
            addCriterion("managerEmail <>", value, "manageremail");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andManageremailGreaterThan(String value) {
            addCriterion("managerEmail >", value, "manageremail");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andManageremailGreaterThanOrEqualTo(String value) {
            addCriterion("managerEmail >=", value, "manageremail");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andManageremailLessThan(String value) {
            addCriterion("managerEmail <", value, "manageremail");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andManageremailLessThanOrEqualTo(String value) {
            addCriterion("managerEmail <=", value, "manageremail");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andManageremailLike(String value) {
            addCriterion("managerEmail like", value, "manageremail");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andManageremailNotLike(String value) {
            addCriterion("managerEmail not like", value, "manageremail");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andManageremailIn(List<String> values) {
            addCriterion("managerEmail in", values, "manageremail");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andManageremailNotIn(List<String> values) {
            addCriterion("managerEmail not in", values, "manageremail");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andManageremailBetween(String value1, String value2) {
            addCriterion("managerEmail between", value1, value2, "manageremail");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andManageremailNotBetween(String value1, String value2) {
            addCriterion("managerEmail not between", value1, value2, "manageremail");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andManagerphoneIsNull() {
            addCriterion("managerPhone is null");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andManagerphoneIsNotNull() {
            addCriterion("managerPhone is not null");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andManagerphoneEqualTo(String value) {
            addCriterion("managerPhone =", value, "managerphone");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andManagerphoneNotEqualTo(String value) {
            addCriterion("managerPhone <>", value, "managerphone");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andManagerphoneGreaterThan(String value) {
            addCriterion("managerPhone >", value, "managerphone");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andManagerphoneGreaterThanOrEqualTo(String value) {
            addCriterion("managerPhone >=", value, "managerphone");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andManagerphoneLessThan(String value) {
            addCriterion("managerPhone <", value, "managerphone");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andManagerphoneLessThanOrEqualTo(String value) {
            addCriterion("managerPhone <=", value, "managerphone");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andManagerphoneLike(String value) {
            addCriterion("managerPhone like", value, "managerphone");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andManagerphoneNotLike(String value) {
            addCriterion("managerPhone not like", value, "managerphone");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andManagerphoneIn(List<String> values) {
            addCriterion("managerPhone in", values, "managerphone");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andManagerphoneNotIn(List<String> values) {
            addCriterion("managerPhone not in", values, "managerphone");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andManagerphoneBetween(String value1, String value2) {
            addCriterion("managerPhone between", value1, value2, "managerphone");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andManagerphoneNotBetween(String value1, String value2) {
            addCriterion("managerPhone not between", value1, value2, "managerphone");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andServicesphoneIsNull() {
            addCriterion("servicesPhone is null");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andServicesphoneIsNotNull() {
            addCriterion("servicesPhone is not null");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andServicesphoneEqualTo(String value) {
            addCriterion("servicesPhone =", value, "servicesphone");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andServicesphoneNotEqualTo(String value) {
            addCriterion("servicesPhone <>", value, "servicesphone");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andServicesphoneGreaterThan(String value) {
            addCriterion("servicesPhone >", value, "servicesphone");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andServicesphoneGreaterThanOrEqualTo(String value) {
            addCriterion("servicesPhone >=", value, "servicesphone");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andServicesphoneLessThan(String value) {
            addCriterion("servicesPhone <", value, "servicesphone");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andServicesphoneLessThanOrEqualTo(String value) {
            addCriterion("servicesPhone <=", value, "servicesphone");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andServicesphoneLike(String value) {
            addCriterion("servicesPhone like", value, "servicesphone");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andServicesphoneNotLike(String value) {
            addCriterion("servicesPhone not like", value, "servicesphone");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andServicesphoneIn(List<String> values) {
            addCriterion("servicesPhone in", values, "servicesphone");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andServicesphoneNotIn(List<String> values) {
            addCriterion("servicesPhone not in", values, "servicesphone");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andServicesphoneBetween(String value1, String value2) {
            addCriterion("servicesPhone between", value1, value2, "servicesphone");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andServicesphoneNotBetween(String value1, String value2) {
            addCriterion("servicesPhone not between", value1, value2, "servicesphone");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andIndustryIsNull() {
            addCriterion("industry is null");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andIndustryIsNotNull() {
            addCriterion("industry is not null");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andIndustryEqualTo(String value) {
            addCriterion("industry =", value, "industry");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andIndustryNotEqualTo(String value) {
            addCriterion("industry <>", value, "industry");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andIndustryGreaterThan(String value) {
            addCriterion("industry >", value, "industry");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andIndustryGreaterThanOrEqualTo(String value) {
            addCriterion("industry >=", value, "industry");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andIndustryLessThan(String value) {
            addCriterion("industry <", value, "industry");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andIndustryLessThanOrEqualTo(String value) {
            addCriterion("industry <=", value, "industry");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andIndustryLike(String value) {
            addCriterion("industry like", value, "industry");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andIndustryNotLike(String value) {
            addCriterion("industry not like", value, "industry");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andIndustryIn(List<String> values) {
            addCriterion("industry in", values, "industry");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andIndustryNotIn(List<String> values) {
            addCriterion("industry not in", values, "industry");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andIndustryBetween(String value1, String value2) {
            addCriterion("industry between", value1, value2, "industry");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andIndustryNotBetween(String value1, String value2) {
            addCriterion("industry not between", value1, value2, "industry");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andCreatatIsNull() {
            addCriterion("creatAt is null");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andCreatatIsNotNull() {
            addCriterion("creatAt is not null");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andCreatatEqualTo(Date value) {
            addCriterion("creatAt =", value, "creatat");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andCreatatNotEqualTo(Date value) {
            addCriterion("creatAt <>", value, "creatat");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andCreatatGreaterThan(Date value) {
            addCriterion("creatAt >", value, "creatat");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andCreatatGreaterThanOrEqualTo(Date value) {
            addCriterion("creatAt >=", value, "creatat");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andCreatatLessThan(Date value) {
            addCriterion("creatAt <", value, "creatat");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andCreatatLessThanOrEqualTo(Date value) {
            addCriterion("creatAt <=", value, "creatat");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andCreatatIn(List<Date> values) {
            addCriterion("creatAt in", values, "creatat");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andCreatatNotIn(List<Date> values) {
            addCriterion("creatAt not in", values, "creatat");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andCreatatBetween(Date value1, Date value2) {
            addCriterion("creatAt between", value1, value2, "creatat");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andCreatatNotBetween(Date value1, Date value2) {
            addCriterion("creatAt not between", value1, value2, "creatat");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andTypeEqualTo(Byte value) {
            addCriterion("type =", value, "type");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andTypeNotEqualTo(Byte value) {
            addCriterion("type <>", value, "type");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andTypeGreaterThan(Byte value) {
            addCriterion("type >", value, "type");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("type >=", value, "type");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andTypeLessThan(Byte value) {
            addCriterion("type <", value, "type");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andTypeLessThanOrEqualTo(Byte value) {
            addCriterion("type <=", value, "type");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andTypeIn(List<Byte> values) {
            addCriterion("type in", values, "type");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andTypeNotIn(List<Byte> values) {
            addCriterion("type not in", values, "type");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andTypeBetween(Byte value1, Byte value2) {
            addCriterion("type between", value1, value2, "type");
            return (DeptExample.Criteria) this;
        }

        public DeptExample.Criteria andTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("type not between", value1, value2, "type");
            return (DeptExample.Criteria) this;
        }
    }

    public static class Criteria extends DeptExample.GeneratedCriteria {

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
