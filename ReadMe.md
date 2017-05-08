# Spring-Boot Project Template

## Environment

[STS plugin for Eclipse or Eclipse](https://spring.io/tools/sts/all)

## Examples

 * [Controller examples](http://spring.io/guides/tutorials/bookmarks/)

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
