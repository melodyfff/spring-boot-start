package com.xinchen.start.base.repository;

import com.xinchen.start.AppTests;
import com.xinchen.start.base.entity.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * @author Xin Chen (xinchenmelody@gmail.com)
 * @version 1.0
 * @date Created In 2019/5/30 0:16
 */
public class UserRepositoryTest extends AppTests {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void test1(){
        User user = new User();
        user.setUserName("ok");
        user.setPassword("ok");
        userRepository.save(user);


        System.out.println(userRepository.findAll());
    }

}