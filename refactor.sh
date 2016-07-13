#!/bin/sh

#group名称，例:com.weidian.pay
groupName=$1
#项目名称，例：pay-channel
projectName=$2


######修改根项目######
#替换group
sed -i "" "s/com.zmannotes.spring/$groupName/g" `find . -name pom.xml`
#替换projectName
sed -i "" "s/multiple-models/$projectName/g" `find . -name pom.xml`
#修改根项目名称
mv ../multiple-models-application ../$projectName

######修改子项目######
###修改application
mv multiple-models-application $projectName-application
cd $projectName-application
#修改pom.xml
#替换group
sed -i "" "s/com.zmannotes.spring/$groupName/" pom.xml
#替换projectName
sed -i "" "s/multiple-models-application/$projectName/g" pom.xml
#移动文件到新的目录，目录为group和projectName拼接而成路径
packageName=$groupName/`echo ${projectName//-\/}`
dir=`echo ${packageName//\./\/}`
mkdir -p src/main/java/$dir
mv src/main/java/com/zmannotes/spring/* src/main/java/$dir
#删除旧目录
rm -rf src/main/java/com/zmannotes
cd -

###修改data
mv multiple-models-data $projectName-data
cd $projectName-data
#移动文件到新的目录，目录为group和projectName拼接而成路径
packageName=$groupName/`echo ${projectName//-\/}`
dir=`echo ${packageName//\./\/}`
mkdir -p src/main/java/$dir
mv src/main/java/com/zmannotes/spring/* src/main/java/$dir
#删除旧目录
rm -rf src/main/java/com/zmannotes
cd -

###修改service
mv multiple-models-service $projectName-service
cd $projectName-service
#移动文件到新的目录，目录为group和projectName拼接而成路径
packageName=$groupName/`echo ${projectName//-\/}`
dir=`echo ${packageName//\./\/}`
mkdir -p src/main/java/$dir
mv src/main/java/com/zmannotes/spring/* src/main/java/$dir
#删除旧目录
rm -rf src/main/java/com/zmannotes
cd -

