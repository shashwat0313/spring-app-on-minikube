kubectl delete pods  --all --grace-period=0 --force
kubectl delete deployments  --all --grace-period=0 --force
kubectl delete services  --all --grace-period=0 --force

kubectl apply -f postgres-data-persistentvolumeclaim.yaml
kubectl apply -f postgres-deployment.yaml
kubectl apply -f postgres-service.yaml
kubectl apply -f spring-app-deployment.yaml
kubectl apply -f spring-app-service.yaml

kubectl get pods
kubectl get services

start cmd /k "minikube tunnel"

exit
