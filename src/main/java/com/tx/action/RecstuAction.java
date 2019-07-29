package com.tx.action;

import com.github.pagehelper.PageInfo;
import com.tx.biz.StudentBiz;
import com.tx.pojo.Recstu;
import com.tx.pojo.record;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author lhl
 * @create 2019-07-28 16:42
 */
@RestController
@RequestMapping("api")
public class RecstuAction {
    @Resource
    private StudentBiz biz;

    @GetMapping("getstuByid")
    public List<Recstu> list(String stucode){
        return biz.getrecStu(stucode);
    }

    @GetMapping("getRecor")
    public record getrec(Integer id){
        return biz.getrecByid(id);
    }
}
