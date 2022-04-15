FROM openjdk:8
MAINTAINER HRUTHIK CHEVURI hruthik.chevuri@iiitb.ac.in 
COPY ./target/MY_CAL-1.0-VERSION-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java", "-cp", "MY_CAL-1.0-VERSION-jar-with-dependencies.jar", "MY_CAL.Calc"]
