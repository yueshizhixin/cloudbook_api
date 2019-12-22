package com.alm.book.controller;

import com.alm.book.service.BookService;
import com.alm.system.authority.Authority;
import com.alm.system.enume.SessionEnum;
import com.alm.user.po.User;
import com.alm.util.RESTUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
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

    @ApiOperation("列表")
    @RequestMapping(value = "/book", method = RequestMethod.GET)
    public String getNoteSimpleList() {
        return RESTUtil.HTTP200(bookService.getBookList());
    }


}
