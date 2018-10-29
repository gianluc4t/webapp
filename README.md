# Template project
____

This app is a template for web application, exposing servlet and jsp 
____
 
** Prerequisites **

1. java 8
1. mvn 3.5

____
  
** Compile **

This project was created by maven archetype:

> mvn archetype:create -DgroupId=com.gt.web -DartifactId=web-app -DarchetypeArtifactId=maven-archetype-webapp
____
  
** Compile **
 
> mvn clean compile
  
____
** tomcat management **

> mvn tomcat7:[deploy|undeploy|redeploy]

Dont forget, to manage tomcat instance must to do these two steps:
first put in {TOMCAT_HOME}\conf\tomcat-users.xml
 
- _ <role rolename="manager-gui"/> _
- _ <role rolename="manager-script"/> _
- _ <user username="admin" password="admin" roles="tomcat,role1,manager-gui,manager-script"/> _
 
then put in {HOME}\.m2\settings.xml
- _  <servers> _
- _    <server> _
- _        <id>TomcatServer</id> _
- _        <username>admin</username> _
- _        <password>admin</password> _
- _    </server> _
- _  </servers> _