package com.huluwa.server.serviceImpl;

import com.huluwa.server.entity.DeptCompany;
import com.huluwa.server.mapper.DeptCompanyMapper;
import com.huluwa.server.service.DeptCompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: sign-online-cdmgt
 * @description: deptCompany service
 * @author: Outcaster
 * @create: 2018-08-01 15:57
 **/
@Service
public class DeptCompanyServiceImpl implements DeptCompanyService{

    @Autowired
    DeptCompanyMapper deptCompanyMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return deptCompanyMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(DeptCompany record) {
        return deptCompanyMapper.insert(record);
    }

    @Override
    public DeptCompany selectByPrimaryKey(Long id) {
        return deptCompanyMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKey(DeptCompany record) {
        return deptCompanyMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<DeptCompany> selectByCompId(Long compId) {
        return deptCompanyMapper.selectByCompId(compId);
    }
}
