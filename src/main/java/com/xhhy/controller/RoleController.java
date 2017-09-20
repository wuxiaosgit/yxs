package com.xhhy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xhhy.domain.DeptBean;
import com.xhhy.domain.RoleBean;
import com.xhhy.service.RoleService;

@Controller
@RequestMapping("role")
public class RoleController {
	@Autowired
	private RoleService roleService;
	@RequestMapping("listrole.do")
	public String listdept(){
		List<RoleBean> roleBeans= roleService.listRole();
		for (RoleBean roleBean : roleBeans) {
			System.out.println(roleBean);
				System.out.println(roleBean.getDeptBean());
		}
		/*DeptBean deptBean=deptService.getDeptById(1);
		System.out.println(deptBean);*/
		return "../html/login.jsp";
	}
}
