package com.huluwa.server.controller;

import com.alibaba.fastjson.JSON;
import com.huluwa.server.entity.Company;
import com.huluwa.server.entity.DeptCompany;
import com.huluwa.server.entity.InfoCode;
import com.huluwa.server.entity.RespInfo;
import com.huluwa.server.service.CompanyService;
import com.huluwa.server.service.DeptCompanyService;
import com.huluwa.server.service.DeptService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


/**
 * @program: electronic-contract-open-api
 * @description: company managment
 * @author: Outcaster
 * @create: 2018-07-31 17:22
 **/
@RestController
@RequestMapping("/company")
public class CompanyMgtController {

    @Autowired
    private DeptService deptService;

    @Autowired
    private CompanyService companyService;

    @Autowired
    private DeptCompanyService deptCompanyService;

    @Autowired
    private RespInfo respInfo;

    @RequestMapping(value = "/add", method = RequestMethod.POST, produces = {"application/json"})
    @ResponseStatus(HttpStatus.OK)
    @ApiOperation(value = "添加公司")
    public String addCompany(@RequestBody Company company) {
        int result= companyService.insert(company);
        if(result != -1){
            respInfo.setContent(company);
            respInfo.setStatus(InfoCode.SUCCESS);
            respInfo.setMessage("添加成功！");
        }else{
            respInfo.setStatus(InfoCode.ERROR);
            respInfo.setMessage("添加失败！");
        }
        return JSON.toJSONString(respInfo);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.POST, produces = {"application/json"})
    @ResponseStatus(HttpStatus.OK)
    @ApiOperation(value = "删除公司")
    public String deleteCompany(@PathVariable Long id) {
        int result= companyService.deleteByPrimaryKey(id);
        if(result != -1){
            respInfo.setStatus(InfoCode.SUCCESS);
            respInfo.setMessage("删除成功！");
        }else{
            respInfo.setStatus(InfoCode.ERROR);
            respInfo.setMessage("删除失败！");
        }
        return JSON.toJSONString(respInfo);
    }

    @RequestMapping(value = "/selectOne/{id}", method = RequestMethod.POST, produces = {"application/json"})
    @ResponseStatus(HttpStatus.OK)
    @ApiOperation(value = "查询公司")
    public String selectCompany(@PathVariable Long id) {
        Company company=companyService.queryCompanyById(id);
        if(company != null){
            respInfo.setContent(company);
            respInfo.setStatus(InfoCode.SUCCESS);
            respInfo.setMessage("第"+id+"记录");
        }else{
            respInfo.setStatus(InfoCode.ERROR);
            respInfo.setMessage("没有这条记录");
        }
        return JSON.toJSONString(respInfo);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST, produces = {"application/json"})
    @ResponseStatus(HttpStatus.OK)
    @ApiOperation(value = "修改公司信息")
    public String updateCompany(@RequestBody Company company) {
        int result=companyService.updateByPrimaryKey(company);
        if(result != -1){
            respInfo.setContent(company);
            respInfo.setStatus(InfoCode.SUCCESS);
            respInfo.setMessage("第"+company.getId()+"记录已更新");
        }else{
            respInfo.setStatus(InfoCode.ERROR);
            respInfo.setMessage("更新失败");
        }
        return JSON.toJSONString(respInfo);
    }
}
