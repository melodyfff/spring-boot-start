package com.xinchen.start.base.repository;

import com.xinchen.start.base.entity.User;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Xin Chen (xinchenmelody@gmail.com)
 * @version 1.0
 * @date Created In 2019/5/30 0:15
 */
public interface UserRepository extends CrudRepository<User,Long> {
}
