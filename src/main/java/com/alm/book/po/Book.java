package com.alm.book.po;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.util.Date;

/**
 <p>table  书籍</p>
 <p>author lishuai</p>
 <p>time   2019-12-28</p>
*/
@ApiModel("书籍")
public class Book {
    @ApiModelProperty("主键标识")
    private Integer id;

    @ApiModelProperty("书名")
    private String name;

    @ApiModelProperty("作者")
    private String author;

    @ApiModelProperty("作者头像")
    private String authorImage;

    @ApiModelProperty("水平图")
    private String bookImageAlign;

    @ApiModelProperty("书籍封面-垂直图")
    private String bookImageVertical;

    @ApiModelProperty("一句话描述")
    private String shortDescription;

    @ApiModelProperty("描述")
    private String description;

    @ApiModelProperty("标签")
    private String tag;

    @ApiModelProperty("章节数")
    private Integer chapterCount;

    @ApiModelProperty("字数/万")
    private BigDecimal wordCount;

    @ApiModelProperty("点击数")
    private Integer tapCount;

    @ApiModelProperty("创建时间")
    private Date createTime;

    @ApiModelProperty("更新时间")
    private Date updateTime;

    /**
     * 主键标识
     * @return id 主键标识
     */
    public Integer getId() {
        return id;
    }

    /**
     * 主键标识
     * @param id 主键标识
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 书名
     * @return name 书名
     */
    public String getName() {
        return name;
    }

    /**
     * 书名
     * @param name 书名
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 作者
     * @return author 作者
     */
    public String getAuthor() {
        return author;
    }

    /**
     * 作者
     * @param author 作者
     */
    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    /**
     * 作者头像
     * @return authorImage 作者头像
     */
    public String getAuthorImage() {
        return authorImage;
    }

    /**
     * 作者头像
     * @param authorImage 作者头像
     */
    public void setAuthorImage(String authorImage) {
        this.authorImage = authorImage == null ? null : authorImage.trim();
    }

    /**
     * 水平图
     * @return bookImageAlign 水平图
     */
    public String getBookImageAlign() {
        return bookImageAlign;
    }

    /**
     * 水平图
     * @param bookImageAlign 水平图
     */
    public void setBookImageAlign(String bookImageAlign) {
        this.bookImageAlign = bookImageAlign == null ? null : bookImageAlign.trim();
    }

    /**
     * 书籍封面-垂直图
     * @return bookImageVertical 书籍封面-垂直图
     */
    public String getBookImageVertical() {
        return bookImageVertical;
    }

    /**
     * 书籍封面-垂直图
     * @param bookImageVertical 书籍封面-垂直图
     */
    public void setBookImageVertical(String bookImageVertical) {
        this.bookImageVertical = bookImageVertical == null ? null : bookImageVertical.trim();
    }

    /**
     * 一句话描述
     * @return shortDescription 一句话描述
     */
    public String getShortDescription() {
        return shortDescription;
    }

    /**
     * 一句话描述
     * @param shortDescription 一句话描述
     */
    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription == null ? null : shortDescription.trim();
    }

    /**
     * 描述
     * @return description 描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 描述
     * @param description 描述
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * 标签
     * @return tag 标签
     */
    public String getTag() {
        return tag;
    }

    /**
     * 标签
     * @param tag 标签
     */
    public void setTag(String tag) {
        this.tag = tag == null ? null : tag.trim();
    }

    /**
     * 章节数
     * @return chapterCount 章节数
     */
    public Integer getChapterCount() {
        return chapterCount;
    }

    /**
     * 章节数
     * @param chapterCount 章节数
     */
    public void setChapterCount(Integer chapterCount) {
        this.chapterCount = chapterCount;
    }

    /**
     * 字数/万
     * @return wordCount 字数/万
     */
    public BigDecimal getWordCount() {
        return wordCount;
    }

    /**
     * 字数/万
     * @param wordCount 字数/万
     */
    public void setWordCount(BigDecimal wordCount) {
        this.wordCount = wordCount;
    }

    /**
     * 点击数
     * @return tapCount 点击数
     */
    public Integer getTapCount() {
        return tapCount;
    }

    /**
     * 点击数
     * @param tapCount 点击数
     */
    public void setTapCount(Integer tapCount) {
        this.tapCount = tapCount;
    }

    /**
     * 创建时间
     * @return createTime 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 更新时间
     * @return updateTime 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 更新时间
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}