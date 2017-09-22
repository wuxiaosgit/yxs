package com.xhhy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xhhy.domain.ZhaopinBean;
import com.xhhy.service.ZhaopinService;
import com.xhhy.utils.State;

@Controller
@RequestMapping("zhaopin")
public class ZhaopinController {
	@Autowired
	private ZhaopinService zhaopinService;
	
	//---------------------查询所有招聘信息---------------------------------
	@RequestMapping("selectAll")
	public String selectAll(Model model){
		List<ZhaopinBean> list = zhaopinService.selectAll();
		model.addAttribute("zhaopinList", list);
		//System.out.println(list);
		
		return "/html/zhaopin/demo1/list.jsp";
	}
	
	/*@RequestMapping("view")
	public String a(){

		return "/html/zhaopin/demo1/add.jsp";
	}*/
	//-----------------删除招聘信息-----------------------------------------
	@RequestMapping("updateByPrimaryKeySelective")
	public String updateByPrimaryKeySelective(ZhaopinBean zhaopinBean,String method ){

		//System.out.println(zhaopinBean.getZhaopinId());
		if(method!=null&&method.equals("del")){
			zhaopinBean.setState(State.DEL);
			zhaopinService.updateByPrimaryKeySelective(zhaopinBean);
			return "selectAll.do";
		}
		zhaopinService.updateByPrimaryKeySelective(zhaopinBean);
		return "selectAll.do";
	}
	
	//-------------------添加招聘信息-------------------------------------------
	@RequestMapping("insertSelective")
	public String insertSelective(ZhaopinBean zhaopinBean){
		System.out.println(zhaopinBean);
		zhaopinService.insertSelective(zhaopinBean);
		return "selectAll.do";
	}
	
	//-----------------查询单个招聘信息------------------------------
	@RequestMapping("selectByPrimaryKey")
	public String selectByPrimaryKey(Model model,int zhaopinId,String method){
		//System.out.println(zhaopinId);
		ZhaopinBean zhaopinBean = zhaopinService.selectByPrimaryKey(zhaopinId);
		//System.out.println(zhaopinBean);
		model.addAttribute("zhaopinBean",zhaopinBean);
		if(method.equals("change")){
			return "/html/zhaopin/demo2/up.jsp";
		}else{
			return "/html/zhaopin/demo2/view.jsp";

		//System.out.println(method);
		if(method!=null&&method.equals("del")){
			zhaopinBean.setState(State.DEL);
			zhaopinService.updateByPrimaryKeySelective(zhaopinBean);
			return "selectAll.do";
		}else{
			zhaopinBean.setState(State.UNDEL);
			//System.out.println(zhaopinBean);
			zhaopinService.updateByPrimaryKeySelective(zhaopinBean);
			return "selectAll.do";
		}
	
	}
	
	//-------------------添加招聘信息-------------------------------------------
	@RequestMapping("insertSelective")
	public String insertSelective(ZhaopinBean zhaopinBean){
		//System.out.println(zhaopinBean);
		zhaopinBean.setState(State.UNDEL);
		zhaopinService.insertSelective(zhaopinBean);
		return "selectAll.do";
	}
	
	//-----------------查询单个招聘信息------------------------------
	@RequestMapping("selectByPrimaryKey")
	public String selectByPrimaryKey(Model model,int zhaopinId,String method){
		//System.out.println(zhaopinId);
		ZhaopinBean zhaopinBean = zhaopinService.selectByPrimaryKey(zhaopinId);
		//System.out.println(zhaopinBean);
		model.addAttribute("zhaopinBean",zhaopinBean);
		if(method.equals("change")){
			return "/html/zhaopin/demo1/up.jsp";
		}else{
			return "/html/zhaopin/demo1/view.jsp";

		}
		
	}
}
