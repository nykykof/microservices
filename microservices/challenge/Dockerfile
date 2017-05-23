FROM maven:3.5-jdk-8

RUN mkdir /etc/challenge

COPY app /app
COPY wait-for-config-server.sh /etc/challenge
RUN chmod u+x /etc/challenge/wait-for-config-server.sh

WORKDIR /app

RUN mvn install -D maven.test.skip
