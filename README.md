# QCon 2017 - Demo

* Run Docker Registry
```
docker-compose -f registry.yml up -d
```

* Build Docker images
```
mvn clean install -f OrderProducer/pom.xml
mvn clean install -f OrderConsumer/pom.xml
```

* Start swarm
```
docker swarm init
```

* Deploy stack
```
docker stack deploy -c demo.yml demo
```

* View logs
```
docker service logs -f demo_orderconsumer
```