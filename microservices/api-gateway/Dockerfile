FROM maven:3.5-jdk-8

RUN mkdir /etc/api-gateway

COPY app /app
COPY wait-for-config-server.sh /etc/api-gateway
RUN chmod u+x /etc/api-gateway/wait-for-config-server.sh
#EXPOSE 8080

WORKDIR /app

RUN mvn install -D maven.test.skip
