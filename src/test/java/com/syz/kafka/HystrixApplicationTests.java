package com.syz.kafka;

import com.netflix.appinfo.InstanceInfo;
import com.syz.kafka.utils.JacksonUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class HystrixApplicationTests {

	@Autowired
	private DiscoveryClient discoveryClient;

	@Test
	public void contextLoads() {
	}

	@Test
	public void getAllInstance() throws Exception {
		//获取服务名称
		List<String> serviceNames = discoveryClient.getServices();
		for (String serviceName : serviceNames) {
			//获取服务中的实例列表
			List<ServiceInstance> serviceInstances = discoveryClient.getInstances(serviceName);
			System.out.println(String.format("服务：%s ,实例： %s",serviceName,JacksonUtil.obj2json(serviceInstances)));
		}
	}

}
