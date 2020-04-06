# spring-cloud-alibaba

## nacos demo
- test config
~~~
curl -X POST "http://127.0.0.1:8848/nacos/v1/cs/configs?dataId=example.properties&group=DEFAULT_GROUP&content=useLocalCache=true"
~~~
