package com.xhhy.service;

import java.util.List;

import com.xhhy.domain.RoleBean;

public interface RoleService {
	public List<RoleBean> listRole();
	public RoleBean getRoleById(Integer roleId);
}
