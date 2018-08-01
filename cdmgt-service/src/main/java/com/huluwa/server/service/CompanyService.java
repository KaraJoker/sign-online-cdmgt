package com.huluwa.server.service;


import com.huluwa.server.entity.Company;

public interface CompanyService {

    Company queryCompanyById(Long id);

    int insert(Company record);

    int deleteByPrimaryKey(Long id);

    int updateByPrimaryKey(Company record);
}
