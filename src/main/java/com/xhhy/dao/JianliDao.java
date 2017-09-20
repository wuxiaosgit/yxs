package com.xhhy.dao;

import com.xhhy.domain.JianliBean;

public interface JianliDao {
    int deleteByPrimaryKey(Integer jianliId);

    int insert(JianliBean record);

    int insertSelective(JianliBean record);

    JianliBean selectByPrimaryKey(Integer jianliId);

    int updateByPrimaryKeySelective(JianliBean record);

    int updateByPrimaryKey(JianliBean record);
}