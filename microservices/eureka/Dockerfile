FROM maven:3.5-jdk-8

RUN mkdir /etc/eureka

COPY app /app
#EXPOSE 8010

WORKDIR /app
RUN mvn install
