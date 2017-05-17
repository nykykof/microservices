FROM java:8

RUN mkdir /etc/challenge
COPY  challenge-1.jar /etc/challenge
COPY wait-for-config-server.sh /etc/challenge
RUN chmod u+x /etc/challenge/wait-for-config-server.sh

#run the app
#ENTRYPOINT ["java","-jar","/etc/challenge/challenge-1.jar","FOREGROUND"]

