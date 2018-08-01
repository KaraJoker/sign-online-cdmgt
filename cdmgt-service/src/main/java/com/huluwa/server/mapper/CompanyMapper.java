package com.huluwa.server.mapper;

import com.huluwa.server.entity.Company;
import com.huluwa.server.entity.CompanyExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

@Mapper
public interface CompanyMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Company record);

    Company selectByPrimaryKey(Long id);

    int updateByPrimaryKey(Company record);

    int insertSelective(Company record);

    List<Company> selectByExample(CompanyExample example);


    int updateByExampleSelective(@Param("record") Company record, @Param("example") CompanyExample example);

    int updateByExample(@Param("record") Company record, @Param("example") CompanyExample example);

    int updateByPrimaryKeySelective(Company record);

    int countByExample(CompanyExample example);

    int deleteByExample(CompanyExample example);
}