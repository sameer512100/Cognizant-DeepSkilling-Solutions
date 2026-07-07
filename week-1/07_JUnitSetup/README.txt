Exercise: Setting Up JUnit
===========================

Steps:

1. Create a new Java project in your IDE (IntelliJ IDEA, Eclipse, etc.)

2. Add the JUnit dependency. If using Maven, add this to your pom.xml
   (see pom_snippet.xml in this folder):

   <dependency>
       <groupId>junit</groupId>
       <artifactId>junit</artifactId>
       <version>4.13.2</version>
       <scope>test</scope>
   </dependency>

3. Create a new test class in your project, for example
   src/test/java/MyFirstTest.java (a basic example is included in this
   folder as MyFirstTest.java).

4. Run the test class using your IDE's test runner (right-click ->
   Run Test) or via Maven with: mvn test
