FROM openjdk:8
EXPOSE 8080
ADD target/SpringbootMysqlApplication.jar SpringbootMysqlApplication.jar
ENTRYPOINT ["java", "-jar","/SpringbootMysqlApplication.jar"]