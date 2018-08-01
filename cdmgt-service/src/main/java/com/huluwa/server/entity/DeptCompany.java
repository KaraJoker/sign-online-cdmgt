package com.huluwa.server.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: sign-online-cdmgt
 * @description: dept company managment
 * @author: Outcaster
 * @create: 2018-08-01 15:31
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DeptCompany {

    private Long id;

    private Long deptId;

    private Long compId;

    private Long parentCompId;
}
