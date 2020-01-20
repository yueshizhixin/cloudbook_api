package com.alm.book.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.WebApplicationContext;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath*:spring/springMVC.xml"})
public class BookControllerTest {

    @Autowired
    private WebApplicationContext wac;

    private MockMvc mockMvc;

    @Before
    public void before() {
        this.mockMvc = webAppContextSetup(this.wac).build();
    }

    @Test
    public void getChapterTitle() {
        try {
            mockMvc.perform((get("/api/v1/book/31/chapter/1/title")
                    .accept(MediaType.parseMediaType("application/json;charset=UTF-8"))
            )).andDo(MockMvcResultHandlers.print());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Test
    public void getChapterContent() {
        try {
            mockMvc.perform((get("/api/v1/book/31/chapter/1/content")
                    .accept(MediaType.parseMediaType("application/json;charset=UTF-8"))
            )).andDo(MockMvcResultHandlers.print());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}