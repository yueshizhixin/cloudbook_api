package com.alm.user.mapper;

import com.alm.user.po.UserShelf;
import com.alm.user.po.UserShelfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserShelfMapper {
    long countByExample(UserShelfExample example);

    int deleteByExample(UserShelfExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserShelf record);

    int insertSelective(UserShelf record);

    List<UserShelf> selectByExample(UserShelfExample example);

    UserShelf selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserShelf record, @Param("example") UserShelfExample example);

    int updateByExample(@Param("record") UserShelf record, @Param("example") UserShelfExample example);

    int updateByPrimaryKeySelective(UserShelf record);

    int updateByPrimaryKey(UserShelf record);
}