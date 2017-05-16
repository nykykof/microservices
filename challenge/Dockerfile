FROM java:8

RUN mkdir /etc/challenge
COPY  challenge-1.jar /etc/challenge


#run the app
ENTRYPOINT ["java","-jar","/etc/challenge/challenge-1.jar","FOREGROUND"]

