FROM java:8
VOLUME /tmp
ADD system-dept.jar system.jar
RUN bash -c "touch /system.jar"
EXPOSE 8090
ENTRYPOINT ["java","-jar","system.jar"]
