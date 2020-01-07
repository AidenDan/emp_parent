package com.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmpExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EmpExample() {
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

        public Criteria andEidIsNull() {
            addCriterion("eid is null");
            return (Criteria) this;
        }

        public Criteria andEidIsNotNull() {
            addCriterion("eid is not null");
            return (Criteria) this;
        }

        public Criteria andEidEqualTo(Integer value) {
            addCriterion("eid =", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidNotEqualTo(Integer value) {
            addCriterion("eid <>", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidGreaterThan(Integer value) {
            addCriterion("eid >", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidGreaterThanOrEqualTo(Integer value) {
            addCriterion("eid >=", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidLessThan(Integer value) {
            addCriterion("eid <", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidLessThanOrEqualTo(Integer value) {
            addCriterion("eid <=", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidIn(List<Integer> values) {
            addCriterion("eid in", values, "eid");
            return (Criteria) this;
        }

        public Criteria andEidNotIn(List<Integer> values) {
            addCriterion("eid not in", values, "eid");
            return (Criteria) this;
        }

        public Criteria andEidBetween(Integer value1, Integer value2) {
            addCriterion("eid between", value1, value2, "eid");
            return (Criteria) this;
        }

        public Criteria andEidNotBetween(Integer value1, Integer value2) {
            addCriterion("eid not between", value1, value2, "eid");
            return (Criteria) this;
        }

        public Criteria andEnameIsNull() {
            addCriterion("ename is null");
            return (Criteria) this;
        }

        public Criteria andEnameIsNotNull() {
            addCriterion("ename is not null");
            return (Criteria) this;
        }

        public Criteria andEnameEqualTo(String value) {
            addCriterion("ename =", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameNotEqualTo(String value) {
            addCriterion("ename <>", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameGreaterThan(String value) {
            addCriterion("ename >", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameGreaterThanOrEqualTo(String value) {
            addCriterion("ename >=", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameLessThan(String value) {
            addCriterion("ename <", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameLessThanOrEqualTo(String value) {
            addCriterion("ename <=", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameLike(String value) {
            addCriterion("ename like", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameNotLike(String value) {
            addCriterion("ename not like", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameIn(List<String> values) {
            addCriterion("ename in", values, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameNotIn(List<String> values) {
            addCriterion("ename not in", values, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameBetween(String value1, String value2) {
            addCriterion("ename between", value1, value2, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameNotBetween(String value1, String value2) {
            addCriterion("ename not between", value1, value2, "ename");
            return (Criteria) this;
        }

        public Criteria andEsexIsNull() {
            addCriterion("esex is null");
            return (Criteria) this;
        }

        public Criteria andEsexIsNotNull() {
            addCriterion("esex is not null");
            return (Criteria) this;
        }

        public Criteria andEsexEqualTo(String value) {
            addCriterion("esex =", value, "esex");
            return (Criteria) this;
        }

        public Criteria andEsexNotEqualTo(String value) {
            addCriterion("esex <>", value, "esex");
            return (Criteria) this;
        }

        public Criteria andEsexGreaterThan(String value) {
            addCriterion("esex >", value, "esex");
            return (Criteria) this;
        }

        public Criteria andEsexGreaterThanOrEqualTo(String value) {
            addCriterion("esex >=", value, "esex");
            return (Criteria) this;
        }

        public Criteria andEsexLessThan(String value) {
            addCriterion("esex <", value, "esex");
            return (Criteria) this;
        }

        public Criteria andEsexLessThanOrEqualTo(String value) {
            addCriterion("esex <=", value, "esex");
            return (Criteria) this;
        }

        public Criteria andEsexLike(String value) {
            addCriterion("esex like", value, "esex");
            return (Criteria) this;
        }

        public Criteria andEsexNotLike(String value) {
            addCriterion("esex not like", value, "esex");
            return (Criteria) this;
        }

        public Criteria andEsexIn(List<String> values) {
            addCriterion("esex in", values, "esex");
            return (Criteria) this;
        }

        public Criteria andEsexNotIn(List<String> values) {
            addCriterion("esex not in", values, "esex");
            return (Criteria) this;
        }

        public Criteria andEsexBetween(String value1, String value2) {
            addCriterion("esex between", value1, value2, "esex");
            return (Criteria) this;
        }

        public Criteria andEsexNotBetween(String value1, String value2) {
            addCriterion("esex not between", value1, value2, "esex");
            return (Criteria) this;
        }

        public Criteria andEstartimeIsNull() {
            addCriterion("estartime is null");
            return (Criteria) this;
        }

        public Criteria andEstartimeIsNotNull() {
            addCriterion("estartime is not null");
            return (Criteria) this;
        }

        public Criteria andEstartimeEqualTo(Date value) {
            addCriterion("estartime =", value, "estartime");
            return (Criteria) this;
        }

        public Criteria andEstartimeNotEqualTo(Date value) {
            addCriterion("estartime <>", value, "estartime");
            return (Criteria) this;
        }

        public Criteria andEstartimeGreaterThan(Date value) {
            addCriterion("estartime >", value, "estartime");
            return (Criteria) this;
        }

        public Criteria andEstartimeGreaterThanOrEqualTo(Date value) {
            addCriterion("estartime >=", value, "estartime");
            return (Criteria) this;
        }

        public Criteria andEstartimeLessThan(Date value) {
            addCriterion("estartime <", value, "estartime");
            return (Criteria) this;
        }

        public Criteria andEstartimeLessThanOrEqualTo(Date value) {
            addCriterion("estartime <=", value, "estartime");
            return (Criteria) this;
        }

        public Criteria andEstartimeIn(List<Date> values) {
            addCriterion("estartime in", values, "estartime");
            return (Criteria) this;
        }

        public Criteria andEstartimeNotIn(List<Date> values) {
            addCriterion("estartime not in", values, "estartime");
            return (Criteria) this;
        }

        public Criteria andEstartimeBetween(Date value1, Date value2) {
            addCriterion("estartime between", value1, value2, "estartime");
            return (Criteria) this;
        }

        public Criteria andEstartimeNotBetween(Date value1, Date value2) {
            addCriterion("estartime not between", value1, value2, "estartime");
            return (Criteria) this;
        }

        public Criteria andEpayIsNull() {
            addCriterion("epay is null");
            return (Criteria) this;
        }

        public Criteria andEpayIsNotNull() {
            addCriterion("epay is not null");
            return (Criteria) this;
        }

        public Criteria andEpayEqualTo(Float value) {
            addCriterion("epay =", value, "epay");
            return (Criteria) this;
        }

        public Criteria andEpayNotEqualTo(Float value) {
            addCriterion("epay <>", value, "epay");
            return (Criteria) this;
        }

        public Criteria andEpayGreaterThan(Float value) {
            addCriterion("epay >", value, "epay");
            return (Criteria) this;
        }

        public Criteria andEpayGreaterThanOrEqualTo(Float value) {
            addCriterion("epay >=", value, "epay");
            return (Criteria) this;
        }

        public Criteria andEpayLessThan(Float value) {
            addCriterion("epay <", value, "epay");
            return (Criteria) this;
        }

        public Criteria andEpayLessThanOrEqualTo(Float value) {
            addCriterion("epay <=", value, "epay");
            return (Criteria) this;
        }

        public Criteria andEpayIn(List<Float> values) {
            addCriterion("epay in", values, "epay");
            return (Criteria) this;
        }

        public Criteria andEpayNotIn(List<Float> values) {
            addCriterion("epay not in", values, "epay");
            return (Criteria) this;
        }

        public Criteria andEpayBetween(Float value1, Float value2) {
            addCriterion("epay between", value1, value2, "epay");
            return (Criteria) this;
        }

        public Criteria andEpayNotBetween(Float value1, Float value2) {
            addCriterion("epay not between", value1, value2, "epay");
            return (Criteria) this;
        }

        public Criteria andDidIsNull() {
            addCriterion("did is null");
            return (Criteria) this;
        }

        public Criteria andDidIsNotNull() {
            addCriterion("did is not null");
            return (Criteria) this;
        }

        public Criteria andDidEqualTo(Integer value) {
            addCriterion("did =", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotEqualTo(Integer value) {
            addCriterion("did <>", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidGreaterThan(Integer value) {
            addCriterion("did >", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidGreaterThanOrEqualTo(Integer value) {
            addCriterion("did >=", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidLessThan(Integer value) {
            addCriterion("did <", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidLessThanOrEqualTo(Integer value) {
            addCriterion("did <=", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidIn(List<Integer> values) {
            addCriterion("did in", values, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotIn(List<Integer> values) {
            addCriterion("did not in", values, "did");
            return (Criteria) this;
        }

        public Criteria andDidBetween(Integer value1, Integer value2) {
            addCriterion("did between", value1, value2, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotBetween(Integer value1, Integer value2) {
            addCriterion("did not between", value1, value2, "did");
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