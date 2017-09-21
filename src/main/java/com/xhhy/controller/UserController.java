package com.xhhy.controller;

import java.security.NoSuchAlgorithmException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.xhhy.domain.UserBean;
import com.xhhy.service.UserService;

@Controller
@RequestMapping("user")
@SessionAttributes("user")
public class UserController {
	@Autowired
	private UserService userService;

	@RequestMapping("selectUser.do")
	public ModelAndView selectUser(UserBean userBean){
		ModelAndView mav=new ModelAndView("../html/resource/demo2/list.jsp");
		System.out.println(userBean);
		List<UserBean> userBeans=userService.listUser(userBean);
		for (UserBean userBean2 : userBeans) {
			System.out.println(userBean2);
		}
		return mav;
	}

	@RequestMapping("login.do")
	public ModelAndView login(UserBean userBean){
		ModelAndView mav=new ModelAndView("../html/index.jsp");
		UserBean user=userService.login(userBean);
	
	
		if (user==null) {
			mav.setViewName("../html/login.jsp");
		}else{
			mav.addObject("user",user);
			
		}
		
		return mav;
	}
}
