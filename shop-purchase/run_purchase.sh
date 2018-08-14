#!/bin/bash


sudo docker run --name af-purchase --link af-mongodb:mongo --link af-registry --link af-zipkin -p 8085:8080 af-purchase
