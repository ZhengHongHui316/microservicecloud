package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author zhh
 * @Date 2019/7/18 20:20
 * @Version 1.0
 **/
@SpringBootApplication
@EnableEurekaClient     //本服务启动后会自动注册进eureka服务列表中
@EnableDiscoveryClient //服务发现
public class DeptProvider8003_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8003_App.class,args);
    }
}
