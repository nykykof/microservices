FROM java:8

RUN mkdir /etc/word
COPY word-1.jar /etc/word
COPY wait-for-config-server.sh /etc/word
RUN chmod u+x /etc/word/wait-for-config-server.sh

#run the app
#ENTRYPOINT ["java","-jar","/etc/word/word-1.jar","FOREGROUND"]

