#!/bin/bash
. ./setenv.sh
MEMORY="512m"
CACHE_CONFIG="-Dcoherence.cacheconfig=../config/coherence-cache-config.xml"
REST_CONFIG="-Dcoherence.rest.config=../config/coherence-rest-config.xml"
JAVA_OPTS="-Xms$MEMORY -Xmx$MEMORY $CACHE_CONFIG $REST_CONFIG  "
#export CLASSPATH="/Users/agirona/.m2/repository/com/oracle/coherence/coherence/14.1.1-0-3/coherence-14.1.1-0-3.jar:/Users/agirona/projects/workspace/rest-tests/target/rest-tests-1.0-SNAPSHOT.jar"
echo $CLASSPATH
java -server -showversion $JAVA_OPTS -cp $CLASSPATH com.oracle.support.BulkLoadPerson