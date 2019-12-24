package com.alm.book.service.impl;

import com.alm.book.service.BookService;
import com.alm.user.po.User;
import com.alm.util.JSONUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath*:spring/springMVC.xml"})
public class BookServiceImplTest {

    @Resource
    private BookService bookService;

    @Test
    public void getMyBookShelf() {
        System.out.println(JSONUtil.format(bookService.getMyBookShelf(1)));

    }
}