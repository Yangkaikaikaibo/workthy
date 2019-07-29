package com.tx.dao;

import com.tx.pojo.student;

import java.util.List;

public interface studentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(student record);

    int insertSelective(student record);

    student selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(student record);

    int updateByPrimaryKey(student record);

    List<student> querAll();
}