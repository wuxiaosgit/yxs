package com.xhhy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xhhy.dao.RoleDao;
import com.xhhy.domain.RoleBean;
@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	private RoleDao roleDao;
	public List<RoleBean> listRole() {
		// TODO Auto-generated method stub
		return roleDao.listRole();
	}

	public RoleBean getRoleById(Integer roleId) {
		// TODO Auto-generated method stub
		return roleDao.getRoleById(roleId);
	}

}
