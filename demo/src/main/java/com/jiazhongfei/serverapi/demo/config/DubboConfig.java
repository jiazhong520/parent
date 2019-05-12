package com.jiazhongfei.serverapi.demo.config;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ProtocolConfig;
import com.alibaba.dubbo.config.ReferenceConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.spring.ReferenceBean;
import com.jiazhongfei.common.commonapi.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DubboConfig {

    @Bean
    public ApplicationConfig applicationConfig(){
        ApplicationConfig applicationConfig =new ApplicationConfig();
        applicationConfig.setName("user-service-cunsumer");
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
    public ReferenceBean referenceConfig(){
        ReferenceBean<UserService> referenceConfig =new ReferenceBean<>();
        referenceConfig.setInterface(UserService.class);
        return referenceConfig;
    }
}
