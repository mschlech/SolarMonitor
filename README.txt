enable third party library within the maven build following command has to provided 

mvn install:install-file -Dfile=lib/DroidCharts.jar -DgroupId=net.droidsolutions.droidcharts -DartifactId=droidchart -Dversion=1.0 -Dpackaging=jar
 
mvn install:install-file -Dfile=lib/xstream-1.3.1.jar -DgroupId=com.thoughtworks.xstream -DartifactId=xstream-1.3.1 -Dversion=1.0 -Dpackaging=jar


This will add the necessary libraries into the local repository to provide a proper build.

change path element in pom.xml in sdk section to your android installation

Everything unfinished so far. 
