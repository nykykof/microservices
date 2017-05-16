FROM java:8

RUN mkdir /etc/sentence-gateway
COPY sentence-gateway-1.jar /etc/sentence-gateway


#run the app
ENTRYPOINT ["java","-jar","/etc/sentence-gateway/sentence-gateway-1.jar","FOREGROUND"]

