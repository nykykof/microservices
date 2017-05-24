FROM maven:3.5-jdk-8

COPY app /app
WORKDIR /app

RUN chmod u+x wait-for-config-server.sh

RUN mvn install -D maven.test.skip

