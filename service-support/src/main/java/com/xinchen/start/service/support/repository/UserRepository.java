package com.xinchen.start.service.support.repository;

import com.xinchen.start.common.entity.User;
import org.springframework.data.repository.CrudRepository;

/**
 * @author xinchen
 * @version 1.0
 * @date 30/05/2019 17:12
 */
public interface UserRepository extends CrudRepository<User,Long> {

}
