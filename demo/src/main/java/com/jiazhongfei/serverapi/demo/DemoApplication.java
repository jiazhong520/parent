package com.jiazhongfei.serverapi.demo;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import com.jiazhongfei.common.commonapi.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDubbo
@RestController
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Autowired
    private UserService userService;
    @GetMapping("/hello")
    public String get(){
        return userService.hello();
    }
}
