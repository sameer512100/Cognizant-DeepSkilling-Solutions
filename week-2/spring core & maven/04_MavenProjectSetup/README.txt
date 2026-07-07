Exercise: Creating and Configuring a Maven Project
====================================================

1. Create a New Maven Project
--------------------------------
Create a new Maven project named "LibraryManagement" (via your IDE's
New Project wizard, or with the command below):

    mvn archetype:generate -DgroupId=com.library -DartifactId=LibraryManagement \
        -DarchetypeArtifactId=maven-archetype-webapp -DinteractiveMode=false

2. Add Spring Dependencies
-----------------------------
The pom.xml in this folder includes:
- spring-context   (core IoC container support)
- spring-aop       (aspect-oriented programming support)
- spring-webmvc    (Spring MVC for building web applications)

3. Configure Maven Plugins
------------------------------
The pom.xml also configures the maven-compiler-plugin to compile the
project using Java 1.8 (source and target version 1.8).

4. Verify the Setup
-----------------------
Run the following command in the project root to confirm everything is
configured correctly:

    mvn clean install

If the build succeeds, the project is set up correctly with all Spring
dependencies and the Java 1.8 compiler configuration in place.
