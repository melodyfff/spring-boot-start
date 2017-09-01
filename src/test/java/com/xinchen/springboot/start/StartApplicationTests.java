package com.xinchen.springboot.start;

import com.xinchen.springboot.start.entity.User;
import com.xinchen.springboot.start.service.UserMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StartApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    @Rollback
    @Transactional
    public void findByName() throws Exception {
        User u = new User();
        try {
//		userMapper.insert("AAA", 20);
            u = userMapper.findByName("AAA");
            System.out.println(u);
//            throw new Exception();
        } catch (Exception e) {
            e.printStackTrace();
        }

        Assert.assertEquals(20, u.getAge().intValue());
    }


}
