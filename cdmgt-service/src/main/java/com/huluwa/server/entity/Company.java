package com.huluwa.server.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Company {
    private Long id;

    private String name;

    private String manager;

    private String manageremail;

    private String managerphone;

    private String servicesphone;

    private String industry;

    private Date creatat;

    private Byte type;

    private List<Dept> depts;
}