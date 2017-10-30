package com.xinchen.springboot.start.domain;

import com.xinchen.springboot.start.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Xin Chen
 * @date 2017/10/30 14:37
 */
public interface UserRepository extends JpaRepository<User,Long> {
}
