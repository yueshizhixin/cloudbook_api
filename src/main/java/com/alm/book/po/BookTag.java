package com.alm.book.po;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 <p>table  书籍标签</p>
 <p>author lishuai</p>
 <p>time   2019-12-22</p>
*/
@ApiModel("书籍标签")
public class BookTag {
    @ApiModelProperty("主键标识")
    private Integer id;

    @ApiModelProperty("名称")
    private String name;

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
     * 名称
     * @return name 名称
     */
    public String getName() {
        return name;
    }

    /**
     * 名称
     * @param name 名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}