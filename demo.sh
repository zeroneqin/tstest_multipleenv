#/bin/sh

mvn  clean package -Dtestngfile=demo.xml -DipList=127.0.0.1,localhost
