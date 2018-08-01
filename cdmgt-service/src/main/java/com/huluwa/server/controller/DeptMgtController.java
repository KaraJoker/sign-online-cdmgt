package com.huluwa.server.controller;

import com.alibaba.fastjson.JSON;
import com.huluwa.server.entity.Dept;
import com.huluwa.server.entity.DeptCompany;
import com.huluwa.server.entity.InfoCode;
import com.huluwa.server.entity.RespInfo;
import com.huluwa.server.service.DeptService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * @program: sign-online-cdmgt
 * @description: dept managment
 * @author: Outcaster
 * @create: 2018-08-01 15:27
 **/
@RestController
@RequestMapping("/dept")
public class DeptMgtController {

    @Autowired
    private DeptService deptService;

    @Autowired
    private RespInfo respInfo;

    @RequestMapping(value = "/add/{compId}", method = RequestMethod.POST, produces = {"application/json"})
    @ResponseStatus(HttpStatus.OK)
    @ApiOperation(value = "添加部门")
    public String addDept(@PathVariable Long compId,@RequestBody Dept dept) {
        int result= deptService.insert(compId,dept);
        if(result == -1){
            respInfo.setStatus(InfoCode.ERROR);
            respInfo.setMessage("添加失败！");
        }else{
            respInfo.setContent(dept);
            respInfo.setStatus(InfoCode.SUCCESS);
            respInfo.setMessage("添加成功！");
        }
        return JSON.toJSONString(respInfo);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST, produces = {"application/json"})
    @ResponseStatus(HttpStatus.OK)
    @ApiOperation(value = "删除部门")
    public String deleteDept(@RequestBody DeptCompany deptCompany) {
        int result= deptService.deleteByPrimaryKey(deptCompany.getCompId(),deptCompany.getDeptId());
        if(result == -1){
            respInfo.setStatus(InfoCode.ERROR);
            respInfo.setMessage("删除失败！");
        }else{
            respInfo.setStatus(InfoCode.SUCCESS);
            respInfo.setMessage("删除成功！");
        }
        return JSON.toJSONString(respInfo);
    }

    @RequestMapping(value = "/selectOne/{id}", method = RequestMethod.POST, produces = {"application/json"})
    @ResponseStatus(HttpStatus.OK)
    @ApiOperation(value = "查询公司")
    public String selectDept(@PathVariable Long id) {
        Dept company=deptService.queryDeptById(id);
        if(company == null){
            respInfo.setStatus(InfoCode.ERROR);
            respInfo.setMessage("没有这条记录");
        }else{
            respInfo.setContent(company);
            respInfo.setStatus(InfoCode.SUCCESS);
            respInfo.setMessage("第"+id+"记录");
        }
        return JSON.toJSONString(respInfo);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST, produces = {"application/json"})
    @ResponseStatus(HttpStatus.OK)
    @ApiOperation(value = "修改公司信息")
    public String updateDept(@RequestBody Dept dept) {
        int result=deptService.updateByPrimaryKey(dept);
        if(result == -1){
            respInfo.setStatus(InfoCode.ERROR);
            respInfo.setMessage("更新失败");
        }else{
            respInfo.setContent(dept);
            respInfo.setStatus(InfoCode.SUCCESS);
            respInfo.setMessage("第"+dept.getId()+"记录已更新");
        }
        return JSON.toJSONString(respInfo);
    }
}
