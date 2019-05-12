package com.jiazhongfei.provider.provider.provider;


import com.alibaba.dubbo.config.annotation.Service;
import com.jiazhongfei.common.commonapi.UserService;


@Service
public class UserServiceImpl implements UserService {
    @Override
    public String hello() {
        return "hello world";
    }
}
