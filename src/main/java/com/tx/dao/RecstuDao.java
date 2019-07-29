package com.tx.dao;

import com.tx.pojo.Recstu;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author lhl
 * @create 2019-07-28 16:16
 */
public interface RecstuDao {
    List<Recstu> querbyid(String stucode);

    List<Recstu> querAll();

    List<Recstu> queryByin(@Param("jc") String jc, @Param("stuname") String stuname);
}
