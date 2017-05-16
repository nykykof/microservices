FROM java:8

RUN mkdir /etc/eureka
ADD eureka-1.jar /etc/eureka
#EXPOSE 8010

#run the app
ENTRYPOINT ["java","-jar","/etc/eureka/eureka-1.jar","FOREGROUND"]


