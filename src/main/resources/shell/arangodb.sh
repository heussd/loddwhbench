#!/bin/bash

rm -R ~/arangoDB/

sleep 10 && arangosh --javascript.execute-string "db._createDatabase('loddwhbench')" &
/usr/local/Cellar/arangodb/2.6.9/sbin/arangod ~/arangoDB/ 
