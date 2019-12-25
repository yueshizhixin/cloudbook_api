package com.alm.book.service.impl;

import com.alm.book.mapper.BookMapper;
import com.alm.book.po.Book;
import com.alm.book.po.BookExample;
import com.alm.book.service.BookService;
import com.alm.user.mapper.UserShelfMapper;
import com.alm.user.mapper.ViewUserShelfMapper;
import com.alm.user.po.User;
import com.alm.user.po.UserShelfExample;
import com.alm.user.po.ViewUserShelf;
import com.alm.user.po.ViewUserShelfExample;
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
    private final ViewUserShelfMapper viewUserShelfMapper;

    @Autowired
    public BookServiceImpl(BookMapper bookMapper, UserShelfMapper userShelfMapper, ViewUserShelfMapper viewUserShelfMapper) {
        this.bookMapper = bookMapper;
        this.viewUserShelfMapper = viewUserShelfMapper;
    }

    /**
     * 获取商城所有书籍
     *
     * @return
     */
    @Override
    public List<Book> getShopBookList() {
        return bookMapper.selectByExample(new BookExample());
    }

    /**
     * 获取我的书架
     *
     * @return
     */
    @Override
    public List<ViewUserShelf> getMyBookShelf(int userId) {
        ViewUserShelfExample example=new ViewUserShelfExample();
        example.createCriteria().andUserIdEqualTo(userId);
        example.setOrderByClause("updateTime desc");
        return viewUserShelfMapper.selectByExample(example);
    }

    /**
     * 获取书籍详情
     *
     * @param bookId
     * @return
     */
    @Override
    public Book getBookDetail(int bookId) {
        return bookMapper.selectByPrimaryKey(bookId);
    }
}
