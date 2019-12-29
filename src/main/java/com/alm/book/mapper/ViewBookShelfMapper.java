package com.alm.book.mapper;

import com.alm.book.po.ViewBookShelf;
import com.alm.book.po.ViewBookShelfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ViewBookShelfMapper {
    long countByExample(ViewBookShelfExample example);

    int deleteByExample(ViewBookShelfExample example);

    int insert(ViewBookShelf record);

    int insertSelective(ViewBookShelf record);

    List<ViewBookShelf> selectByExample(ViewBookShelfExample example);

    int updateByExampleSelective(@Param("record") ViewBookShelf record, @Param("example") ViewBookShelfExample example);

    int updateByExample(@Param("record") ViewBookShelf record, @Param("example") ViewBookShelfExample example);
}