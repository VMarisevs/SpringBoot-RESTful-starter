# Spring-Boot Project Template

## Environment

[STS plugin for Eclipse or Eclipse](https://spring.io/tools/sts/all)

## Examples

 * [Controller examples](http://spring.io/guides/tutorials/bookmarks/)
 * [Custom security configuration](http://www.baeldung.com/spring-security-create-new-custom-security-expression) with custom permission evaluator
 * [Custom annotation for security](http://blog.novoj.net/2012/03/27/combining-custom-annotations-for-securing-methods-with-spring-security/) Note that You can’t mix multiple annotations together – Spring will find only the first applicable annotation and uses this one.

#### Java version setup

There is no needs to specify maven-compiler-plugin with specific version just for defining Java version.
```
  <build>
    <plugins>
      <plugin>
        <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-compiler-plugin</artifactId>
        <version>3.6.1</version>
        <configuration>
          <source>1.8</source>
          <target>1.8</target>
        </configuration>
      </plugin>
    </plugins>
  </build>
```
Or you can do like this:
```
  <properties>
    <maven.compiler.source>1.8</maven.compiler.source>
    <maven.compiler.target>1.8</maven.compiler.target>
  </properties>
```
