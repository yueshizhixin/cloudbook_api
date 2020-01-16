package com.alm.book.po;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 <p>table  书本章节</p>
 <p>author lishuai</p>
 <p>time   2019-12-31</p>
*/
@ApiModel("书本章节")
public class BookChapter {
    @ApiModelProperty("主键标识")
    private Integer id;

    @ApiModelProperty("书本id")
    private Integer bookId;

    @ApiModelProperty("书名")
    private String bookName;

    @ApiModelProperty("线路Id")
    private Integer lineId;

    @ApiModelProperty("线路名称")
    private String lineName;

    @ApiModelProperty("章节序数")
    private Integer titleId;

    @ApiModelProperty("标题")
    private String title;

    @ApiModelProperty("创建时间")
    private Date createTime;

    @ApiModelProperty("更新时间")
    private Date updateTime;

    @Override
    public String toString() {
        return "BookChapter{" +
                "id=" + id +
                ", bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", lineId=" + lineId +
                ", lineName='" + lineName + '\'' +
                ", titleId=" + titleId +
                ", title='" + title + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }

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
     * 书本id
     * @return bookId 书本id
     */
    public Integer getBookId() {
        return bookId;
    }

    /**
     * 书本id
     * @param bookId 书本id
     */
    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    /**
     * 书名
     * @return bookName 书名
     */
    public String getBookName() {
        return bookName;
    }

    /**
     * 书名
     * @param bookName 书名
     */
    public void setBookName(String bookName) {
        this.bookName = bookName == null ? null : bookName.trim();
    }

    /**
     * 线路Id
     * @return lineId 线路Id
     */
    public Integer getLineId() {
        return lineId;
    }

    /**
     * 线路Id
     * @param lineId 线路Id
     */
    public void setLineId(Integer lineId) {
        this.lineId = lineId;
    }

    /**
     * 线路名称
     * @return lineName 线路名称
     */
    public String getLineName() {
        return lineName;
    }

    /**
     * 线路名称
     * @param lineName 线路名称
     */
    public void setLineName(String lineName) {
        this.lineName = lineName == null ? null : lineName.trim();
    }

    /**
     * 章节序数
     * @return titleId 章节序数
     */
    public Integer getTitleId() {
        return titleId;
    }

    /**
     * 章节序数
     * @param titleId 章节序数
     */
    public void setTitleId(Integer titleId) {
        this.titleId = titleId;
    }

    /**
     * 标题
     * @return title 标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 标题
     * @param title 标题
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
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