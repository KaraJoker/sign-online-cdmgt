package com.huluwa.server.serviceImpl;

import com.huluwa.server.entity.Company;
import com.huluwa.server.entity.Dept;
import com.huluwa.server.entity.DeptCompany;
import com.huluwa.server.mapper.CompanyMapper;
import com.huluwa.server.mapper.DeptCompanyMapper;
import com.huluwa.server.mapper.DeptMapper;
import com.huluwa.server.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    private DeptMapper deptMapper;

    @Autowired
    private CompanyMapper companyMapper;

    @Autowired
    private DeptCompanyMapper deptCompanyMapper;

    @Override
    public Company queryCompanyById(Long id) {
        List<DeptCompany> deptCompanies=deptCompanyMapper.selectByCompId(id);
        List<Dept> depts=new ArrayList<Dept>();
        for(DeptCompany deptCompany:deptCompanies){
            depts.add(deptMapper.selectByPrimaryKey(deptCompany.getDeptId()));
        }
        Company company=companyMapper.selectByPrimaryKey(id);
        if(company != null) {
            company.setDepts(depts);
        }
        return company;
    }

    @Override
    public int insert(Company record) {
        return companyMapper.insert(record);
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        List<DeptCompany> deptCompanies=deptCompanyMapper.selectByCompId(id);
        for(DeptCompany deptCompany:deptCompanies){
            deptMapper.deleteByPrimaryKey(deptCompany.getId());
        }
        return companyMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKey(Company record) {
        return companyMapper.updateByPrimaryKey(record);
    }
}
