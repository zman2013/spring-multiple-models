#!/bin/sh
#./replace-version.sh 1.0.0 1.0.1
oldVersion=$1
newVersion=$2
sed -i "" "s/$oldVersion/$newVersion/g"  `grep $oldVersion . -rl|grep pom.xml`
