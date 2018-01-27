FROM openjdk:8-jre-alpine
WORKDIR /appdemo/
COPY  parent-1.0-SNAPSHOT.zip /appdemo
RUN  unzip /appdemo/parent-1.0-SNAPSHOT.zip && rm -rf parent-1.0-SNAPSHOT.zip
ENTRYPOINT [ "./parent-1.0-SNAPSHOT/bin/parent"]