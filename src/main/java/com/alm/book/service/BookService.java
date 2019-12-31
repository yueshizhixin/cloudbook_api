package com.alm.book.service;

import com.alm.book.po.*;
import com.alm.system.vo.Message;

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
     */
    public List<Book> getShopBookList(int offset,int limit);

    /**
     * 获取我的书架
     */
    public List<ViewBookShelf> getMyBookShelf(int offset, int limit, int userId);

    /**
     * 获取书籍详情
     */
    public Book getBookDetail(int bookId);

    /**
     * 获取书籍目录
     */
    public List<BookChapter> getBookTitleList(int offset,int limit,int bookId);

    /**
     * 获取章节内容
     * @param id 章节表id
     */
    public BookChapterContent getChapterContent(int id);

    /**
     * 更新阅读记录
     */
    public Message updateBookShelfReadLine(BookShelf bookShelf);

    /**
     * 获取章节标题
     * 最终舍弃
     */
    public BookChapter getChapterTitle(int chapterId);

}
