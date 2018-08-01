package com.huluwa.server.service;

import com.huluwa.server.entity.DeptCompany;

import java.util.List;

public interface DeptCompanyService {

    int deleteByPrimaryKey(Long id);

    int insert(DeptCompany record);

    DeptCompany selectByPrimaryKey(Long id);

    int updateByPrimaryKey(DeptCompany record);

    List<DeptCompany> selectByCompId(Long compId);
}
