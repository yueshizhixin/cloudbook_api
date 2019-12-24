package com.alm.user.service.impl;

import com.alm.user.po.User;
import com.alm.user.service.UserService;
import com.alm.util.JSONUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath*:spring/springMVC.xml"})
public class UserServiceImplTest {

    @Resource
    private UserService userService;

    @Test
    public void signIn() {
        User user =new User();
        user.setPhone("13127043375");
        user.setPwd("1");

        System.out.println(JSONUtil.format(userService.signIn(user)));
    }
}