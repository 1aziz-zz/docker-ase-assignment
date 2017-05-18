FROM anapsix/alpine-java:latest
COPY target/docker-ase-1.jar /home
WORKDIR /home
CMD [ "java", "-jar", "docker-ase-1.jar" ] 
EXPOSE 8080
