package com.xhhy.service;

import java.util.List;

<<<<<<< HEAD
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xhhy.dao.JianliDao;
import com.xhhy.domain.JianliBean;

@Service
public class JianliService {
	@Autowired
	private JianliDao jianliDao;
	public List<JianliBean> selectAll() {
		// TODO Auto-generated method stub
		return jianliDao.selectAll();
	}
	public void updateByPrimaryKeySelective(JianliBean jianliBean) {
		// TODO Auto-generated method stub
		jianliDao.updateByPrimaryKeySelective(jianliBean);
	}
	public JianliBean selectByPrimaryKey(int jianliId) {
		// TODO Auto-generated method stub
		return jianliDao.selectByPrimaryKey(jianliId);
	}
	public void insertSelective(JianliBean jianliBean) {
		// TODO Auto-generated method stub
		jianliDao.insertSelective(jianliBean);
	}

=======
import com.xhhy.domain.JianliBean;

public interface JianliService {
	public List<JianliBean> selectAll();
	public void updateByPrimaryKeySelective(JianliBean jianliBean);
	public JianliBean selectByPrimaryKey(int jianliId);
	public void insertSelective(JianliBean jianliBean);

}
