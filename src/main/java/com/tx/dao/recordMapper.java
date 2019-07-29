package com.tx.dao;

import com.tx.pojo.record;

public interface recordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(record record);

    int insertSelective(record record);

    record selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(record record);

    int updateByPrimaryKey(record record);


}