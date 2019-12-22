package com.alm.book.mapper;

import com.alm.book.po.BookTag;
import com.alm.book.po.BookTagExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BookTagMapper {
    long countByExample(BookTagExample example);

    int deleteByExample(BookTagExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BookTag record);

    int insertSelective(BookTag record);

    List<BookTag> selectByExample(BookTagExample example);

    BookTag selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BookTag record, @Param("example") BookTagExample example);

    int updateByExample(@Param("record") BookTag record, @Param("example") BookTagExample example);

    int updateByPrimaryKeySelective(BookTag record);

    int updateByPrimaryKey(BookTag record);
}