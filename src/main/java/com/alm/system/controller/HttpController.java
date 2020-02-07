package com.alm.system.controller;

import com.alm.util.RESTUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by IntelliJ IDEA.
 * <p>user: LISHUAI</p>
 * <p>date: 2018-12-23 20:27</p>
 * <p>desc: </p>
 */
@RestController
@RequestMapping("/api")
public class HttpController {

    @ResponseBody
    @RequestMapping("/200ok=0")
    public String HTTP200ok0(HttpServletRequest req) {
        String msg = (String) req.getAttribute("msg");
        return RESTUtil.HTTP200(0,msg);
    }

    @ResponseBody
    @RequestMapping("/401")
    public String HTTP401() {
        return RESTUtil.HTTP401();
    }

    @ResponseBody
    @RequestMapping("/403")
    public String HTTP403() {
        return RESTUtil.HTTP403();
    }

    @ResponseBody
    @RequestMapping("/500")
    public String HTTP500() {
        return RESTUtil.HTTP500();
    }
}
