package com.xhhy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xhhy.dao.MenuDao;
import com.xhhy.domain.MenuBean;
@Service
public class MenuServiceImpl implements MenuService {
	@Autowired
	private MenuDao menuDao;
	
	public List<MenuBean> getMenu(Integer roleId) {
		// TODO Auto-generated method stub
		return menuDao.getMenu(roleId);
	}

}
