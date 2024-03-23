#!/bin/bash

imageName="auth"
containerName="auth_service"

docker build -t $imageName .

docker run -d --name $containerName $imageName

echo "Do you want to push the image to a Docker registry? (yes/no)"
read -r pushAnswer

if [ "$pushAnswer" == "yes" ]; then
    echo "Enter Docker registry URL:"
    read -r registryUrl

    echo "Enter Docker registry username:"
    read -r registryUsername

    echo "Enter Docker registry password:"
    read -r -s registryPassword

    # shellcheck disable=SC2086
    echo "$registryPassword" | docker login $registryUrl --username $registryUsername --password-stdin

    docker tag $imageName "$registryUrl"/$imageName

    docker push "$registryUrl"/$imageName

    echo "Docker image has been pushed to the Docker registry."
else
    echo "Docker image has not been pushed to the Docker registry."
fi
