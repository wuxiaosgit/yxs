package com.xhhy.controller;

import java.security.NoSuchAlgorithmException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xhhy.domain.UserBean;
import com.xhhy.service.UserService;
import com.xhhy.utils.MD5;

@Controller
@RequestMapping("user")
public class UserController {
	@Autowired
	private UserService userService;
	@RequestMapping("insert.do")
	public String insertUser() throws NoSuchAlgorithmException{
		UserBean user = new UserBean();
		String newName = MD5.getInstance("Jack");
		user.setUserName(newName);
		user.setUserGender("男");
		user.setUserAge(22);
		user.setUserEmail("jack@163.com");
		user.setUserAddress("Amarica");
		userService.insertUser(user);
		return "/index.jsp";
	}
	@RequestMapping("list.do")
	public String listUser(Model model){
		List<UserBean> users = userService.listUser();
		model.addAttribute("users",users);
		return "/list.jsp";
	}
}
