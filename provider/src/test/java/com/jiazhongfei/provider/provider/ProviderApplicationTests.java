package com.jiazhongfei.provider.provider;


import com.jiazhongfei.common.commonapi.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes =ProviderApplication.class )
public class ProviderApplicationTests {

    @Autowired
    private UserService userService;
    @Test
    public void contextLoads() {
        System.out.println(userService.hello());
    }

}
