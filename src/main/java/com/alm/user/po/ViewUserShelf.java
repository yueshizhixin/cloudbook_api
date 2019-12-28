package com.alm.user.po;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.util.Date;

/**
 <p>table  VIEW</p>
 <p>author lishuai</p>
 <p>time   2019-12-28</p>
*/
@ApiModel("VIEW")
public class ViewUserShelf {
    @ApiModelProperty("主键标识")
    private Integer id;

    @ApiModelProperty("用户id")
    private Integer userId;

    @ApiModelProperty("书籍id")
    private Integer bookId;

    @ApiModelProperty("阅读记录章节表id")
    private Integer chapterId;

    @ApiModelProperty("阅读记录页数")
    private Integer pageNo;

    @ApiModelProperty("阅读时长/分")
    private Integer readDuration;

    @ApiModelProperty("创建时间")
    private Date createTime;

    @ApiModelProperty("最后阅读时间")
    private Date updateTime;

    @ApiModelProperty("书名")
    private String bookName;

    @ApiModelProperty("作者")
    private String bookAuthor;

    @ApiModelProperty("作者头像")
    private String bookAuthorImage;

    @ApiModelProperty("书籍封面-垂直图")
    private String bookImageVertical;

    @ApiModelProperty("水平图")
    private String bookImageAlign;

    @ApiModelProperty("一句话描述")
    private String bookShortDescription;

    @ApiModelProperty("描述")
    private String bookDescription;

    @ApiModelProperty("标签")
    private String bookTag;

    @ApiModelProperty("章节数")
    private Integer bookChapterCount;

    @ApiModelProperty("字数/万")
    private BigDecimal bookWordCount;

    @ApiModelProperty("点击数")
    private Integer bookTapCount;

    @ApiModelProperty("创建时间")
    private Date bookCreateTime;

    @ApiModelProperty("更新时间")
    private Date bookUpdateTime;

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
     * 阅读记录章节表id
     * @return chapterId 阅读记录章节表id
     */
    public Integer getChapterId() {
        return chapterId;
    }

    /**
     * 阅读记录章节表id
     * @param chapterId 阅读记录章节表id
     */
    public void setChapterId(Integer chapterId) {
        this.chapterId = chapterId;
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
     * 阅读时长/分
     * @return readDuration 阅读时长/分
     */
    public Integer getReadDuration() {
        return readDuration;
    }

    /**
     * 阅读时长/分
     * @param readDuration 阅读时长/分
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
     * 作者
     * @return bookAuthor 作者
     */
    public String getBookAuthor() {
        return bookAuthor;
    }

    /**
     * 作者
     * @param bookAuthor 作者
     */
    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor == null ? null : bookAuthor.trim();
    }

    /**
     * 作者头像
     * @return bookAuthorImage 作者头像
     */
    public String getBookAuthorImage() {
        return bookAuthorImage;
    }

    /**
     * 作者头像
     * @param bookAuthorImage 作者头像
     */
    public void setBookAuthorImage(String bookAuthorImage) {
        this.bookAuthorImage = bookAuthorImage == null ? null : bookAuthorImage.trim();
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
     * 一句话描述
     * @return bookShortDescription 一句话描述
     */
    public String getBookShortDescription() {
        return bookShortDescription;
    }

    /**
     * 一句话描述
     * @param bookShortDescription 一句话描述
     */
    public void setBookShortDescription(String bookShortDescription) {
        this.bookShortDescription = bookShortDescription == null ? null : bookShortDescription.trim();
    }

    /**
     * 描述
     * @return bookDescription 描述
     */
    public String getBookDescription() {
        return bookDescription;
    }

    /**
     * 描述
     * @param bookDescription 描述
     */
    public void setBookDescription(String bookDescription) {
        this.bookDescription = bookDescription == null ? null : bookDescription.trim();
    }

    /**
     * 标签
     * @return bookTag 标签
     */
    public String getBookTag() {
        return bookTag;
    }

    /**
     * 标签
     * @param bookTag 标签
     */
    public void setBookTag(String bookTag) {
        this.bookTag = bookTag == null ? null : bookTag.trim();
    }

    /**
     * 章节数
     * @return bookChapterCount 章节数
     */
    public Integer getBookChapterCount() {
        return bookChapterCount;
    }

    /**
     * 章节数
     * @param bookChapterCount 章节数
     */
    public void setBookChapterCount(Integer bookChapterCount) {
        this.bookChapterCount = bookChapterCount;
    }

    /**
     * 字数/万
     * @return bookWordCount 字数/万
     */
    public BigDecimal getBookWordCount() {
        return bookWordCount;
    }

    /**
     * 字数/万
     * @param bookWordCount 字数/万
     */
    public void setBookWordCount(BigDecimal bookWordCount) {
        this.bookWordCount = bookWordCount;
    }

    /**
     * 点击数
     * @return bookTapCount 点击数
     */
    public Integer getBookTapCount() {
        return bookTapCount;
    }

    /**
     * 点击数
     * @param bookTapCount 点击数
     */
    public void setBookTapCount(Integer bookTapCount) {
        this.bookTapCount = bookTapCount;
    }

    /**
     * 创建时间
     * @return bookCreateTime 创建时间
     */
    public Date getBookCreateTime() {
        return bookCreateTime;
    }

    /**
     * 创建时间
     * @param bookCreateTime 创建时间
     */
    public void setBookCreateTime(Date bookCreateTime) {
        this.bookCreateTime = bookCreateTime;
    }

    /**
     * 更新时间
     * @return bookUpdateTime 更新时间
     */
    public Date getBookUpdateTime() {
        return bookUpdateTime;
    }

    /**
     * 更新时间
     * @param bookUpdateTime 更新时间
     */
    public void setBookUpdateTime(Date bookUpdateTime) {
        this.bookUpdateTime = bookUpdateTime;
    }
}