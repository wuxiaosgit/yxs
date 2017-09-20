package com.xhhy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xhhy.domain.ZhaopinBean;
import com.xhhy.service.ZhaopinService;

@Controller
@RequestMapping("zhaopin")
public class ZhaopinController {
	@Autowired
	private ZhaopinService zhaopinService;
	@RequestMapping("selectAll")
	public void selectAll(){
		List<ZhaopinBean> list = zhaopinService.selectAll();
		System.out.println(list);
	}
}
