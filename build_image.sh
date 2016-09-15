#!/bin/bash
docker rmi build-img || true
docker build -t build-img -f Dockerfile.build .
docker tag build-img build-img:bak
docker rm build-cont || true
docker create --name build-cont build-img
mkdir -p target
docker cp build-cont:/usr/local/ccloud/target/answer-1.0-SNAPSHOT.jar ./target/answer-1.0-SNAPSHOT.jar
docker rmi answer-image || true
docker build -t answer-image .
