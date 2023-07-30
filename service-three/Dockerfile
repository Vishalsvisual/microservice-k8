FROM mcr.microsoft.com/openjdk/jdk:17-ubuntu
VOLUME /tmp
COPY target/service-three-0.0.1-SNAPSHOT.jar service-three.jar
ARG JAVA_OPTS
ENV JAVA_OPTS=$JAVA_OPTS
EXPOSE 8082
ENTRYPOINT ["java","-jar","service-three.jar"]