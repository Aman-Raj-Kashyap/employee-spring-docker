#define base docker image
FROM openjdk:8
EXPOSE 8888
ADD target/springbootcrud.jar springbootcrud.jar
ENTRYPOINT ["java", "-jar", "springbootcrud.jar"]