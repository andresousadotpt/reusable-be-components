#!/bin/sh

# Start the Java application
exec java -Dspring.profiles.active=dev \
 -jar /app.jar