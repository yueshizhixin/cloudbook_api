package com.alm.book.service.impl;

import com.alm.book.po.Book;
import com.alm.book.service.BookService;
import com.alm.user.po.User;
import com.alm.util.JSONUtil;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath*:spring/springMVC.xml"})
public class BookServiceImplTest {

    @Resource
    private BookService bookService;

    @Test
    public void getMyBookShelf() {
        System.out.println(JSONUtil.format(bookService.getMyBookShelf(1,6,1)));

    }

    @Test
    public void getShopBookList() {
        System.out.println(JSONUtil.format(bookService.getShopBookList(0,6)));

        System.out.println(JSONUtil.format(bookService.getShopBookList(1,6)));

        System.out.println(JSONUtil.format(bookService.getShopBookList(111,6)));


    }
}