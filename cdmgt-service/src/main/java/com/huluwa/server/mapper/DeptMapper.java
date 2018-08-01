package com.huluwa.server.mapper;

import com.huluwa.server.entity.Dept;
import com.huluwa.server.entity.DeptExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DeptMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Dept record);

    Dept selectByPrimaryKey(Long id);

    int updateByPrimaryKey(Dept record);

    int insertSelective(Dept record);

    List<Dept> selectByExample(DeptExample example);


    int updateByExampleSelective(@Param("record") Dept record, @Param("example") DeptExample example);

    int updateByExample(@Param("record") Dept record, @Param("example") DeptExample example);

    int updateByPrimaryKeySelective(Dept record);

    int countByExample(DeptExample example);

    int deleteByExample(DeptExample example);
}
