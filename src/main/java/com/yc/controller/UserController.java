package com.yc.controller;

import java.util.HashMap;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yc.bean.Account;
import com.yc.biz.UserBiz;

@RestController
public class UserController {
	
	private UserBiz userBiz;
	
	@Resource(name="userBiz")
	public void setUserBiz(UserBiz userBiz) {
		this.userBiz = userBiz;
	}

	@RequestMapping("/user/judge-login")
	public HashMap<String, Object> judgeLogin(HttpServletRequest req) {
		HashMap<String, Object> data = new HashMap<String, Object>();
		Account user = (Account) req.getSession().getAttribute("account");
		if (user != null && user.getId() > 0) {
			data.put("status", "success");
			data.put("name", user.getName());
		} else {
			data.put("status", "fail");
		}
		return data;
	}
	
	@RequestMapping("/user/login")
    public HashMap<String, Object> login(HttpServletRequest req) {
		String name=(String) req.getParameter("name");
		String password=(String) req.getParameter("password");
		Account user = userBiz.login(name, password);
		
		HashMap<String, Object> data = new HashMap<String, Object>();
		
		if (user != null && user.getId() > 0) {
			req.getSession().setAttribute("account", user);
			data.put("status", "success");
		} else {
			data.put("status", "fail");
		}
		
        return data;
    }
}
