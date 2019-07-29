package com.tx.action;

import com.github.pagehelper.PageInfo;
import com.tx.biz.StudentBiz;
import com.tx.pojo.Recstu;
import com.tx.pojo.Users;
import com.tx.pojo.record;
import com.tx.pojo.student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

/**
 * @author lhl
 * @create 2019-07-27 15:32
 */
@Controller
@RequestMapping("/c/users")
public class UserAction {

    @Resource
    private StudentBiz biz;

    @PostMapping("loginIn")
    public String validateUsersInfo(Model model, Users users, HttpSession session) {
        if(biz.login(users.getUsername(), users.getPassword())!=null) {
            session.setAttribute("USERS",biz.login(users.getUsername(), users.getPassword()));
            return "redirect:/view/goIndex";
        }else {
            model.addAttribute("MSG", "用户名或密码错误");
            return "login";//必须是模板文件名【转发】
        }
    }

    @GetMapping("getStudnets")
    public String getStu(Integer p, Integer s, Model model){
        PageInfo<student> pageInfo=biz.getStudents(p, s);
        model.addAttribute("pageinfo",pageInfo);
        return "show";
    }

    @GetMapping("getRecstuAll")
    public String getrecstuall(Integer p, Integer s, Model model){
        PageInfo<Recstu> pageInfo=biz.getRecstuAll(p, s);
        model.addAttribute("pageinfo",pageInfo);
        List<student> student=biz.findstuAll();
        model.addAttribute("list", student);
        return "recgg";
    }
    @GetMapping("addRecinfo")
    public String addrec(String jc,String stucode,String des,HttpSession session){
       Users users= (Users)session.getAttribute("USERS");
        record recc=new record(jc, stucode, new Date(), users.getUsername(), des);
        biz.addRecord(recc);
        return "redirect:/c/users/getRecstuAll?p=1&s=3";
    }
    @GetMapping("remove")
    public String remRec(Integer id){
        biz.remRecor(id);
        return "redirect:/c/users/getRecstuAll?p=1&s=3";
    }
    @PostMapping("updRecinfo")
    public String updrc(Integer id,String jc,String stucode,String des){
        record recc=new record();
        recc.setId(id);
        recc.setDes(des);
        recc.setName(jc);
        recc.setStucode(stucode);
        biz.updrec(recc);
        return "redirect:/c/users/getRecstuAll?p=1&s=3";
    }

    @PostMapping("getbyi")
    public String getbyinfo(Model model,String jc,String stuname){
        model.addAttribute("jc", jc);
        model.addAttribute("stuname", stuname);
        PageInfo<Recstu> pageInfo=biz.getByino(jc, stuname);
        model.addAttribute("pageinfo", pageInfo);
        List<student> student=biz.findstuAll();
        model.addAttribute("list", student);
        return "recgg";
    }
}
