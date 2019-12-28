package com.alm.user.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserShelfExample {
    /**
     * t_user_shelf
     */
    protected String orderByClause;

    /**
     * t_user_shelf
     */
    protected boolean distinct;

    /**
     * t_user_shelf
     */
    protected List<Criteria> oredCriteria;

    public UserShelfExample() {
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

    /**
     * 我的书架 2019-12-28
     */
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("userId is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("userId is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("userId =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("userId <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("userId >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("userId >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("userId <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("userId <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("userId in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("userId not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("userId between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("userId not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andBookIdIsNull() {
            addCriterion("bookId is null");
            return (Criteria) this;
        }

        public Criteria andBookIdIsNotNull() {
            addCriterion("bookId is not null");
            return (Criteria) this;
        }

        public Criteria andBookIdEqualTo(Integer value) {
            addCriterion("bookId =", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotEqualTo(Integer value) {
            addCriterion("bookId <>", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdGreaterThan(Integer value) {
            addCriterion("bookId >", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("bookId >=", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdLessThan(Integer value) {
            addCriterion("bookId <", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdLessThanOrEqualTo(Integer value) {
            addCriterion("bookId <=", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdIn(List<Integer> values) {
            addCriterion("bookId in", values, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotIn(List<Integer> values) {
            addCriterion("bookId not in", values, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdBetween(Integer value1, Integer value2) {
            addCriterion("bookId between", value1, value2, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotBetween(Integer value1, Integer value2) {
            addCriterion("bookId not between", value1, value2, "bookId");
            return (Criteria) this;
        }

        public Criteria andChapterIdIsNull() {
            addCriterion("chapterId is null");
            return (Criteria) this;
        }

        public Criteria andChapterIdIsNotNull() {
            addCriterion("chapterId is not null");
            return (Criteria) this;
        }

        public Criteria andChapterIdEqualTo(Integer value) {
            addCriterion("chapterId =", value, "chapterId");
            return (Criteria) this;
        }

        public Criteria andChapterIdNotEqualTo(Integer value) {
            addCriterion("chapterId <>", value, "chapterId");
            return (Criteria) this;
        }

        public Criteria andChapterIdGreaterThan(Integer value) {
            addCriterion("chapterId >", value, "chapterId");
            return (Criteria) this;
        }

        public Criteria andChapterIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("chapterId >=", value, "chapterId");
            return (Criteria) this;
        }

        public Criteria andChapterIdLessThan(Integer value) {
            addCriterion("chapterId <", value, "chapterId");
            return (Criteria) this;
        }

        public Criteria andChapterIdLessThanOrEqualTo(Integer value) {
            addCriterion("chapterId <=", value, "chapterId");
            return (Criteria) this;
        }

        public Criteria andChapterIdIn(List<Integer> values) {
            addCriterion("chapterId in", values, "chapterId");
            return (Criteria) this;
        }

        public Criteria andChapterIdNotIn(List<Integer> values) {
            addCriterion("chapterId not in", values, "chapterId");
            return (Criteria) this;
        }

        public Criteria andChapterIdBetween(Integer value1, Integer value2) {
            addCriterion("chapterId between", value1, value2, "chapterId");
            return (Criteria) this;
        }

        public Criteria andChapterIdNotBetween(Integer value1, Integer value2) {
            addCriterion("chapterId not between", value1, value2, "chapterId");
            return (Criteria) this;
        }

        public Criteria andPageNoIsNull() {
            addCriterion("pageNo is null");
            return (Criteria) this;
        }

        public Criteria andPageNoIsNotNull() {
            addCriterion("pageNo is not null");
            return (Criteria) this;
        }

        public Criteria andPageNoEqualTo(Integer value) {
            addCriterion("pageNo =", value, "pageNo");
            return (Criteria) this;
        }

        public Criteria andPageNoNotEqualTo(Integer value) {
            addCriterion("pageNo <>", value, "pageNo");
            return (Criteria) this;
        }

        public Criteria andPageNoGreaterThan(Integer value) {
            addCriterion("pageNo >", value, "pageNo");
            return (Criteria) this;
        }

        public Criteria andPageNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("pageNo >=", value, "pageNo");
            return (Criteria) this;
        }

        public Criteria andPageNoLessThan(Integer value) {
            addCriterion("pageNo <", value, "pageNo");
            return (Criteria) this;
        }

        public Criteria andPageNoLessThanOrEqualTo(Integer value) {
            addCriterion("pageNo <=", value, "pageNo");
            return (Criteria) this;
        }

        public Criteria andPageNoIn(List<Integer> values) {
            addCriterion("pageNo in", values, "pageNo");
            return (Criteria) this;
        }

        public Criteria andPageNoNotIn(List<Integer> values) {
            addCriterion("pageNo not in", values, "pageNo");
            return (Criteria) this;
        }

        public Criteria andPageNoBetween(Integer value1, Integer value2) {
            addCriterion("pageNo between", value1, value2, "pageNo");
            return (Criteria) this;
        }

        public Criteria andPageNoNotBetween(Integer value1, Integer value2) {
            addCriterion("pageNo not between", value1, value2, "pageNo");
            return (Criteria) this;
        }

        public Criteria andReadDurationIsNull() {
            addCriterion("readDuration is null");
            return (Criteria) this;
        }

        public Criteria andReadDurationIsNotNull() {
            addCriterion("readDuration is not null");
            return (Criteria) this;
        }

        public Criteria andReadDurationEqualTo(Integer value) {
            addCriterion("readDuration =", value, "readDuration");
            return (Criteria) this;
        }

        public Criteria andReadDurationNotEqualTo(Integer value) {
            addCriterion("readDuration <>", value, "readDuration");
            return (Criteria) this;
        }

        public Criteria andReadDurationGreaterThan(Integer value) {
            addCriterion("readDuration >", value, "readDuration");
            return (Criteria) this;
        }

        public Criteria andReadDurationGreaterThanOrEqualTo(Integer value) {
            addCriterion("readDuration >=", value, "readDuration");
            return (Criteria) this;
        }

        public Criteria andReadDurationLessThan(Integer value) {
            addCriterion("readDuration <", value, "readDuration");
            return (Criteria) this;
        }

        public Criteria andReadDurationLessThanOrEqualTo(Integer value) {
            addCriterion("readDuration <=", value, "readDuration");
            return (Criteria) this;
        }

        public Criteria andReadDurationIn(List<Integer> values) {
            addCriterion("readDuration in", values, "readDuration");
            return (Criteria) this;
        }

        public Criteria andReadDurationNotIn(List<Integer> values) {
            addCriterion("readDuration not in", values, "readDuration");
            return (Criteria) this;
        }

        public Criteria andReadDurationBetween(Integer value1, Integer value2) {
            addCriterion("readDuration between", value1, value2, "readDuration");
            return (Criteria) this;
        }

        public Criteria andReadDurationNotBetween(Integer value1, Integer value2) {
            addCriterion("readDuration not between", value1, value2, "readDuration");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("createTime =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("createTime <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("createTime >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createTime >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("createTime <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("createTime <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("createTime in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("createTime not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("createTime between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("createTime not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("updateTime is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("updateTime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("updateTime =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("updateTime <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("updateTime >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updateTime >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("updateTime <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("updateTime <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("updateTime in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("updateTime not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("updateTime between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("updateTime not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
    }

    /**
     * t_user_shelf
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 我的书架 2019-12-28
     */
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