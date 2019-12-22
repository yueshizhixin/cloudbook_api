package com.alm.user.po;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 <p>table  我的书架</p>
 <p>author lishuai</p>
 <p>time   2019-12-22</p>
*/
@ApiModel("我的书架")
public class UserShelf {
    @ApiModelProperty("主键标识")
    private Integer id;

    @ApiModelProperty("用户id")
    private Integer userId;

    @ApiModelProperty("书籍id")
    private Integer bookId;

    @ApiModelProperty("阅读记录章节id")
    private Integer chapterId;

    @ApiModelProperty("阅读记录序数")
    private Integer chapterNo;

    @ApiModelProperty("阅读记录页数")
    private Integer pageNo;

    @ApiModelProperty("阅读时长")
    private Integer readDuration;

    @ApiModelProperty("创建时间")
    private Date createTime;

    @ApiModelProperty("最后阅读时间")
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
     * 用户id
     * @return userId 用户id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 用户id
     * @param userId 用户id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 书籍id
     * @return bookId 书籍id
     */
    public Integer getBookId() {
        return bookId;
    }

    /**
     * 书籍id
     * @param bookId 书籍id
     */
    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    /**
     * 阅读记录章节id
     * @return chapterId 阅读记录章节id
     */
    public Integer getChapterId() {
        return chapterId;
    }

    /**
     * 阅读记录章节id
     * @param chapterId 阅读记录章节id
     */
    public void setChapterId(Integer chapterId) {
        this.chapterId = chapterId;
    }

    /**
     * 阅读记录序数
     * @return chapterNo 阅读记录序数
     */
    public Integer getChapterNo() {
        return chapterNo;
    }

    /**
     * 阅读记录序数
     * @param chapterNo 阅读记录序数
     */
    public void setChapterNo(Integer chapterNo) {
        this.chapterNo = chapterNo;
    }

    /**
     * 阅读记录页数
     * @return pageNo 阅读记录页数
     */
    public Integer getPageNo() {
        return pageNo;
    }

    /**
     * 阅读记录页数
     * @param pageNo 阅读记录页数
     */
    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    /**
     * 阅读时长
     * @return readDuration 阅读时长
     */
    public Integer getReadDuration() {
        return readDuration;
    }

    /**
     * 阅读时长
     * @param readDuration 阅读时长
     */
    public void setReadDuration(Integer readDuration) {
        this.readDuration = readDuration;
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
     * 最后阅读时间
     * @return updateTime 最后阅读时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 最后阅读时间
     * @param updateTime 最后阅读时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}