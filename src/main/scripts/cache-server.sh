#!/bin/bash
. ./setenv.sh
JMXPROPERTIES="-Dcoherence.management=all -Dcoherence.management.remote=true"
MEMORY="512m"
CACHE_CONFIG="-Dcoherence.cacheconfig=../config/coherence-cache-config.xml"
REST_CONFIG="-Dcoherence.rest.config=../config/coherence-rest-config.xml"
JAVA_OPTS="-Xms$MEMORY -Xmx$MEMORY $CACHE_CONFIG $REST_CONFIG $JMXPROPERTIES -Dcoherence.log.level=9 "
echo $CLASSPATH
java -server -showversion $JAVA_OPTS -cp $CLASSPATH com.tangosol.net.DefaultCacheServer "$@"