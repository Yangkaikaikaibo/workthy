package com.tx.biz;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tx.dao.RecstuDao;
import com.tx.dao.UsersMapper;
import com.tx.dao.recordMapper;
import com.tx.dao.studentMapper;
import com.tx.pojo.Recstu;
import com.tx.pojo.Users;
import com.tx.pojo.record;
import com.tx.pojo.student;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author lhl
 * @create 2019-07-27 15:32
 */
@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class StudentBiz {
    @Resource
    private UsersMapper usersMapper;
    @Resource
    private studentMapper studentMapper;
    @Resource
    private RecstuDao recstuDao;
    @Resource
    private recordMapper recordMapper;

    public Users login(String accout,String pwd){
        return usersMapper.login(accout, pwd);
    }

    public PageInfo<student> getStudents(Integer pageNum,Integer pageSize){
        PageHelper.startPage(pageNum, pageSize);
        return new PageInfo<student>(studentMapper.querAll());
    }

    public List<Recstu> getrecStu(String stucode){
        return recstuDao.querbyid(stucode);
    }

    public PageInfo<Recstu> getRecstuAll(Integer pageNum,Integer pageSize){
        PageHelper.startPage(pageNum, pageSize);
        return new PageInfo<Recstu>(recstuDao.querAll());
    }
    public List<student> findstuAll(){
        return studentMapper.querAll();
    }
    public int addRecord(record record){
        return recordMapper.insertSelective(record);
    }
    public int remRecor(Integer id){
        return recordMapper.deleteByPrimaryKey(id);
    }
    public record getrecByid(Integer id){
        return recordMapper.selectByPrimaryKey(id);
    }

    public int updrec(record record){
        return recordMapper.updateByPrimaryKeySelective(record);
    }
    public PageInfo<Recstu> getByino(String jc,String stuname){
        PageHelper.startPage(1, 99);
        return new PageInfo<Recstu>(recstuDao.queryByin(jc, stuname));
    }
}
