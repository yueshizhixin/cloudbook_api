package com.alm.book.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BookExample {
    /**
     * t_book
     */
    protected String orderByClause;

    /**
     * t_book
     */
    protected boolean distinct;

    /**
     * t_book
     */
    protected List<Criteria> oredCriteria;

    public BookExample() {
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
     * 书籍 2019-12-24
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

        public Criteria andAuthorIsNull() {
            addCriterion("author is null");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNotNull() {
            addCriterion("author is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorEqualTo(String value) {
            addCriterion("author =", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotEqualTo(String value) {
            addCriterion("author <>", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThan(String value) {
            addCriterion("author >", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("author >=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThan(String value) {
            addCriterion("author <", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThanOrEqualTo(String value) {
            addCriterion("author <=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLike(String value) {
            addCriterion("author like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotLike(String value) {
            addCriterion("author not like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorIn(List<String> values) {
            addCriterion("author in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotIn(List<String> values) {
            addCriterion("author not in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorBetween(String value1, String value2) {
            addCriterion("author between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotBetween(String value1, String value2) {
            addCriterion("author not between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorImageIsNull() {
            addCriterion("authorImage is null");
            return (Criteria) this;
        }

        public Criteria andAuthorImageIsNotNull() {
            addCriterion("authorImage is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorImageEqualTo(String value) {
            addCriterion("authorImage =", value, "authorImage");
            return (Criteria) this;
        }

        public Criteria andAuthorImageNotEqualTo(String value) {
            addCriterion("authorImage <>", value, "authorImage");
            return (Criteria) this;
        }

        public Criteria andAuthorImageGreaterThan(String value) {
            addCriterion("authorImage >", value, "authorImage");
            return (Criteria) this;
        }

        public Criteria andAuthorImageGreaterThanOrEqualTo(String value) {
            addCriterion("authorImage >=", value, "authorImage");
            return (Criteria) this;
        }

        public Criteria andAuthorImageLessThan(String value) {
            addCriterion("authorImage <", value, "authorImage");
            return (Criteria) this;
        }

        public Criteria andAuthorImageLessThanOrEqualTo(String value) {
            addCriterion("authorImage <=", value, "authorImage");
            return (Criteria) this;
        }

        public Criteria andAuthorImageLike(String value) {
            addCriterion("authorImage like", value, "authorImage");
            return (Criteria) this;
        }

        public Criteria andAuthorImageNotLike(String value) {
            addCriterion("authorImage not like", value, "authorImage");
            return (Criteria) this;
        }

        public Criteria andAuthorImageIn(List<String> values) {
            addCriterion("authorImage in", values, "authorImage");
            return (Criteria) this;
        }

        public Criteria andAuthorImageNotIn(List<String> values) {
            addCriterion("authorImage not in", values, "authorImage");
            return (Criteria) this;
        }

        public Criteria andAuthorImageBetween(String value1, String value2) {
            addCriterion("authorImage between", value1, value2, "authorImage");
            return (Criteria) this;
        }

        public Criteria andAuthorImageNotBetween(String value1, String value2) {
            addCriterion("authorImage not between", value1, value2, "authorImage");
            return (Criteria) this;
        }

        public Criteria andBookImageIsNull() {
            addCriterion("bookImage is null");
            return (Criteria) this;
        }

        public Criteria andBookImageIsNotNull() {
            addCriterion("bookImage is not null");
            return (Criteria) this;
        }

        public Criteria andBookImageEqualTo(String value) {
            addCriterion("bookImage =", value, "bookImage");
            return (Criteria) this;
        }

        public Criteria andBookImageNotEqualTo(String value) {
            addCriterion("bookImage <>", value, "bookImage");
            return (Criteria) this;
        }

        public Criteria andBookImageGreaterThan(String value) {
            addCriterion("bookImage >", value, "bookImage");
            return (Criteria) this;
        }

        public Criteria andBookImageGreaterThanOrEqualTo(String value) {
            addCriterion("bookImage >=", value, "bookImage");
            return (Criteria) this;
        }

        public Criteria andBookImageLessThan(String value) {
            addCriterion("bookImage <", value, "bookImage");
            return (Criteria) this;
        }

        public Criteria andBookImageLessThanOrEqualTo(String value) {
            addCriterion("bookImage <=", value, "bookImage");
            return (Criteria) this;
        }

        public Criteria andBookImageLike(String value) {
            addCriterion("bookImage like", value, "bookImage");
            return (Criteria) this;
        }

        public Criteria andBookImageNotLike(String value) {
            addCriterion("bookImage not like", value, "bookImage");
            return (Criteria) this;
        }

        public Criteria andBookImageIn(List<String> values) {
            addCriterion("bookImage in", values, "bookImage");
            return (Criteria) this;
        }

        public Criteria andBookImageNotIn(List<String> values) {
            addCriterion("bookImage not in", values, "bookImage");
            return (Criteria) this;
        }

        public Criteria andBookImageBetween(String value1, String value2) {
            addCriterion("bookImage between", value1, value2, "bookImage");
            return (Criteria) this;
        }

        public Criteria andBookImageNotBetween(String value1, String value2) {
            addCriterion("bookImage not between", value1, value2, "bookImage");
            return (Criteria) this;
        }

        public Criteria andShortDescriptionIsNull() {
            addCriterion("shortDescription is null");
            return (Criteria) this;
        }

        public Criteria andShortDescriptionIsNotNull() {
            addCriterion("shortDescription is not null");
            return (Criteria) this;
        }

        public Criteria andShortDescriptionEqualTo(String value) {
            addCriterion("shortDescription =", value, "shortDescription");
            return (Criteria) this;
        }

        public Criteria andShortDescriptionNotEqualTo(String value) {
            addCriterion("shortDescription <>", value, "shortDescription");
            return (Criteria) this;
        }

        public Criteria andShortDescriptionGreaterThan(String value) {
            addCriterion("shortDescription >", value, "shortDescription");
            return (Criteria) this;
        }

        public Criteria andShortDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("shortDescription >=", value, "shortDescription");
            return (Criteria) this;
        }

        public Criteria andShortDescriptionLessThan(String value) {
            addCriterion("shortDescription <", value, "shortDescription");
            return (Criteria) this;
        }

        public Criteria andShortDescriptionLessThanOrEqualTo(String value) {
            addCriterion("shortDescription <=", value, "shortDescription");
            return (Criteria) this;
        }

        public Criteria andShortDescriptionLike(String value) {
            addCriterion("shortDescription like", value, "shortDescription");
            return (Criteria) this;
        }

        public Criteria andShortDescriptionNotLike(String value) {
            addCriterion("shortDescription not like", value, "shortDescription");
            return (Criteria) this;
        }

        public Criteria andShortDescriptionIn(List<String> values) {
            addCriterion("shortDescription in", values, "shortDescription");
            return (Criteria) this;
        }

        public Criteria andShortDescriptionNotIn(List<String> values) {
            addCriterion("shortDescription not in", values, "shortDescription");
            return (Criteria) this;
        }

        public Criteria andShortDescriptionBetween(String value1, String value2) {
            addCriterion("shortDescription between", value1, value2, "shortDescription");
            return (Criteria) this;
        }

        public Criteria andShortDescriptionNotBetween(String value1, String value2) {
            addCriterion("shortDescription not between", value1, value2, "shortDescription");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andTagIsNull() {
            addCriterion("tag is null");
            return (Criteria) this;
        }

        public Criteria andTagIsNotNull() {
            addCriterion("tag is not null");
            return (Criteria) this;
        }

        public Criteria andTagEqualTo(String value) {
            addCriterion("tag =", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotEqualTo(String value) {
            addCriterion("tag <>", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagGreaterThan(String value) {
            addCriterion("tag >", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagGreaterThanOrEqualTo(String value) {
            addCriterion("tag >=", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLessThan(String value) {
            addCriterion("tag <", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLessThanOrEqualTo(String value) {
            addCriterion("tag <=", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLike(String value) {
            addCriterion("tag like", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotLike(String value) {
            addCriterion("tag not like", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagIn(List<String> values) {
            addCriterion("tag in", values, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotIn(List<String> values) {
            addCriterion("tag not in", values, "tag");
            return (Criteria) this;
        }

        public Criteria andTagBetween(String value1, String value2) {
            addCriterion("tag between", value1, value2, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotBetween(String value1, String value2) {
            addCriterion("tag not between", value1, value2, "tag");
            return (Criteria) this;
        }

        public Criteria andChapterCountIsNull() {
            addCriterion("chapterCount is null");
            return (Criteria) this;
        }

        public Criteria andChapterCountIsNotNull() {
            addCriterion("chapterCount is not null");
            return (Criteria) this;
        }

        public Criteria andChapterCountEqualTo(Integer value) {
            addCriterion("chapterCount =", value, "chapterCount");
            return (Criteria) this;
        }

        public Criteria andChapterCountNotEqualTo(Integer value) {
            addCriterion("chapterCount <>", value, "chapterCount");
            return (Criteria) this;
        }

        public Criteria andChapterCountGreaterThan(Integer value) {
            addCriterion("chapterCount >", value, "chapterCount");
            return (Criteria) this;
        }

        public Criteria andChapterCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("chapterCount >=", value, "chapterCount");
            return (Criteria) this;
        }

        public Criteria andChapterCountLessThan(Integer value) {
            addCriterion("chapterCount <", value, "chapterCount");
            return (Criteria) this;
        }

        public Criteria andChapterCountLessThanOrEqualTo(Integer value) {
            addCriterion("chapterCount <=", value, "chapterCount");
            return (Criteria) this;
        }

        public Criteria andChapterCountIn(List<Integer> values) {
            addCriterion("chapterCount in", values, "chapterCount");
            return (Criteria) this;
        }

        public Criteria andChapterCountNotIn(List<Integer> values) {
            addCriterion("chapterCount not in", values, "chapterCount");
            return (Criteria) this;
        }

        public Criteria andChapterCountBetween(Integer value1, Integer value2) {
            addCriterion("chapterCount between", value1, value2, "chapterCount");
            return (Criteria) this;
        }

        public Criteria andChapterCountNotBetween(Integer value1, Integer value2) {
            addCriterion("chapterCount not between", value1, value2, "chapterCount");
            return (Criteria) this;
        }

        public Criteria andWordCountIsNull() {
            addCriterion("wordCount is null");
            return (Criteria) this;
        }

        public Criteria andWordCountIsNotNull() {
            addCriterion("wordCount is not null");
            return (Criteria) this;
        }

        public Criteria andWordCountEqualTo(BigDecimal value) {
            addCriterion("wordCount =", value, "wordCount");
            return (Criteria) this;
        }

        public Criteria andWordCountNotEqualTo(BigDecimal value) {
            addCriterion("wordCount <>", value, "wordCount");
            return (Criteria) this;
        }

        public Criteria andWordCountGreaterThan(BigDecimal value) {
            addCriterion("wordCount >", value, "wordCount");
            return (Criteria) this;
        }

        public Criteria andWordCountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("wordCount >=", value, "wordCount");
            return (Criteria) this;
        }

        public Criteria andWordCountLessThan(BigDecimal value) {
            addCriterion("wordCount <", value, "wordCount");
            return (Criteria) this;
        }

        public Criteria andWordCountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("wordCount <=", value, "wordCount");
            return (Criteria) this;
        }

        public Criteria andWordCountIn(List<BigDecimal> values) {
            addCriterion("wordCount in", values, "wordCount");
            return (Criteria) this;
        }

        public Criteria andWordCountNotIn(List<BigDecimal> values) {
            addCriterion("wordCount not in", values, "wordCount");
            return (Criteria) this;
        }

        public Criteria andWordCountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("wordCount between", value1, value2, "wordCount");
            return (Criteria) this;
        }

        public Criteria andWordCountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("wordCount not between", value1, value2, "wordCount");
            return (Criteria) this;
        }

        public Criteria andTapCountIsNull() {
            addCriterion("tapCount is null");
            return (Criteria) this;
        }

        public Criteria andTapCountIsNotNull() {
            addCriterion("tapCount is not null");
            return (Criteria) this;
        }

        public Criteria andTapCountEqualTo(Integer value) {
            addCriterion("tapCount =", value, "tapCount");
            return (Criteria) this;
        }

        public Criteria andTapCountNotEqualTo(Integer value) {
            addCriterion("tapCount <>", value, "tapCount");
            return (Criteria) this;
        }

        public Criteria andTapCountGreaterThan(Integer value) {
            addCriterion("tapCount >", value, "tapCount");
            return (Criteria) this;
        }

        public Criteria andTapCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("tapCount >=", value, "tapCount");
            return (Criteria) this;
        }

        public Criteria andTapCountLessThan(Integer value) {
            addCriterion("tapCount <", value, "tapCount");
            return (Criteria) this;
        }

        public Criteria andTapCountLessThanOrEqualTo(Integer value) {
            addCriterion("tapCount <=", value, "tapCount");
            return (Criteria) this;
        }

        public Criteria andTapCountIn(List<Integer> values) {
            addCriterion("tapCount in", values, "tapCount");
            return (Criteria) this;
        }

        public Criteria andTapCountNotIn(List<Integer> values) {
            addCriterion("tapCount not in", values, "tapCount");
            return (Criteria) this;
        }

        public Criteria andTapCountBetween(Integer value1, Integer value2) {
            addCriterion("tapCount between", value1, value2, "tapCount");
            return (Criteria) this;
        }

        public Criteria andTapCountNotBetween(Integer value1, Integer value2) {
            addCriterion("tapCount not between", value1, value2, "tapCount");
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
     * t_book
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 书籍 2019-12-24
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