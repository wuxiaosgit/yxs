package com.xhhy.controller;

import java.security.NoSuchAlgorithmException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.xhhy.domain.UserBean;
import com.xhhy.service.UserService;
import com.xhhy.utils.MD5;

@Controller
@RequestMapping("user")
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("login.do")
	public ModelAndView login(UserBean userBean){
		System.out.println(userBean);
		ModelAndView mav=new ModelAndView("../html/index.jsp");
		UserBean u=userService.login(userBean);
		if (u==null) {
			mav.setViewName("../html/login.jsp");
		}
		return mav;
	}
}
