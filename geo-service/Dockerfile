#基础镜像：仓库是java，tag是8
FROM java:8
VOLUME /tmp
#将打包好的spring程序拷贝到容器中的指定位置
ADD target/geo-service-1.0-SNAPSHOT.jar geo-service-1.0-SNAPSHOT.jar
#容器对外暴露8080端口
EXPOSE 8080
#容器启动后需要执行的命令
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar geo-service-1.0-SNAPSHOT.jar"]