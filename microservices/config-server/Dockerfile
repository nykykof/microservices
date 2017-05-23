FROM maven:3.5-jdk-8

RUN mkdir /etc/config-server

COPY app /app
#EXPOSE 8001

WORKDIR /app

RUN mvn install
