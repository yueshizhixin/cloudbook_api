package com.alm.user.po;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 <p>table  用户</p>
 <p>author lishuai</p>
 <p>time   2019-12-28</p>
*/
@ApiModel("用户")
public class User {
    @ApiModelProperty("用户标识")
    private Integer id;

    @ApiModelProperty("手机号")
    private String phone;

    @ApiModelProperty("电子邮箱")
    private String email;

    @JsonIgnore
    @ApiModelProperty("密码")
    private String pwd;

    @ApiModelProperty("头像图片")
    private String headImg;

    @ApiModelProperty("用户姓名")
    private String nickName;

    @ApiModelProperty("性别")
    private Integer sex;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty("创建时间")
    private Date createTime;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty("更新时间")
    private Date updateTime;

    @ApiModelProperty("是否允许登录")
    private Integer isSignable;

    /**
     * 用户标识
     * @return id 用户标识
     */
    public Integer getId() {
        return id;
    }

    /**
     * 用户标识
     * @param id 用户标识
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 手机号
     * @return phone 手机号
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 手机号
     * @param phone 手机号
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * 电子邮箱
     * @return email 电子邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 电子邮箱
     * @param email 电子邮箱
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * 密码
     * @return pwd 密码
     */
    public String getPwd() {
        return pwd;
    }

    /**
     * 密码
     * @param pwd 密码
     */
    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }

    /**
     * 头像图片
     * @return headImg 头像图片
     */
    public String getHeadImg() {
        return headImg;
    }

    /**
     * 头像图片
     * @param headImg 头像图片
     */
    public void setHeadImg(String headImg) {
        this.headImg = headImg == null ? null : headImg.trim();
    }

    /**
     * 用户姓名
     * @return nickName 用户姓名
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * 用户姓名
     * @param nickName 用户姓名
     */
    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    /**
     * 性别
     * @return sex 性别
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * 性别
     * @param sex 性别
     */
    public void setSex(Integer sex) {
        this.sex = sex;
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

    /**
     * 是否允许登录
     * @return isSignable 是否允许登录
     */
    public Integer getIsSignable() {
        return isSignable;
    }

    /**
     * 是否允许登录
     * @param isSignable 是否允许登录
     */
    public void setIsSignable(Integer isSignable) {
        this.isSignable = isSignable;
    }
}