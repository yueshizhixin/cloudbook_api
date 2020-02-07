package com.alm.user.controller;

import com.alm.enume.AuthEnum;
import com.alm.user.po.User;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath*:spring/springMVC.xml"})
public class UserControllerTest {

    @Autowired
    private WebApplicationContext wac;

    private MockMvc mockMvc;

    @Before
    public void before() {
        this.mockMvc = webAppContextSetup(this.wac).build();
    }

    @Test
    public void signIn() {
        try {
            mockMvc.perform((post("/api/v1/user/tag=sign=in")
                    .accept(MediaType.parseMediaType("application/json;charset=UTF-8"))
                    .param("phone", "13127043375")
                    .param("pwd", "13127043375")
            )).andDo(MockMvcResultHandlers.print());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void getMyMessage() {
        try {
            mockMvc.perform((get("/api/v1/user/tag=me")
                    .accept(MediaType.parseMediaType("application/json;charset=UTF-8"))
            )).andDo(MockMvcResultHandlers.print());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void updateMyMessage() {
        try {
            User user = new User(2);
            mockMvc.perform((put("/api/v1/user/me")
                    .accept(MediaType.parseMediaType("application/json;charset=UTF-8"))
                    .requestAttr(AuthEnum.user.key(),user)
                    .param("nickName", "123123")
            )).andDo(MockMvcResultHandlers.print());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}