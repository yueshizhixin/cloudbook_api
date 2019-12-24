package com.alm.user.mapper;

import com.alm.user.po.ViewUserShelf;
import com.alm.user.po.ViewUserShelfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ViewUserShelfMapper {
    long countByExample(ViewUserShelfExample example);

    int deleteByExample(ViewUserShelfExample example);

    int insert(ViewUserShelf record);

    int insertSelective(ViewUserShelf record);

    List<ViewUserShelf> selectByExample(ViewUserShelfExample example);

    int updateByExampleSelective(@Param("record") ViewUserShelf record, @Param("example") ViewUserShelfExample example);

    int updateByExample(@Param("record") ViewUserShelf record, @Param("example") ViewUserShelfExample example);
}