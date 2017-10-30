package com.xinchen.springboot.start.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "start_user",catalog = "dev")
public class User {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private Integer age;

    @Temporal(TemporalType.DATE)
    @Column(name = "time")
    private Date time;

}
