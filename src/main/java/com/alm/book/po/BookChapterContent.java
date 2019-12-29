package com.alm.book.po;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 <p>table  章节内容</p>
 <p>author lishuai</p>
 <p>time   2019-12-29</p>
*/
@ApiModel("章节内容")
public class BookChapterContent {
    @ApiModelProperty("")
    private Integer id;

    @ApiModelProperty("章节表id")
    private Integer chapterId;

    @ApiModelProperty("章节表titleNo")
    private Integer titleNo;

    @ApiModelProperty("内容")
    private String content;

    /**
     * 
     * @return id 
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 章节表id
     * @return chapterId 章节表id
     */
    public Integer getChapterId() {
        return chapterId;
    }

    /**
     * 章节表id
     * @param chapterId 章节表id
     */
    public void setChapterId(Integer chapterId) {
        this.chapterId = chapterId;
    }

    /**
     * 章节表titleNo
     * @return titleNo 章节表titleNo
     */
    public Integer getTitleNo() {
        return titleNo;
    }

    /**
     * 章节表titleNo
     * @param titleNo 章节表titleNo
     */
    public void setTitleNo(Integer titleNo) {
        this.titleNo = titleNo;
    }

    /**
     * 内容
     * @return content 内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 内容
     * @param content 内容
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}