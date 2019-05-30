package com.xinchen.start.common.entity;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * @author xinchen
 * @version 1.0
 * @date 30/05/2019 17:05
 */
@Data
@MappedSuperclass
public class Base {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
}
