FROM gradle:8.5.0-jdk17 AS build
COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src/applications/app-service
RUN gradle clean bootJar --no-daemon

FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY --from=build /home/gradle/src/applications/app-service/build/libs/*.jar account.jar
ENV JAVA_OPTS="-XX:+UseContainerSupport -XX:MaxRAMPercentage=70 -Djava.security.egd=file:/dev/./urandom"
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS  -jar account.jar" ]
EXPOSE 8080
