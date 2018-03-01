package com.ren.ssm.dao;

import com.ren.ssm.entity.vipCompany;

public interface vipCompanyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(vipCompany record);

    int insertSelective(vipCompany record);

    vipCompany selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(vipCompany record);

    int updateByPrimaryKey(vipCompany record);
}