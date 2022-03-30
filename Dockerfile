FROM openjdk:8-alpine AS RUNTIME
RUN apk update && apk add --no-cache libc6-compat
RUN ln -s /lib64/ld-linux-x86-64.so.2 /lib/ld-linux-x86-64.so.2
WORKDIR /app/
EXPOSE 8080
COPY build/libs/testmongo-0.0.1-SNAPSHOT.jar /app/msventasexito-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar", "/app/msventasexito-0.0.1-SNAPSHOT.jar"]