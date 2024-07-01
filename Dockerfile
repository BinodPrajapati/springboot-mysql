FROM eclipse-temurin:17-jdk-jammy
EXPOSE 8080
ADD target/SpringbootMysqlApplication.jar SpringbootMysqlApplication.jar
ENTRYPOINT ["java", "-jar","/SpringbootMysqlApplication.jar"]