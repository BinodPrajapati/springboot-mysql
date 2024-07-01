# springboot-mysql

# Clean Build 
./mvnw clean install

# Docker login
docker login

# Docker Create network
docker network create mysql_network

# Docker connect to network
docket network connect mysql mysql_network

# Docker Build
ddocker build -t binodprajapati/springboot-mysql:1.0.0 .

# Docker push 
docker push binodprajapati/springboot-mysql:1.0.0

# Docker RUN command
docker run -p 8082:8082 \
--hostname=localhost \
--name mysql-springboot-container \
--net mysql_network \
-e MYSQL_HOST=mysql \
-e MYSQL_PORT=3306 \
-e MYSQL_SCHEMA=my_schema \
-e MYSQL_USER=root \
-e MYSQL_PASSWORD=root binodprajapati/springboot-mysql:1.0.0