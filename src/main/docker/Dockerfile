# 基于哪个镜像
FROM java:8

# 将本地文件夹挂载到当前容器
VOLUME /tmp

# 拷贝文件到容器，也可以直接写成ADD microservice-discovery-eureka-0.0.1-SNAPSHOT.jar /app.jar
ADD jenkins-0.0.1-SNAPSHOT.jar app.jar
RUN bash -c 'touch /app.jar'

# 开放9000端口
EXPOSE 9000

# 配置容器启动后执行的命令
ENTRYPOINT ["java","-jar","/app.jar"]