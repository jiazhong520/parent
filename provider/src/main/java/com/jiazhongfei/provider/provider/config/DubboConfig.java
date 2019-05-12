package com.jiazhongfei.provider.provider.config;

import com.alibaba.dubbo.config.*;
import com.jiazhongfei.common.commonapi.UserService;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DubboConfig {

    @Bean
    public ApplicationConfig applicationConfig(){
        ApplicationConfig applicationConfig =new ApplicationConfig();
        applicationConfig.setName("user-service-priver");
        return applicationConfig;
    }
    @Bean
    public RegistryConfig registryConfig(){
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setProtocol("zookeeper");
        registryConfig.setAddress("zookeeper://192.168.109.139:2181");
        return registryConfig;
    }
    @Bean
    public ProtocolConfig protocolConfig(){
        ProtocolConfig protocolConfig =new ProtocolConfig();
        protocolConfig.setName("dubbo");
        protocolConfig.setPort(20895);
        return protocolConfig;
    }
    @Bean
    public ServiceConfig serviceConfig(UserService userService){
        ServiceConfig<UserService> serviceConfig = new ServiceConfig<>();
        serviceConfig.setInterface(UserService.class);
        serviceConfig.setRef(userService);
        return serviceConfig;
    }
}