package com.mssm.dbTable.dao;

import org.springframework.stereotype.Repository;

import com.mssm.dbTable.pojo.User;
@Repository
public interface UserMapper {
    int deleteByPrimaryKey(Long userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}