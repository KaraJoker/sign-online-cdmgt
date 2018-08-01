package com.huluwa.server.service;

import com.huluwa.server.entity.Dept;

public interface DeptService {

    Dept queryDeptById(Long id);

    int insert(Long compId,Dept record);

    int deleteByPrimaryKey(Long compId,Long deptId);

    int updateByPrimaryKey(Dept record);
}
