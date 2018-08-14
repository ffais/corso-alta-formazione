#!/bin/bash


sudo docker run --name af-catalog --link af-mongodb:mongo --link af-registry --link af-zipkin -p 8080:8080 af-catalog 
