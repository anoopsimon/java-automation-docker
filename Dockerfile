
#install maven
FROM maven:3.8.6-amazoncorretto-11 AS build

MAINTAINER ASLV "ASLV@gmail.com"

#update maven settings file to work with internal repo
RUN mkdir -p /root/.m2 \
    && mkdir /root/.m2/repository
# Copy maven settings, containing repository configurations
COPY settings.xml /root/.m2

CMD ls
COPY . /framework
COPY pom.xml /framework/pom.xml

RUN  cd /framework && mvn clean package -DskipTests=true
