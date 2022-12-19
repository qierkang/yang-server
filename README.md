<h3 align="center"><a href="https://blog.csdn.net/qierkang" target="_blank">羊了个娘🐑🐑🐑</a></h3>

<p align="center">
<a href="https://www.qekang.com"><img alt="文档创建&贡献者" src="https://img.shields.io/badge/文档创建&贡献者-尔康-blueviolet.svg"/></a>
<a href="https://blog.csdn.net/qierkang"><img alt="blog" src="https://img.shields.io/badge/blog-important.svg"/></a>
<a href="https://www.oracle.com/technetwork/java/javase/downloads/index.html"><img alt="JDK" src="https://img.shields.io/badge/JDK-1.8.0_162-orange.svg"/></a>
<a href="https://docs.spring.io/spring-boot/docs/2.1.0.RELEASE/reference/html/"><img alt="Spring Boot" src="https://img.shields.io/badge/Spring Boot-2.1.0.RELEASE-brightgreen.svg"/></a>
<a href="https://996.icu"><img alt="996" src="https://img.shields.io/badge/link-996.icu-red.svg"/></a>
<a href="https://github.com/996icu/996.ICU/blob/master/LICENSE"><img alt="996" src="https://img.shields.io/badge/license-Anti%20996-blue.svg"/></a>
</p>

<p align="center">
<font face="微软雅黑" size=2 color=#A9A9A9 >版权声明：内容供内部学习使用，请勿外传！转载请附上作者信息</font>
</p>

## 开发环境

nohup java -jar -Duser.timezone=GMT+08 -XX:MetaspaceSize=256m -XX:MaxMetaspaceSize=256m -Xms128m -Xmx356m -Xmn256m -Xss256k -XX:SurvivorRatio=8 -XX:+UseConcMarkSweepGC -XX:CompileCommand=exclude,org/hibernate/cfg/annotations/SimpleValueBinder,setType yang-server.jar -p 8080 >log.log 2>&1 &

nohup java -jar -Duser.timezone=GMT+08 yang-server.jar -p 8080 &> yang.log &

- **JDK 1.8 +**
- **Maven 3.5 +**
- **IntelliJ IDEA ULTIMATE 2019.2 +** (*注意：务必使用 IDEA 开发，同时保证安装 `lombok` 插件*)
- **Mysql 5.7 +** (*尽量保证使用 5.7 版本以上，因为 5.7 版本加了一些新特性，同时不向下兼容。本 demo 里会尽量避免这种不兼容的地方，但还是建议尽量保证 5.7 版本以上*)

## docker

Build mavne

```
mvn clean install
```

Build image

```
docker rm -f yang-server
docker rmi -f qierkang/yang-server
docker build -t qierkang/yang-server .
```

start container

```
docker run -d --name yang-server --restart always -e PORT=8080 -p 8080:8080 qierkang/yang-server
docker logs -f yang-server
```

<h3 align="center"><a href="https://github.com/alibaba/spring-cloud-alibaba" target="_blank">Spring Cloud Alibaba</a></h3>

---

**[Nacos](https://nacos.io/zh-cn/docs/what-is-nacos.html) - 发现|配置|管理微服务解决方案**

Nacos 致力于帮助您发现、配置和管理微服务。Nacos 提供了一组简单易用的特性集，帮助您快速实现动态服务发现、服务配置、服务元数据及流量管理。

**[Nacos Config](https://github.com/alibaba/spring-cloud-alibaba/blob/master/spring-cloud-alibaba-examples/nacos-example/nacos-config-example/readme-zh.md) - 配置中心微服务解决方案**

Nacos 提供用于存储配置和其他元数据的 key/value 存储，为分布式系统中的外部化配置提供服务器端和客户端支持。使用 Spring Cloud Alibaba Nacos Config，您可以在 Nacos Server 集中管理你 Spring Cloud 应用的外部属性配置。

**[Seata](https://seata.io/zh-cn/docs/overview/what-is-seata.html) - 分布式事务解决方案**

Seata 是一款开源的分布式事务解决方案，致力于提供高性能和简单易用的分布式事务服务。Seata 将为用户提供了 AT、TCC、SAGA 和 XA 事务模式，为用户打造一站式的分布式解决方案。

**[Mybatis-Plus](http://mp.baomidou.com/) - 增强工具包**

Mybatis-Plus（简称 MP）是一个 MyBatis 的增强工具，在 MyBatis 的基础上只做增强不做改变，为简化开发、提高效率而生

**[Hutool](https://www.hutool.cn/docs/) - JAVA工具类库**

Hutool是一个小而全的Java工具类库，通过静态方法封装，降低相关API的学习成本，提高工作效率，使Java拥有函数式语言般的优雅，让Java语言也可以“甜甜的”。

**[WxJava](https://github.com/Wechat-Group/WxJava/wiki) - 微信开发 Java SDK**

支持包括微信支付、开放平台、公众号、企业微信/企业号、小程序等微信功能的后端开发。

**- Actuator:健康检查、审计、统计和监控**