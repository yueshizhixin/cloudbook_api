package com.alm.user.controller;

import com.alm.system.authority.Authority;
import com.alm.enume.AuthEnum;
import com.alm.system.version.CommonVersion;
import com.alm.system.version.CommonVersionCheckType;
import com.alm.system.vo.Message;
import com.alm.user.po.User;
import com.alm.user.service.UserService;
import com.alm.util.JSONUtil;
import com.alm.util.JWTUtil;
import com.alm.util.RESTUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

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
    public String signIn(@RequestParam String phone, @RequestParam String pwd, HttpServletRequest req) {
        User user = new User();
        user.setPhone(phone);
        user.setPwd(pwd);
        Message msg = userService.signIn(user);
        if (msg.getOk() == 1) {
            String jwt = JWTUtil.createUserToken((User) msg.getData());
            msg.setData(jwt);
        }
        return JSONUtil.format(msg);
    }

    @ApiOperation("登出")
    @Authority
    @RequestMapping(value = "/tag=sign=out", method = RequestMethod.POST)
    public String signOut(HttpServletRequest req) {
        Message msg = new Message(1);
        return JSONUtil.format(msg);
    }

    @ApiOperation("获取我的信息")
    @Authority
    @RequestMapping(value = "/tag=me", method = RequestMethod.GET)
    public String getMyMessage(HttpServletRequest req) {
        User me = (User) req.getAttribute(AuthEnum.user.key());
        me = userService.selectUserById(me.getId());
        return RESTUtil.HTTP200(me);
    }

    @ApiOperation("更新我的信息")
    @Authority
    @CommonVersion(method = {CommonVersionCheckType.CLIENT_VERSION})
    @RequestMapping(value = "/me", method = {RequestMethod.PUT})
    public String updateMyMessage(@ModelAttribute User user,HttpServletRequest req) {
        int userId = ((User) req.getAttribute(AuthEnum.user.key())).getId();
        user.setId(userId);
        return JSONUtil.format(userService.updateUserById(user));
    }

    @ApiOperation("修改密码")
    @Authority
    @CommonVersion(method = {CommonVersionCheckType.CLIENT_VERSION})
    @RequestMapping(value = "/me/pwd", method = {RequestMethod.PUT})
    public String updatePassword(@RequestParam String oldPwd,@RequestParam String newPwd,HttpServletRequest req) {
        int userId = ((User) req.getAttribute(AuthEnum.user.key())).getId();
        return JSONUtil.format(userService.updatePassword(userId,oldPwd,newPwd));
    }
}
