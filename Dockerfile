# Utiliser l'image officielle de Java
FROM openjdk:21-slim

# Définir le répertoire de travail
WORKDIR /app

# Copier le JAR construit dans l'image
COPY target/demo-0.0.1-SNAPSHOT.jar demo.jar

# Exposer le port sur lequel Spring Boot écoute
#EXPOSE 8081

# Exécuter l'application Spring Boot
ENTRYPOINT ["java", "-jar", "/app/demo.jar"]
