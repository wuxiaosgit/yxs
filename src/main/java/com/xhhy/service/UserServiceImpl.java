package com.xhhy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xhhy.dao.UserDao;
import com.xhhy.domain.UserBean;

@Service
@Transactional
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

	public void insertUser(UserBean user) {
		userDao.insertUser(user);
		/*String str = null;
		System.out.println(str.length());*/
	}

	public List<UserBean> listUser() {
		return userDao.listUser();
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

}
