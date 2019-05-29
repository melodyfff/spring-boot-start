package com.xinchen.start.base.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Xin Chen (xinchenmelody@gmail.com)
 * @version 1.0
 * @date Created In 2019/5/29 23:53
 */
@Entity
@Table(name = "app_user")
@Data
@EqualsAndHashCode(callSuper=true)
public class User extends Base{
    @Column(name = "user_name",nullable = false)
    private String userName;

    @Column(name = "password",nullable = false)
    private String password;

}
