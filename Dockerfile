FROM openjdk:8
LABEL description="https://www.qekang.com"
MAINTAINER https://blog.csdn.net/qierkang
ADD target/yang-server.jar /yang-server.jar
RUN ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime
RUN echo 'Asia/Shanghai' >/etc/timezone
ENV PORT 8080
CMD java -jar -Duser.timezone=GMT+08 /yang-server.jar -p $PORT