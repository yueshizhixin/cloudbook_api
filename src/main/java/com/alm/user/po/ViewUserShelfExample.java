package com.alm.user.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ViewUserShelfExample {
    /**
     * v_user_shelf
     */
    protected String orderByClause;

    /**
     * v_user_shelf
     */
    protected boolean distinct;

    /**
     * v_user_shelf
     */
    protected List<Criteria> oredCriteria;

    public ViewUserShelfExample() {
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
     * VIEW 2019-12-28
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

        public Criteria andBookNameIsNull() {
            addCriterion("bookName is null");
            return (Criteria) this;
        }

        public Criteria andBookNameIsNotNull() {
            addCriterion("bookName is not null");
            return (Criteria) this;
        }

        public Criteria andBookNameEqualTo(String value) {
            addCriterion("bookName =", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameNotEqualTo(String value) {
            addCriterion("bookName <>", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameGreaterThan(String value) {
            addCriterion("bookName >", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameGreaterThanOrEqualTo(String value) {
            addCriterion("bookName >=", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameLessThan(String value) {
            addCriterion("bookName <", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameLessThanOrEqualTo(String value) {
            addCriterion("bookName <=", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameLike(String value) {
            addCriterion("bookName like", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameNotLike(String value) {
            addCriterion("bookName not like", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameIn(List<String> values) {
            addCriterion("bookName in", values, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameNotIn(List<String> values) {
            addCriterion("bookName not in", values, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameBetween(String value1, String value2) {
            addCriterion("bookName between", value1, value2, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameNotBetween(String value1, String value2) {
            addCriterion("bookName not between", value1, value2, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookAuthorIsNull() {
            addCriterion("bookAuthor is null");
            return (Criteria) this;
        }

        public Criteria andBookAuthorIsNotNull() {
            addCriterion("bookAuthor is not null");
            return (Criteria) this;
        }

        public Criteria andBookAuthorEqualTo(String value) {
            addCriterion("bookAuthor =", value, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorNotEqualTo(String value) {
            addCriterion("bookAuthor <>", value, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorGreaterThan(String value) {
            addCriterion("bookAuthor >", value, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("bookAuthor >=", value, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorLessThan(String value) {
            addCriterion("bookAuthor <", value, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorLessThanOrEqualTo(String value) {
            addCriterion("bookAuthor <=", value, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorLike(String value) {
            addCriterion("bookAuthor like", value, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorNotLike(String value) {
            addCriterion("bookAuthor not like", value, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorIn(List<String> values) {
            addCriterion("bookAuthor in", values, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorNotIn(List<String> values) {
            addCriterion("bookAuthor not in", values, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorBetween(String value1, String value2) {
            addCriterion("bookAuthor between", value1, value2, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorNotBetween(String value1, String value2) {
            addCriterion("bookAuthor not between", value1, value2, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorImageIsNull() {
            addCriterion("bookAuthorImage is null");
            return (Criteria) this;
        }

        public Criteria andBookAuthorImageIsNotNull() {
            addCriterion("bookAuthorImage is not null");
            return (Criteria) this;
        }

        public Criteria andBookAuthorImageEqualTo(String value) {
            addCriterion("bookAuthorImage =", value, "bookAuthorImage");
            return (Criteria) this;
        }

        public Criteria andBookAuthorImageNotEqualTo(String value) {
            addCriterion("bookAuthorImage <>", value, "bookAuthorImage");
            return (Criteria) this;
        }

        public Criteria andBookAuthorImageGreaterThan(String value) {
            addCriterion("bookAuthorImage >", value, "bookAuthorImage");
            return (Criteria) this;
        }

        public Criteria andBookAuthorImageGreaterThanOrEqualTo(String value) {
            addCriterion("bookAuthorImage >=", value, "bookAuthorImage");
            return (Criteria) this;
        }

        public Criteria andBookAuthorImageLessThan(String value) {
            addCriterion("bookAuthorImage <", value, "bookAuthorImage");
            return (Criteria) this;
        }

        public Criteria andBookAuthorImageLessThanOrEqualTo(String value) {
            addCriterion("bookAuthorImage <=", value, "bookAuthorImage");
            return (Criteria) this;
        }

        public Criteria andBookAuthorImageLike(String value) {
            addCriterion("bookAuthorImage like", value, "bookAuthorImage");
            return (Criteria) this;
        }

        public Criteria andBookAuthorImageNotLike(String value) {
            addCriterion("bookAuthorImage not like", value, "bookAuthorImage");
            return (Criteria) this;
        }

        public Criteria andBookAuthorImageIn(List<String> values) {
            addCriterion("bookAuthorImage in", values, "bookAuthorImage");
            return (Criteria) this;
        }

        public Criteria andBookAuthorImageNotIn(List<String> values) {
            addCriterion("bookAuthorImage not in", values, "bookAuthorImage");
            return (Criteria) this;
        }

        public Criteria andBookAuthorImageBetween(String value1, String value2) {
            addCriterion("bookAuthorImage between", value1, value2, "bookAuthorImage");
            return (Criteria) this;
        }

        public Criteria andBookAuthorImageNotBetween(String value1, String value2) {
            addCriterion("bookAuthorImage not between", value1, value2, "bookAuthorImage");
            return (Criteria) this;
        }

        public Criteria andBookImageVerticalIsNull() {
            addCriterion("bookImageVertical is null");
            return (Criteria) this;
        }

        public Criteria andBookImageVerticalIsNotNull() {
            addCriterion("bookImageVertical is not null");
            return (Criteria) this;
        }

        public Criteria andBookImageVerticalEqualTo(String value) {
            addCriterion("bookImageVertical =", value, "bookImageVertical");
            return (Criteria) this;
        }

        public Criteria andBookImageVerticalNotEqualTo(String value) {
            addCriterion("bookImageVertical <>", value, "bookImageVertical");
            return (Criteria) this;
        }

        public Criteria andBookImageVerticalGreaterThan(String value) {
            addCriterion("bookImageVertical >", value, "bookImageVertical");
            return (Criteria) this;
        }

        public Criteria andBookImageVerticalGreaterThanOrEqualTo(String value) {
            addCriterion("bookImageVertical >=", value, "bookImageVertical");
            return (Criteria) this;
        }

        public Criteria andBookImageVerticalLessThan(String value) {
            addCriterion("bookImageVertical <", value, "bookImageVertical");
            return (Criteria) this;
        }

        public Criteria andBookImageVerticalLessThanOrEqualTo(String value) {
            addCriterion("bookImageVertical <=", value, "bookImageVertical");
            return (Criteria) this;
        }

        public Criteria andBookImageVerticalLike(String value) {
            addCriterion("bookImageVertical like", value, "bookImageVertical");
            return (Criteria) this;
        }

        public Criteria andBookImageVerticalNotLike(String value) {
            addCriterion("bookImageVertical not like", value, "bookImageVertical");
            return (Criteria) this;
        }

        public Criteria andBookImageVerticalIn(List<String> values) {
            addCriterion("bookImageVertical in", values, "bookImageVertical");
            return (Criteria) this;
        }

        public Criteria andBookImageVerticalNotIn(List<String> values) {
            addCriterion("bookImageVertical not in", values, "bookImageVertical");
            return (Criteria) this;
        }

        public Criteria andBookImageVerticalBetween(String value1, String value2) {
            addCriterion("bookImageVertical between", value1, value2, "bookImageVertical");
            return (Criteria) this;
        }

        public Criteria andBookImageVerticalNotBetween(String value1, String value2) {
            addCriterion("bookImageVertical not between", value1, value2, "bookImageVertical");
            return (Criteria) this;
        }

        public Criteria andBookImageAlignIsNull() {
            addCriterion("bookImageAlign is null");
            return (Criteria) this;
        }

        public Criteria andBookImageAlignIsNotNull() {
            addCriterion("bookImageAlign is not null");
            return (Criteria) this;
        }

        public Criteria andBookImageAlignEqualTo(String value) {
            addCriterion("bookImageAlign =", value, "bookImageAlign");
            return (Criteria) this;
        }

        public Criteria andBookImageAlignNotEqualTo(String value) {
            addCriterion("bookImageAlign <>", value, "bookImageAlign");
            return (Criteria) this;
        }

        public Criteria andBookImageAlignGreaterThan(String value) {
            addCriterion("bookImageAlign >", value, "bookImageAlign");
            return (Criteria) this;
        }

        public Criteria andBookImageAlignGreaterThanOrEqualTo(String value) {
            addCriterion("bookImageAlign >=", value, "bookImageAlign");
            return (Criteria) this;
        }

        public Criteria andBookImageAlignLessThan(String value) {
            addCriterion("bookImageAlign <", value, "bookImageAlign");
            return (Criteria) this;
        }

        public Criteria andBookImageAlignLessThanOrEqualTo(String value) {
            addCriterion("bookImageAlign <=", value, "bookImageAlign");
            return (Criteria) this;
        }

        public Criteria andBookImageAlignLike(String value) {
            addCriterion("bookImageAlign like", value, "bookImageAlign");
            return (Criteria) this;
        }

        public Criteria andBookImageAlignNotLike(String value) {
            addCriterion("bookImageAlign not like", value, "bookImageAlign");
            return (Criteria) this;
        }

        public Criteria andBookImageAlignIn(List<String> values) {
            addCriterion("bookImageAlign in", values, "bookImageAlign");
            return (Criteria) this;
        }

        public Criteria andBookImageAlignNotIn(List<String> values) {
            addCriterion("bookImageAlign not in", values, "bookImageAlign");
            return (Criteria) this;
        }

        public Criteria andBookImageAlignBetween(String value1, String value2) {
            addCriterion("bookImageAlign between", value1, value2, "bookImageAlign");
            return (Criteria) this;
        }

        public Criteria andBookImageAlignNotBetween(String value1, String value2) {
            addCriterion("bookImageAlign not between", value1, value2, "bookImageAlign");
            return (Criteria) this;
        }

        public Criteria andBookShortDescriptionIsNull() {
            addCriterion("bookShortDescription is null");
            return (Criteria) this;
        }

        public Criteria andBookShortDescriptionIsNotNull() {
            addCriterion("bookShortDescription is not null");
            return (Criteria) this;
        }

        public Criteria andBookShortDescriptionEqualTo(String value) {
            addCriterion("bookShortDescription =", value, "bookShortDescription");
            return (Criteria) this;
        }

        public Criteria andBookShortDescriptionNotEqualTo(String value) {
            addCriterion("bookShortDescription <>", value, "bookShortDescription");
            return (Criteria) this;
        }

        public Criteria andBookShortDescriptionGreaterThan(String value) {
            addCriterion("bookShortDescription >", value, "bookShortDescription");
            return (Criteria) this;
        }

        public Criteria andBookShortDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("bookShortDescription >=", value, "bookShortDescription");
            return (Criteria) this;
        }

        public Criteria andBookShortDescriptionLessThan(String value) {
            addCriterion("bookShortDescription <", value, "bookShortDescription");
            return (Criteria) this;
        }

        public Criteria andBookShortDescriptionLessThanOrEqualTo(String value) {
            addCriterion("bookShortDescription <=", value, "bookShortDescription");
            return (Criteria) this;
        }

        public Criteria andBookShortDescriptionLike(String value) {
            addCriterion("bookShortDescription like", value, "bookShortDescription");
            return (Criteria) this;
        }

        public Criteria andBookShortDescriptionNotLike(String value) {
            addCriterion("bookShortDescription not like", value, "bookShortDescription");
            return (Criteria) this;
        }

        public Criteria andBookShortDescriptionIn(List<String> values) {
            addCriterion("bookShortDescription in", values, "bookShortDescription");
            return (Criteria) this;
        }

        public Criteria andBookShortDescriptionNotIn(List<String> values) {
            addCriterion("bookShortDescription not in", values, "bookShortDescription");
            return (Criteria) this;
        }

        public Criteria andBookShortDescriptionBetween(String value1, String value2) {
            addCriterion("bookShortDescription between", value1, value2, "bookShortDescription");
            return (Criteria) this;
        }

        public Criteria andBookShortDescriptionNotBetween(String value1, String value2) {
            addCriterion("bookShortDescription not between", value1, value2, "bookShortDescription");
            return (Criteria) this;
        }

        public Criteria andBookDescriptionIsNull() {
            addCriterion("bookDescription is null");
            return (Criteria) this;
        }

        public Criteria andBookDescriptionIsNotNull() {
            addCriterion("bookDescription is not null");
            return (Criteria) this;
        }

        public Criteria andBookDescriptionEqualTo(String value) {
            addCriterion("bookDescription =", value, "bookDescription");
            return (Criteria) this;
        }

        public Criteria andBookDescriptionNotEqualTo(String value) {
            addCriterion("bookDescription <>", value, "bookDescription");
            return (Criteria) this;
        }

        public Criteria andBookDescriptionGreaterThan(String value) {
            addCriterion("bookDescription >", value, "bookDescription");
            return (Criteria) this;
        }

        public Criteria andBookDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("bookDescription >=", value, "bookDescription");
            return (Criteria) this;
        }

        public Criteria andBookDescriptionLessThan(String value) {
            addCriterion("bookDescription <", value, "bookDescription");
            return (Criteria) this;
        }

        public Criteria andBookDescriptionLessThanOrEqualTo(String value) {
            addCriterion("bookDescription <=", value, "bookDescription");
            return (Criteria) this;
        }

        public Criteria andBookDescriptionLike(String value) {
            addCriterion("bookDescription like", value, "bookDescription");
            return (Criteria) this;
        }

        public Criteria andBookDescriptionNotLike(String value) {
            addCriterion("bookDescription not like", value, "bookDescription");
            return (Criteria) this;
        }

        public Criteria andBookDescriptionIn(List<String> values) {
            addCriterion("bookDescription in", values, "bookDescription");
            return (Criteria) this;
        }

        public Criteria andBookDescriptionNotIn(List<String> values) {
            addCriterion("bookDescription not in", values, "bookDescription");
            return (Criteria) this;
        }

        public Criteria andBookDescriptionBetween(String value1, String value2) {
            addCriterion("bookDescription between", value1, value2, "bookDescription");
            return (Criteria) this;
        }

        public Criteria andBookDescriptionNotBetween(String value1, String value2) {
            addCriterion("bookDescription not between", value1, value2, "bookDescription");
            return (Criteria) this;
        }

        public Criteria andBookTagIsNull() {
            addCriterion("bookTag is null");
            return (Criteria) this;
        }

        public Criteria andBookTagIsNotNull() {
            addCriterion("bookTag is not null");
            return (Criteria) this;
        }

        public Criteria andBookTagEqualTo(String value) {
            addCriterion("bookTag =", value, "bookTag");
            return (Criteria) this;
        }

        public Criteria andBookTagNotEqualTo(String value) {
            addCriterion("bookTag <>", value, "bookTag");
            return (Criteria) this;
        }

        public Criteria andBookTagGreaterThan(String value) {
            addCriterion("bookTag >", value, "bookTag");
            return (Criteria) this;
        }

        public Criteria andBookTagGreaterThanOrEqualTo(String value) {
            addCriterion("bookTag >=", value, "bookTag");
            return (Criteria) this;
        }

        public Criteria andBookTagLessThan(String value) {
            addCriterion("bookTag <", value, "bookTag");
            return (Criteria) this;
        }

        public Criteria andBookTagLessThanOrEqualTo(String value) {
            addCriterion("bookTag <=", value, "bookTag");
            return (Criteria) this;
        }

        public Criteria andBookTagLike(String value) {
            addCriterion("bookTag like", value, "bookTag");
            return (Criteria) this;
        }

        public Criteria andBookTagNotLike(String value) {
            addCriterion("bookTag not like", value, "bookTag");
            return (Criteria) this;
        }

        public Criteria andBookTagIn(List<String> values) {
            addCriterion("bookTag in", values, "bookTag");
            return (Criteria) this;
        }

        public Criteria andBookTagNotIn(List<String> values) {
            addCriterion("bookTag not in", values, "bookTag");
            return (Criteria) this;
        }

        public Criteria andBookTagBetween(String value1, String value2) {
            addCriterion("bookTag between", value1, value2, "bookTag");
            return (Criteria) this;
        }

        public Criteria andBookTagNotBetween(String value1, String value2) {
            addCriterion("bookTag not between", value1, value2, "bookTag");
            return (Criteria) this;
        }

        public Criteria andBookChapterCountIsNull() {
            addCriterion("bookChapterCount is null");
            return (Criteria) this;
        }

        public Criteria andBookChapterCountIsNotNull() {
            addCriterion("bookChapterCount is not null");
            return (Criteria) this;
        }

        public Criteria andBookChapterCountEqualTo(Integer value) {
            addCriterion("bookChapterCount =", value, "bookChapterCount");
            return (Criteria) this;
        }

        public Criteria andBookChapterCountNotEqualTo(Integer value) {
            addCriterion("bookChapterCount <>", value, "bookChapterCount");
            return (Criteria) this;
        }

        public Criteria andBookChapterCountGreaterThan(Integer value) {
            addCriterion("bookChapterCount >", value, "bookChapterCount");
            return (Criteria) this;
        }

        public Criteria andBookChapterCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("bookChapterCount >=", value, "bookChapterCount");
            return (Criteria) this;
        }

        public Criteria andBookChapterCountLessThan(Integer value) {
            addCriterion("bookChapterCount <", value, "bookChapterCount");
            return (Criteria) this;
        }

        public Criteria andBookChapterCountLessThanOrEqualTo(Integer value) {
            addCriterion("bookChapterCount <=", value, "bookChapterCount");
            return (Criteria) this;
        }

        public Criteria andBookChapterCountIn(List<Integer> values) {
            addCriterion("bookChapterCount in", values, "bookChapterCount");
            return (Criteria) this;
        }

        public Criteria andBookChapterCountNotIn(List<Integer> values) {
            addCriterion("bookChapterCount not in", values, "bookChapterCount");
            return (Criteria) this;
        }

        public Criteria andBookChapterCountBetween(Integer value1, Integer value2) {
            addCriterion("bookChapterCount between", value1, value2, "bookChapterCount");
            return (Criteria) this;
        }

        public Criteria andBookChapterCountNotBetween(Integer value1, Integer value2) {
            addCriterion("bookChapterCount not between", value1, value2, "bookChapterCount");
            return (Criteria) this;
        }

        public Criteria andBookWordCountIsNull() {
            addCriterion("bookWordCount is null");
            return (Criteria) this;
        }

        public Criteria andBookWordCountIsNotNull() {
            addCriterion("bookWordCount is not null");
            return (Criteria) this;
        }

        public Criteria andBookWordCountEqualTo(BigDecimal value) {
            addCriterion("bookWordCount =", value, "bookWordCount");
            return (Criteria) this;
        }

        public Criteria andBookWordCountNotEqualTo(BigDecimal value) {
            addCriterion("bookWordCount <>", value, "bookWordCount");
            return (Criteria) this;
        }

        public Criteria andBookWordCountGreaterThan(BigDecimal value) {
            addCriterion("bookWordCount >", value, "bookWordCount");
            return (Criteria) this;
        }

        public Criteria andBookWordCountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("bookWordCount >=", value, "bookWordCount");
            return (Criteria) this;
        }

        public Criteria andBookWordCountLessThan(BigDecimal value) {
            addCriterion("bookWordCount <", value, "bookWordCount");
            return (Criteria) this;
        }

        public Criteria andBookWordCountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("bookWordCount <=", value, "bookWordCount");
            return (Criteria) this;
        }

        public Criteria andBookWordCountIn(List<BigDecimal> values) {
            addCriterion("bookWordCount in", values, "bookWordCount");
            return (Criteria) this;
        }

        public Criteria andBookWordCountNotIn(List<BigDecimal> values) {
            addCriterion("bookWordCount not in", values, "bookWordCount");
            return (Criteria) this;
        }

        public Criteria andBookWordCountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bookWordCount between", value1, value2, "bookWordCount");
            return (Criteria) this;
        }

        public Criteria andBookWordCountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bookWordCount not between", value1, value2, "bookWordCount");
            return (Criteria) this;
        }

        public Criteria andBookTapCountIsNull() {
            addCriterion("bookTapCount is null");
            return (Criteria) this;
        }

        public Criteria andBookTapCountIsNotNull() {
            addCriterion("bookTapCount is not null");
            return (Criteria) this;
        }

        public Criteria andBookTapCountEqualTo(Integer value) {
            addCriterion("bookTapCount =", value, "bookTapCount");
            return (Criteria) this;
        }

        public Criteria andBookTapCountNotEqualTo(Integer value) {
            addCriterion("bookTapCount <>", value, "bookTapCount");
            return (Criteria) this;
        }

        public Criteria andBookTapCountGreaterThan(Integer value) {
            addCriterion("bookTapCount >", value, "bookTapCount");
            return (Criteria) this;
        }

        public Criteria andBookTapCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("bookTapCount >=", value, "bookTapCount");
            return (Criteria) this;
        }

        public Criteria andBookTapCountLessThan(Integer value) {
            addCriterion("bookTapCount <", value, "bookTapCount");
            return (Criteria) this;
        }

        public Criteria andBookTapCountLessThanOrEqualTo(Integer value) {
            addCriterion("bookTapCount <=", value, "bookTapCount");
            return (Criteria) this;
        }

        public Criteria andBookTapCountIn(List<Integer> values) {
            addCriterion("bookTapCount in", values, "bookTapCount");
            return (Criteria) this;
        }

        public Criteria andBookTapCountNotIn(List<Integer> values) {
            addCriterion("bookTapCount not in", values, "bookTapCount");
            return (Criteria) this;
        }

        public Criteria andBookTapCountBetween(Integer value1, Integer value2) {
            addCriterion("bookTapCount between", value1, value2, "bookTapCount");
            return (Criteria) this;
        }

        public Criteria andBookTapCountNotBetween(Integer value1, Integer value2) {
            addCriterion("bookTapCount not between", value1, value2, "bookTapCount");
            return (Criteria) this;
        }

        public Criteria andBookCreateTimeIsNull() {
            addCriterion("bookCreateTime is null");
            return (Criteria) this;
        }

        public Criteria andBookCreateTimeIsNotNull() {
            addCriterion("bookCreateTime is not null");
            return (Criteria) this;
        }

        public Criteria andBookCreateTimeEqualTo(Date value) {
            addCriterion("bookCreateTime =", value, "bookCreateTime");
            return (Criteria) this;
        }

        public Criteria andBookCreateTimeNotEqualTo(Date value) {
            addCriterion("bookCreateTime <>", value, "bookCreateTime");
            return (Criteria) this;
        }

        public Criteria andBookCreateTimeGreaterThan(Date value) {
            addCriterion("bookCreateTime >", value, "bookCreateTime");
            return (Criteria) this;
        }

        public Criteria andBookCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("bookCreateTime >=", value, "bookCreateTime");
            return (Criteria) this;
        }

        public Criteria andBookCreateTimeLessThan(Date value) {
            addCriterion("bookCreateTime <", value, "bookCreateTime");
            return (Criteria) this;
        }

        public Criteria andBookCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("bookCreateTime <=", value, "bookCreateTime");
            return (Criteria) this;
        }

        public Criteria andBookCreateTimeIn(List<Date> values) {
            addCriterion("bookCreateTime in", values, "bookCreateTime");
            return (Criteria) this;
        }

        public Criteria andBookCreateTimeNotIn(List<Date> values) {
            addCriterion("bookCreateTime not in", values, "bookCreateTime");
            return (Criteria) this;
        }

        public Criteria andBookCreateTimeBetween(Date value1, Date value2) {
            addCriterion("bookCreateTime between", value1, value2, "bookCreateTime");
            return (Criteria) this;
        }

        public Criteria andBookCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("bookCreateTime not between", value1, value2, "bookCreateTime");
            return (Criteria) this;
        }

        public Criteria andBookUpdateTimeIsNull() {
            addCriterion("bookUpdateTime is null");
            return (Criteria) this;
        }

        public Criteria andBookUpdateTimeIsNotNull() {
            addCriterion("bookUpdateTime is not null");
            return (Criteria) this;
        }

        public Criteria andBookUpdateTimeEqualTo(Date value) {
            addCriterion("bookUpdateTime =", value, "bookUpdateTime");
            return (Criteria) this;
        }

        public Criteria andBookUpdateTimeNotEqualTo(Date value) {
            addCriterion("bookUpdateTime <>", value, "bookUpdateTime");
            return (Criteria) this;
        }

        public Criteria andBookUpdateTimeGreaterThan(Date value) {
            addCriterion("bookUpdateTime >", value, "bookUpdateTime");
            return (Criteria) this;
        }

        public Criteria andBookUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("bookUpdateTime >=", value, "bookUpdateTime");
            return (Criteria) this;
        }

        public Criteria andBookUpdateTimeLessThan(Date value) {
            addCriterion("bookUpdateTime <", value, "bookUpdateTime");
            return (Criteria) this;
        }

        public Criteria andBookUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("bookUpdateTime <=", value, "bookUpdateTime");
            return (Criteria) this;
        }

        public Criteria andBookUpdateTimeIn(List<Date> values) {
            addCriterion("bookUpdateTime in", values, "bookUpdateTime");
            return (Criteria) this;
        }

        public Criteria andBookUpdateTimeNotIn(List<Date> values) {
            addCriterion("bookUpdateTime not in", values, "bookUpdateTime");
            return (Criteria) this;
        }

        public Criteria andBookUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("bookUpdateTime between", value1, value2, "bookUpdateTime");
            return (Criteria) this;
        }

        public Criteria andBookUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("bookUpdateTime not between", value1, value2, "bookUpdateTime");
            return (Criteria) this;
        }
    }

    /**
     * v_user_shelf
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * VIEW 2019-12-28
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