package com.xinchen.springboot.start.domain.mapper.provider;

import com.xinchen.springboot.start.entity.User;
import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.jdbc.SQL;

/**
 * 注解动态SQL
 * @author Xin Chen (xinchenmelody@gmail.com)
 * @date: Created In 2018/1/24 21:20
 */
public class TutorDynaSqlProvider {

    public String findTutorByNameSql(String name) {
        return new SQL() {{
            SELECT("u.id,u.name,u.age,u.time");
            FROM("user u");
            if (StringUtils.isNotBlank(name)) {
                WHERE("name=#{name}");
            }
        }}.toString();
    }

    public String insert(User user) {
        return new SQL() {{
            INSERT_INTO("user");
            if (user.getAge() != null) {
                VALUES("age", "#{age}");
            }
            if (StringUtils.isNotBlank(user.getName())) {
                VALUES("name", "#{name}");
            }
            if (user.getTime() != null) {
                VALUES("time", "#{time}");
            }
        }}.toString();
    }
}
