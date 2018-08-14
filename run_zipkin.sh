#!/bin/bash

sudo docker run --name af-zipkin -p 9411:9411 -d openzipkin/zipkin    
