# Start with a base image containing Java runtime
FROM openjdk:21-jdk-alpine

# Add Maintainer Info
LABEL maintainer="andresousadotpt"

# Make port 8080 available to the world outside this container
EXPOSE 8080

# The application's jar file
ARG JAR_FILE=target/*.jar

# Add the application's jar to the container
ADD ${JAR_FILE} app.jar

# Copy the entrypoint.sh file
COPY entrypoint.sh /entrypoint.sh

# Make the script executable
RUN chmod +x /entrypoint.sh

# Run the entrypoint script
ENTRYPOINT ["/entrypoint.sh"]