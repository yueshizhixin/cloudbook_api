package com.alm.book.mapper;

import com.alm.book.po.BookLine;
import com.alm.book.po.BookLineExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BookLineMapper {
    long countByExample(BookLineExample example);

    int deleteByExample(BookLineExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BookLine record);

    int insertSelective(BookLine record);

    List<BookLine> selectByExample(BookLineExample example);

    BookLine selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BookLine record, @Param("example") BookLineExample example);

    int updateByExample(@Param("record") BookLine record, @Param("example") BookLineExample example);

    int updateByPrimaryKeySelective(BookLine record);

    int updateByPrimaryKey(BookLine record);
}