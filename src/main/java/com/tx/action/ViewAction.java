package com.tx.action;

import com.tx.pojo.Users;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/view")
public class ViewAction {
	
	@GetMapping("login")
	public String goToLogin() {
		return "login";
	}

	@GetMapping("goIndex")
	public String goIndexPage(Model model,HttpSession session){
		Users users=(Users) session.getAttribute("USERS");
		if(users==null){
			model.addAttribute("MSG", "请先登录");
			return "login";
		}
		return "index";
	}
}
