package com.alm.user.controller;

import com.alm.system.authority.Authority;
import com.alm.enume.SessionEnum;
import com.alm.system.vo.Message;
import com.alm.user.po.User;
import com.alm.user.service.UserService;
import com.alm.util.JSONUtil;
import com.alm.util.RESTUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

/**
 * Created by IntelliJ IDEA.
 * <p>user: LISHUAI</p>
 * <p>date: 2019-12-22 20:29/p>
 * <p>desc: </p>
 */
@Api(value = "用户")
@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @ApiOperation("登录")
    @RequestMapping(value = "/tag=sign=in", method = RequestMethod.POST)
    public String signIn(@RequestParam String phone, @RequestParam String pwd, HttpSession session) {
        User user = new User();
        user.setPhone(phone);
        user.setPwd(pwd);
        Message msg = userService.signIn(user);
        if (msg.getOk() == 1) {
            session.setAttribute(SessionEnum.user.AttrKey(), msg.getData());
        }
        return JSONUtil.format(msg);
    }

    @ApiOperation("登出")
    @Authority
    @RequestMapping(value = "/tag=sign=out", method = RequestMethod.POST)
    public String signOut(HttpSession session) {
        session.setAttribute(SessionEnum.user.AttrKey(), null);
        Message msg = new Message(1);
        return JSONUtil.format(msg);
    }

    @ApiOperation("获取我的信息")
    @Authority
    @RequestMapping(value = "/tag=me", method = RequestMethod.GET)
    public String myMessage(HttpSession session) {
        User user = (User) session.getAttribute(SessionEnum.user.AttrKey());
        return RESTUtil.HTTP200(user);
    }


}
