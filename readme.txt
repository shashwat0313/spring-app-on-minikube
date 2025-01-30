1. install minikube, and ensure docker desktop is running
   1.1 ensure minikube instance is running
2. apply this command ---> kubectl apply -f filename.yaml
   replace filename.yaml with the file name you want to apply
   in the given order:
   2.1 postgres-data-persistentvolumeclaim.yaml
   2.2 postgres-deployment.yaml
   2.3 postgres-service.yaml
   2.4 spring-app-deployment.yaml
   2.5 spring-app-service.yaml

3. verify the status of the pods using the command ---> kubectl get pods

4. check the status of services using the command ---> kubectl get services

5. use the external ip and por of LB to access the apis

6. api 1: /add/{product-name} ---> add a product, path variable product-name is the name of the product
   api 2: /get/all ---> get a list of all products