package com.alm.book.mapper;

import com.alm.book.po.BookShelf;
import com.alm.book.po.BookShelfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BookShelfMapper {
    long countByExample(BookShelfExample example);

    int deleteByExample(BookShelfExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BookShelf record);

    int insertSelective(BookShelf record);

    List<BookShelf> selectByExample(BookShelfExample example);

    BookShelf selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BookShelf record, @Param("example") BookShelfExample example);

    int updateByExample(@Param("record") BookShelf record, @Param("example") BookShelfExample example);

    int updateByPrimaryKeySelective(BookShelf record);

    int updateByPrimaryKey(BookShelf record);
}