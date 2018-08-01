package com.huluwa.server.serviceImpl;

import com.huluwa.server.entity.Company;
import com.huluwa.server.entity.Dept;
import com.huluwa.server.entity.DeptCompany;
import com.huluwa.server.mapper.CompanyMapper;
import com.huluwa.server.mapper.DeptCompanyMapper;
import com.huluwa.server.mapper.DeptMapper;
import com.huluwa.server.service.CompanyService;
import com.huluwa.server.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptMapper deptMapper;

    @Autowired
    private DeptCompanyMapper deptCompanyMapper;

    @Override
    public Dept queryDeptById(Long id) {
        return deptMapper.selectByPrimaryKey(id);
    }

    @Override
    public int insert(Long compId,Dept record) {
        int dId=deptMapper.insert(record);
        Long deptId=Long.valueOf(dId);
        DeptCompany deptCompany=new DeptCompany();
        deptCompany.setDeptId(deptId);
        deptCompany.setCompId(compId);
        deptCompany.setParentCompId(1L);
        deptCompanyMapper.insert(deptCompany);
        return dId;
    }

    @Override
    public int deleteByPrimaryKey(Long compId,Long deptId) {
        deptCompanyMapper.deleteByTwoId(compId,deptId);
        return deptMapper.deleteByPrimaryKey(deptId);
    }

    @Override
    public int updateByPrimaryKey(Dept record) {
        return deptMapper.updateByPrimaryKey(record);
    }
}
