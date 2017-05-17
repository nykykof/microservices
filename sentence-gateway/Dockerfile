FROM java:8

RUN mkdir /etc/sentence-gateway
COPY sentence-gateway-1.jar /etc/sentence-gateway
COPY wait-for-config-server.sh /etc/sentence-gateway
RUN chmod u+x /etc/sentence-gateway/wait-for-config-server.sh

#run the app
#ENTRYPOINT ["java","-jar","/etc/sentence-gateway/sentence-gateway-1.jar","FOREGROUND"]

