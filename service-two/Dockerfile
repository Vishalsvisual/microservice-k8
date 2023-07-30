#
# Package stage
#
FROM mcr.microsoft.com/openjdk/jdk:17-ubuntu
VOLUME /tmp
COPY target/service-two-0.0.1-SNAPSHOT.jar service-two.jar
ARG JAVA_OPTS
ENV JAVA_OPTS=$JAVA_OPTS
EXPOSE 8081
ENTRYPOINT ["java","-jar","service-two.jar"]