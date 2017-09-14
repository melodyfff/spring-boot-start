package com.xinchen.springboot.start;



import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.xinchen.springboot.start.util.ErrorProcessorUtil;

@RunWith(SpringRunner.class)
@SpringBootTest
public class test {

    @Autowired
    private ErrorProcessorUtil errorProcessorUtil;

    @Test
    public void test() throws Exception {
        String data = "<data> error1 </data>";

        errorProcessorUtil.check(data);
    }


}
