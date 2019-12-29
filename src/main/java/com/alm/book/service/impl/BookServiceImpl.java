package com.alm.book.service.impl;

import com.alm.book.mapper.*;
import com.alm.book.po.*;
import com.alm.book.service.BookService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * <p>user: LISHUAI</p>
 * <p>date: 2019-12-22 20:31/p>
 * <p>desc: </p>
 */
@Service("bookService")
public class BookServiceImpl implements BookService {

    private final BookMapper bookMapper;
    private final ViewBookShelfMapper viewBookShelfMapper;
    private final BookChapterMapper bookChapterMapper;
    private final BookChapterContentMapper bookChapterContentMapper;

    @Autowired
    public BookServiceImpl(BookMapper bookMapper, BookShelfMapper BookShelfMapper, ViewBookShelfMapper viewBookShelfMapper, BookChapterMapper bookChapterMapper, BookChapterContentMapper bookChapterContentMapper) {
        this.bookMapper = bookMapper;
        this.viewBookShelfMapper = viewBookShelfMapper;
        this.bookChapterMapper = bookChapterMapper;
        this.bookChapterContentMapper = bookChapterContentMapper;
    }

    /**
     * 获取商城所有书籍
     */
    @Override
    public List<Book> getShopBookList(int offset, int limit) {

        BookExample example = new BookExample();
        example.setOrderByClause("id asc");
        PageHelper.startPage(offset, limit);
        List<Book> list = bookMapper.selectByExample(example);
        return list;
    }

    /**
     * 获取我的书架
     */
    @Override
    public List<ViewBookShelf> getMyBookShelf(int offset, int limit, int userId) {
        ViewBookShelfExample example = new ViewBookShelfExample();
        example.createCriteria().andUserIdEqualTo(userId);
        example.setOrderByClause("updateTime desc");
        PageHelper.startPage(offset, limit);
        return viewBookShelfMapper.selectByExample(example);
    }

    /**
     * 获取书籍详情
     */
    @Override
    public Book getBookDetail(int bookId) {
        return bookMapper.selectByPrimaryKey(bookId);
    }

    /**
     * 获取书籍目录
     */
    @Override
    public List<BookChapter> getBookTitleList(int offset, int limit, int bookId) {
        BookChapterExample example = new BookChapterExample();
        example.createCriteria().andBookIdEqualTo(bookId);
        example.setOrderByClause("titleId asc");
        PageHelper.startPage(offset, limit);
        List<BookChapter> list = bookChapterMapper.selectByExample(example);
        return list;
    }

    /**
     * 获取章节内容
     * @param id 章节表id
     */
    @Override
    public BookChapterContent getChapterContent(int id) {
        return bookChapterContentMapper.selectByPrimaryKey(id);
    }
}
