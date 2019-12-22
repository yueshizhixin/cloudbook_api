package com.alm.book.service;

import com.alm.book.po.Book;

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
    public List<Book> getBookList();


}
