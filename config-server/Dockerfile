FROM java:8

RUN mkdir /etc/config-server
COPY config-server-1.jar /etc/config-server
#EXPOSE 8001

#run the app
ENTRYPOINT ["java","-jar","/etc/config-server/config-server-1.jar","FOREGROUND"]

