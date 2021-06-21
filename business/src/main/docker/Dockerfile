FROM java:8
VOLUME /tmp
ADD business-dept.jar business.jar
RUN bash -c "touch /business.jar"
EXPOSE 8090
ENTRYPOINT ["java","-jar","business.jar"]
