package com.alm.user.service.impl;

import com.alm.system.vo.Message;
import com.alm.user.mapper.UserMapper;
import com.alm.user.po.User;
import com.alm.user.po.UserExample;
import com.alm.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {
    private final UserMapper userMapper;

    @Autowired
    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    /**
     * 登录
     *
     * @param user
     * @return
     */
    @Override
    public Message signIn(User user) {
        Message msg = new Message();
        if (user.getPhone() == null || user.getPwd() == null) {
            msg.setMsg("信息错误");
            return msg;
        }
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andPhoneEqualTo(user.getPhone());
        criteria.andPwdEqualTo(user.getPwd());
        List<User> list = userMapper.selectByExample(example);
        if (list == null || list.size() != 1) {
            msg.setMsg("账号或密码错误");
            return msg;
        }
        msg.setOk(1);
        msg.setData(list.get(0));
        msg.setMsg("操作成功");
        return msg;
    }

    /**
     * 根据账号获取会员
     *
     * @param account
     * @return
     */
    @Override
    public User selectUserByAccount(String account) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andPhoneEqualTo(account);
        List<User> list = userMapper.selectByExample(example);
        if (list == null || list.size() != 1) {
            return null;
        }
        return list.get(0);
    }
}
