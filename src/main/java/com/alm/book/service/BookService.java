package com.alm.book.service;

import com.alm.book.po.Book;
import com.alm.user.po.User;
import com.alm.user.po.UserShelf;
import com.alm.user.po.ViewUserShelf;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * <p>user: LISHUAI</p>
 * <p>date: 2019-12-22 20:30/p>
 * <p>desc: </p>
 */
public interface BookService {

    /**
     * 获取商城所有书籍
     * @return
     */
    public List<Book> getShopBookList();

    /**
     * 获取我的书架
     * @return
     */
    public List<ViewUserShelf> getMyBookShelf(int userId);

    /**
     * 获取书籍详情
     * @return
     */
    public Book getBookDetail(int bookId);

}
