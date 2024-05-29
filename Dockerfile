FROM openjdk:17
EXPOSE 2539
ADD target/ameda-cicd-jenkins-workflow.jar ameda-cicd-jenkins-workflow.jar
ENTRYPOINT ["java","-jar","/ameda-cicd-jenkins-workflow.jar "]