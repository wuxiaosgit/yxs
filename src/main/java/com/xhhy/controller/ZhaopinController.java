package com.xhhy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xhhy.domain.ZhaopinBean;
import com.xhhy.service.ZhaopinService;

@Controller
@RequestMapping("zhaopin")
public class ZhaopinController {
	@Autowired
	private ZhaopinService zhaopinService;
	@RequestMapping("selectAll")
	public String selectAll(Model model){
		List<ZhaopinBean> list = zhaopinService.selectAll();
		model.addAttribute("zhaopinList", list);
		//System.out.println(list);
		
		return "/html/zhaopin/demo1/list.jsp";
	}
	
	@RequestMapping("view")
	public String a(){

		return "/html/zhaopin/demo1/add.jsp";
	}
}
