package com.alm.book.service.impl;

import com.alm.book.mapper.*;
import com.alm.book.po.*;
import com.alm.book.service.BookService;
import com.alm.system.vo.Message;
import com.alm.user.mapper.UserMapper;
import com.alm.user.po.UserExample;
import com.alm.util.DateUtil;
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

    private final UserMapper userMapper;

    private final BookMapper bookMapper;
    private final BookShelfMapper bookShelfMapper;
    private final BookChapterMapper bookChapterMapper;
    private final BookChapterContentMapper bookChapterContentMapper;

    private final ViewBookShelfMapper viewBookShelfMapper;


    @Autowired
    public BookServiceImpl(BookMapper bookMapper, BookShelfMapper BookShelfMapper, UserMapper userMapper, BookShelfMapper bookShelfMapper, ViewBookShelfMapper viewBookShelfMapper, BookChapterMapper bookChapterMapper, BookChapterContentMapper bookChapterContentMapper) {

        this.bookMapper = bookMapper;
        this.userMapper = userMapper;
        this.bookShelfMapper = bookShelfMapper;
        this.bookChapterMapper = bookChapterMapper;
        this.bookChapterContentMapper = bookChapterContentMapper;
        this.viewBookShelfMapper = viewBookShelfMapper;
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
     */
    @Override
    public BookChapterContent getChapterContent( BookChapter bookChapter) {
        BookChapterExample example=new BookChapterExample();
        example.createCriteria()
                .andBookIdEqualTo(bookChapter.getBookId())
                .andTitleIdEqualTo(bookChapter.getTitleId());
        List<BookChapter> list=bookChapterMapper.selectByExample(example);
        if (list.isEmpty()) {
            return null;
        }
        BookChapter bc = list.get(0);
        System.out.println(bc);
        BookChapterContentExample contentExample=new BookChapterContentExample();
        contentExample.createCriteria()
                .andChapterIdEqualTo(bc.getId());
        List<BookChapterContent> contentList=bookChapterContentMapper.selectByExampleWithBLOBs(contentExample);
        if (contentList.isEmpty()) {
            return null;
        }
        return contentList.get(0);
    }

    /**
     * 更新阅读记录
     */
    @Override
    public Message updateBookShelfReadLine(BookShelf bookShelf) {
        Message msg = new Message();

        UserExample userExample = new UserExample();
        userExample.createCriteria().andIdEqualTo(bookShelf.getUserId());
        long userCount = userMapper.countByExample(userExample);
        if (userCount != 1) {
            msg.setMsg("用户信息错误");
            return msg;
        }

        BookExample bookExample = new BookExample();
        bookExample.createCriteria().andIdEqualTo(bookShelf.getBookId());
        long bookCount = bookMapper.countByExample(bookExample);
        if (bookCount != 1) {
            msg.setMsg("书本信息错误");
            return msg;
        }

        //bookline

        BookShelfExample example = new BookShelfExample();
        example.createCriteria().andUserIdEqualTo(bookShelf.getUserId())
                .andBookIdEqualTo(bookShelf.getBookId());
        long bookShelfCount = bookShelfMapper.countByExample(example);
        if (bookShelfCount != 1) {
            msg.setMsg("阅读记录错误");
            return msg;
        }

        bookShelf.setUpdateTime(DateUtil.now());
        bookShelf.setChapterNo(bookShelf.getChapterNo());
        bookShelf.setChapterId(0);
        bookShelfMapper.updateByExampleSelective(bookShelf, example);
        msg.setOk(1);
        msg.setMsg("操作成功");
        msg.setData(bookShelf);
        return msg;
    }

    /**
     * 获取章节标题
     * 最终舍弃
     */
    @Override
    public BookChapter getChapterTitle(BookChapter bookChapter) {
        BookChapterExample example=new BookChapterExample();
        example.createCriteria()
                .andBookIdEqualTo(bookChapter.getBookId())
                .andTitleIdEqualTo(bookChapter.getTitleId());
        List<BookChapter> list=bookChapterMapper.selectByExample(example);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }
}
