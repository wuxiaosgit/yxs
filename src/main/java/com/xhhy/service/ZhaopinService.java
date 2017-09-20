package com.xhhy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xhhy.dao.ZhaopinDao;
import com.xhhy.domain.ZhaopinBean;

@Service
public class ZhaopinService {
	@Autowired
	private ZhaopinDao zhaopinDao;

	public List<ZhaopinBean> selectAll() {
		// TODO Auto-generated method stub
		return zhaopinDao.selectAll();
	}
	
	
}
