package com.alm.user.service;


import com.alm.system.vo.Message;
import com.alm.user.po.User;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * <p>user: LISHUAI</p>
 * <p>date: 2019-12-22 20:30/p>
 * <p>desc: </p>
 */
public interface UserService {


    /**
     * 登录
     */
    public Message signIn(User user);

    /**
     * 根据账号获取会员
     */
    public User selectUserByAccount(String account);

    /**
     * 根据主键获取会员
     */
    public User selectUserById(int id);

    /**
     * 根据主键更新会员信息
     */
    public Message updateUserById(User user);

    /**
     * 修改密码
     */
    public Message updatePassword(int id,String oldPwd,String newPwd);
}
