package com.alm.book.controller;

import com.alm.book.po.Book;
import com.alm.book.po.BookChapter;
import com.alm.book.po.BookChapterContent;
import com.alm.book.po.BookShelf;
import com.alm.book.service.BookService;
import com.alm.enume.SessionEnum;
import com.alm.system.authority.Authority;
import com.alm.user.po.User;
import com.alm.util.RESTUtil;
import com.github.pagehelper.Page;
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
@RequestMapping("/api/v1/book")
public class BookController {

    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @ApiOperation("书城列表")
    @RequestMapping(value = "/shop", method = RequestMethod.GET)
    public String getShopBookList(@RequestParam int offset,@RequestParam int limit) {
        return RESTUtil.HTTP200(bookService.getShopBookList(offset,limit));
    }

    /**
     * 这块一下要确认权限
     * chapterId chapterNo titleId统一起来 太轮乱了
     */

    /**
     * 没有返回lineId，默认1
     * @param offset
     * @param limit
     * @param session
     * @return
     */
    @ApiOperation("我的书架")
//    @Authority
    @RequestMapping(value = "/shelf", method = RequestMethod.GET)
    public String getMyBookShelf(@RequestParam int offset,@RequestParam int limit, HttpSession session) {
//        User user= (User) session.getAttribute(SessionEnum.user.AttrKey());
//        return RESTUtil.HTTP200(bookService.getMyBookShelf(offset,limit,user.getId()));
        return RESTUtil.HTTP200(bookService.getMyBookShelf(offset,limit,1));
    }

    @ApiOperation("书籍详情")
    @RequestMapping(value = "/{id}/detail", method = RequestMethod.GET)
    public String getBookDetail(@ModelAttribute Book book){
        return RESTUtil.HTTP200(bookService.getBookDetail(book.getId()));
    }

    @ApiOperation("书籍目录")
    @RequestMapping(value = "/{id}/chapter", method = RequestMethod.GET)
    public String getBookTitleList(@RequestParam int offset,@RequestParam int limit,@ModelAttribute Book book) {
        return RESTUtil.HTTP200(bookService.getBookTitleList(offset,limit,book.getId()));
    }

    @ApiOperation("章节内容")
    @RequestMapping(value = "/{bookId}/chapter/{titleId}/content", method = RequestMethod.GET)
    public String getChapterContent(@ModelAttribute BookChapter bookChapter) {
        return RESTUtil.HTTP200(bookService.getChapterContent(bookChapter));
    }

    @ApiOperation("更新阅读记录")
    @RequestMapping(value = "/{bookId}/chapter/{chapterNo}", method = RequestMethod.PUT)
    public String updateBookReadLine(@ModelAttribute BookShelf bookShelf) {
        int userId=1;
        bookShelf.setUserId(userId);
        return RESTUtil.HTTP200(bookService.updateBookShelfReadLine(bookShelf));
    }

    /**
     * 这个最终舍弃
     * @param bookChapter
     * @return
     */
    @ApiOperation("最终舍弃/章节标题")
    @RequestMapping(value = "/{bookId}/chapter/{titleId}/title", method = RequestMethod.GET)
    public String getChapterTitle(@ModelAttribute BookChapter bookChapter) {
        return RESTUtil.HTTP200(bookService.getChapterTitle(bookChapter));
    }

}
