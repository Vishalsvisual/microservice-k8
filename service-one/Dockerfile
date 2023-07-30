FROM mcr.microsoft.com/openjdk/jdk:17-ubuntu
VOLUME /tmp
COPY target/service-one-0.0.1-SNAPSHOT.jar service-one.jar
ARG JAVA_OPTS
ENV JAVA_OPTS=$JAVA_OPTS
EXPOSE 8080
ENTRYPOINT ["java","-jar","service-one.jar"]