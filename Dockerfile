#install maven
FROM maven:3.8.6-amazoncorretto-11 AS build

#update maven settings file to work with internal repo
RUN mkdir -p /root/.m2 \
    && mkdir /root/.m2/repository
# Copy maven settings, containing repository configurations
COPY settings.xml /root/.m2


COPY src /home/app/src
COPY pom.xml /home/app
COPY start.sh /home/app
RUN mvn -f /home/app/pom.xml clean test

#install Java 11
#FROM amazoncorretto:11
#
#COPY --from=build /home/app/target/io-automation-fw.jar /usr/local/lib/io-automation-fw.jar
#COPY --from=build /home/app/start.sh /usr/local/lib/start.sh

#run the executable
ENTRYPOINT ["java", "-jar","/usr/local/lib/io-automation-fw.jar"]
#ENTRYPOINT ["/usr/local/lib/start.sh"]
