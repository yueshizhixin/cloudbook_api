package com.alm.book.service.impl;

import com.alm.book.mapper.BookMapper;
import com.alm.book.po.Book;
import com.alm.book.po.BookExample;
import com.alm.book.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * <p>user: LISHUAI</p>
 * <p>date: 2019-12-22 20:31/p>
 * <p>desc: </p>
 */
@SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
@Service("bookService")
public class BookServiceImpl implements BookService {

    private final BookMapper bookMapper;

    @Autowired
    public BookServiceImpl(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    /**
     * 获取商城所有书籍
     *
     * @return
     */
    @Override
    public List<Book> getBookList() {
        return bookMapper.selectByExample(new BookExample());
    }
}
