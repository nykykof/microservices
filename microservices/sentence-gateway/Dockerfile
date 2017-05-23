FROM maven:3.5-jdk-8

RUN mkdir /etc/sentence-gateway

COPY app /app
COPY wait-for-config-server.sh /etc/sentence-gateway
RUN chmod u+x /etc/sentence-gateway/wait-for-config-server.sh

WORKDIR /app

RUN mvn install -D maven.test.skip
