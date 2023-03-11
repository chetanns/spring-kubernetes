# Docker commands

## Build Command

docker build -t myorg/myapp .

## Run Command

docker run -p 8080:8080 myorg/myapp

Docker hub access token

<CLUSTER_TOKEN>

## For volumn mounted configMap use the following value for the spring.config.import value

configtree:db.properties

## kubectl command to generate configuration without applying the changes.

kubectl create configmap language --from-literal=LANGUAGE=Spanish \
-o yaml --dry-run

##  create secret

kubectl create secret docker-registry dockersecret \
--docker-server=http://hub.docker.com --docker-username=<username> --docker-password=<password> --docker-email=chetanns@gmail.com