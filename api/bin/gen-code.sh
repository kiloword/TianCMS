#!/usr/bin/env bash

set -e

usage(){
    echo "Usage: $0"
    echo "       Run script at the directory of pom.xml. "
}

if [ ! -f "pom.xml" ];then
    usage
    exit -5
fi

profile="generator"
mvn clean compile exec:java -P$profile