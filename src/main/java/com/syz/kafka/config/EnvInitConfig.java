package com.syz.kafka.config;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Slf4j
public class EnvInitConfig implements CommandLineRunner {

    public static String SERVER = "";

    @Value("${server.port}")
    private int port;
    @Value("${spring.application.name}")
    private String serverName;

    @Autowired
    private DiscoveryClient discoveryClient;

    @Override
    public void run(String... args) throws Exception {
        String res = "";
        //获取服务名称
        List<String> serviceNames = discoveryClient.getServices();
        for (String serviceName : serviceNames) {
            if(StringUtils.isNotEmpty(res)){
                break;
            }
            if(!serviceName.equalsIgnoreCase(serverName)){
                continue;
            }
            //获取服务中的实例列表
            List<ServiceInstance> serviceInstances = discoveryClient.getInstances(serviceName);
            for (ServiceInstance instance : serviceInstances) {
                if(instance.getPort() == port){
                    res = instance.getServiceId() + ":" +instance.getInstanceId();
                }
            }
        }
        SERVER = StringUtils.isNotEmpty(res) ? res : serverName+ ":" + port;
        log.info("set env SERVER :{}",SERVER);
    }
}
