package com.xhhy.service;

import java.util.List;

import com.xhhy.domain.UserBean;

public interface UserService {
	public void insertUser(UserBean user);
	public List<UserBean> listUser();
}
