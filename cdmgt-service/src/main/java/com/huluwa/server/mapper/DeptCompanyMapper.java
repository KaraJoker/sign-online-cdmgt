package com.huluwa.server.mapper;


import com.huluwa.server.entity.DeptCompany;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


@Mapper
public interface DeptCompanyMapper {

    int deleteByPrimaryKey(Long id);

    int insert(DeptCompany record);

    DeptCompany selectByPrimaryKey(Long id);

    int updateByPrimaryKey(DeptCompany record);

    List<DeptCompany> selectByCompId(Long compId);

    int deleteByTwoId(@Param("compId") Long compId, @Param("deptId") Long deptId);
}
