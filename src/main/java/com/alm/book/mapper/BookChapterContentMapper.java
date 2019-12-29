package com.alm.book.mapper;

import com.alm.book.po.BookChapterContent;
import com.alm.book.po.BookChapterContentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BookChapterContentMapper {
    long countByExample(BookChapterContentExample example);

    int deleteByExample(BookChapterContentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BookChapterContent record);

    int insertSelective(BookChapterContent record);

    List<BookChapterContent> selectByExampleWithBLOBs(BookChapterContentExample example);

    List<BookChapterContent> selectByExample(BookChapterContentExample example);

    BookChapterContent selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BookChapterContent record, @Param("example") BookChapterContentExample example);

    int updateByExampleWithBLOBs(@Param("record") BookChapterContent record, @Param("example") BookChapterContentExample example);

    int updateByExample(@Param("record") BookChapterContent record, @Param("example") BookChapterContentExample example);

    int updateByPrimaryKeySelective(BookChapterContent record);

    int updateByPrimaryKeyWithBLOBs(BookChapterContent record);

    int updateByPrimaryKey(BookChapterContent record);
}