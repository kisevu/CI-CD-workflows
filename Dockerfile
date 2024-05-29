FROM openjdk:17
EXPOSE 2598
ADD target/ameda-cicd-workflow.jar ameda-cicd-workflow.jar
ENTRYPOINT ["java","-jar","/ameda-cicd-workflow.jar "]