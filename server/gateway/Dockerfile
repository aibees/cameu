FROM java:11

MAINTAINER junseo.park<aibees1129@naver.com>

EXPOSE 8080

ARG JAR_FILE=build/libs/CameuGateway-0.0.1-SNAPSHOT.jar

ADD ${JAR_FILE} Cameu_Gateway.jar

ENTRYPOINT ["java", "-jar", "/Cameu_Gateway.jar"]
