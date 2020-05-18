FROM adoptopenjdk:11.0.4_11-jre-hotspot
RUN mkdir /opt/app
ARG JAR_FILE
COPY ${JAR_FILE} /opt/app/service_app.jar
EXPOSE 8081
ENTRYPOINT [ "java", "-jar", "/opt/app/service_app.jar"]

