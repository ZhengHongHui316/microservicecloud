# microservicecloud
在配置SpringCloud Config的Client端，如果启动失败的情况，先检查github配置中心仓库的yml文件是否语法错误，特别是那些空格错误，建议直接复制内容
microservicecloud-config-eureka-client.yml和
microservicecloud-config-dept-client.yml和
microservicecloud-config-client.yml
为SpringCloud Config用到的github上的文件
## 运行环境
- 运行环境：JDK 8，Maven 3.3+
- 技术栈：SpringBoot 1.5.9、Springcloud、Druid、Mybatis
- 工具：IntelliJ IDEA、谷歌浏览器、Mysql

## SpringCloud组件

- 服务治理： Spring  Cloud Eureka  →服务注册中心，解决模块通信问题，通过模块名监听，避免机器ip改变时所有微服务都得改，每个模块注册一个服务，客户端可以监听，有安全保护机制

- 客户端负载均衡： Spring Cloud Ribbon 从**客户端**选择哪一个微服务，而不是像nginx一样由服务器帮我们负载均衡 (有多种负载均衡策略，如轮询，随机...还可以自定义)

- 服务容错保护： Spring  Cloud Hystrix  熔断器，类似保险丝，对于达到一定错误的微服务进行关闭 （服务熔断和降级）

- 声明式服务调用： Spring  Cloud Feign 整合了Ribbon 和Hystrix  

- API网关服务：Spring Cloud Zuul			API网关

- 分布式配置中心： Spring Cloud Config            （通过github统一多个服务的配置文件，利用bootstrap.yml加载远程配置，该文件优先于application.yml） 
 
