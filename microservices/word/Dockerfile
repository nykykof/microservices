FROM maven:3.5-jdk-8

RUN mkdir /etc/word

COPY app /app
COPY wait-for-config-server.sh /etc/word
RUN chmod u+x /etc/word/wait-for-config-server.sh

WORKDIR /app

RUN mvn install -D maven.test.skip

