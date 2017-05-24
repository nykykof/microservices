FROM maven:3.5-jdk-8

RUN mkdir /etc/word

COPY app /app
#COPY wait-for-config-server.sh /etc/word

WORKDIR /app
RUN chmod u+x wait-for-config-server.sh

RUN mvn install -D maven.test.skip

