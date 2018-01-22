package com.xinchen.springboot.start;

import com.xinchen.springboot.start.domain.UserRepository;
import com.xinchen.springboot.start.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;

import java.lang.reflect.Field;
import java.util.Date;

/**
 * @author Xin Chen
 * @date 2017/10/30 14:41
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class JpaTests {
    @Autowired
    private UserRepository userRepository;

    @Test
    public void test1(){
//        User user = new User();
//        user.setName("test");
//        user.setAge(21);
//        user.setTime(new Date());
//        userRepository.save(user);
        PageRequest pageable = new PageRequest(1,2);
        Page<User> users = userRepository.findAll(pageable);
        System.out.println(users);
        System.out.println(userRepository.findAll());
    }
    @Test
    public void test2() throws NoSuchFieldException, IllegalAccessException {
        String s = "abc";
        Field declaredField = String.class.getDeclaredField("value");
        declaredField.setAccessible(true);
        char[] value = (char[]) declaredField.get(s);
        value[0]='R';
        System.out.println(s);

    }
}
