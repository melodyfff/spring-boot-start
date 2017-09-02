package com.xinchen.springboot.start.entity;

import lombok.Data;

import java.sql.Date;

@Data
public class User {

    private Long id;

    private String name;

    private Integer age;

    private Date time;

}
