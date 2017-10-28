package com.xinchen.springboot.start.service;

import com.xinchen.springboot.start.entity.User;
import org.apache.ibatis.annotations.*;

import java.sql.Date;


@Mapper
public interface UserMapper {

    @Select("SELECT * FROM USER WHERE NAME = #{name}")
    User findByName(@Param("name") String name);

    @Insert({"INSERT INTO USER(NAME, AGE,TIME}) VALUES(#{name}, #{age},#{time})"})
    int insert(@Param("name") String name, @Param("age") Integer age,@Param("time") Date time);

}
