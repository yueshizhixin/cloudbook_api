package com.alm.book.controller;

import com.alm.book.po.Book;
import com.alm.book.service.BookService;
import com.alm.enume.SessionEnum;
import com.alm.system.authority.Authority;
import com.alm.user.po.User;
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
@Api(value = "书籍")
@RestController
@RequestMapping("/api")
public class BookController {

    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @ApiOperation("书城列表")
    @RequestMapping(value = "/book", method = RequestMethod.GET)
    public String getBookShopList() {
        return RESTUtil.HTTP200(bookService.getBookShopList());
    }

    @ApiOperation("我的书架")
    @Authority
    @RequestMapping(value = "/shelf", method = RequestMethod.GET)
    public String getMyBookShelf(HttpSession session) {
        User user= (User) session.getAttribute(SessionEnum.user.AttrKey());
        return RESTUtil.HTTP200(bookService.getMyBookShelf(user.getId()));
    }

    @ApiOperation("书籍详情")
    @RequestMapping(value = "/book/{id}", method = RequestMethod.GET)
    public String getBookDetail(@ModelAttribute Book book){
        return RESTUtil.HTTP200(bookService.getBookDetail(book.getId()));
    }


}
