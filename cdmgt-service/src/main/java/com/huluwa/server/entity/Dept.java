package com.huluwa.server.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @program: sign-online-cdmgt
 * @description: deptment class
 * @author: Outcaster
 * @create: 2018-08-01 10:06
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Dept {

    private Long id;

    private String name;

    private String manager;

    private String manageremail;

    private String managerphone;

    private String servicesphone;

    private String remark;

    private Date creatat;

    private Byte type;
}
