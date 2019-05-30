package com.xinchen.start.common.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NonNull;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author xinchen
 * @version 1.0
 * @date 30/05/2019 17:09
 */
@Entity
@Table(name = "app_user")
@Data
@EqualsAndHashCode(callSuper=true)
public class User extends Base{
    @NonNull
    @Column(name = "user_name",nullable = false)
    private String userName;

    @NonNull
    @Column(name = "password",nullable = false)
    private String password;
}
