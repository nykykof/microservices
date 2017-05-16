FROM java:8

RUN mkdir /etc/api-gateway
ADD api-gateway-1.jar /etc/api-gateway
COPY wait-for-config-server.sh /etc/api-gateway
RUN chmod u+x /etc/api-gateway/wait-for-config-server.sh
#EXPOSE 8080

#run the app

#ENTRYPOINT ["java","-jar","/etc/api-gateway/api-gateway-1.jar","FOREGROUND"]


