#!/bin/bash


sudo docker run --name af-gateway --link af-registry --link af-catalog --link af-zipkin -p 9000:8080 af-gateway
# --link af-purchase
