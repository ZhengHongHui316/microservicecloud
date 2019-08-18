package com.atguigu.springcloud.cfgbeans;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RetryRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author zhh
 * @Date 2019/7/18 21:07
 * @Version 1.0
 **/
@Configuration //加了注解之后这个类类似以前ssm的配置文件applicationContext.xml
public class ConfigBean {
    @Bean
    @LoadBalanced //Ribbon负载均衡
    public RestTemplate getRestTemplate(){
        return  new RestTemplate();
    }

    @Bean
    public IRule myRule(){
       // return new RandomRule();//达到的目的，用我们重新选择的随机算法替代默认的轮询
        return new RetryRule();//默认轮询，如果有服务多次访问宕机，跳过
    }
}
