# from base image centos
FROM ubuntu/java:8

ADD target/bookstore-book-0.0.1-SNAPSHOT.jar /opt/app/

EXPOSE 8080

ENTRYPOINT ["java" ,"-jar","/opt/app/bookstore-book-0.0.1-SNAPSHOT.jar"]
