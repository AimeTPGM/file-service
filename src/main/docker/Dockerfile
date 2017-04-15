FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
ADD ./target/file-service-0.0.1.jar file-service.jar
RUN sh -c 'touch /file-service.jar'
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /file-service.jar" ]