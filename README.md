<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <packaging>maven-plugin</packaging>

    <groupId>bnp.cardiffpinnacle.automation.development</groupId>
    <artifactId>cardiffpinnacle-automation</artifactId>
    <version>1.0-SNAPSHOT</version>
    <properties>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
        <maven.compiler.target>1.8</maven.compiler.target>
        <maven.compiler.source>1.8</maven.compiler.source>
    </properties>
    <build>
        <!-- Source directory configuration -->
        <sourceDirectory>src\test\java</sourceDirectory>
        <plugins>
            <!-- Compiler plugin configures the java version to be used for compiling the code -->
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-compiler-plugin</artifactId>
                <goals>
                    <goal>generate</goal>
                </goals>
                <version>3.7.0</version>
                <configuration>
                    <source>1.8</source>
                    <target>1.8</target>
                    <suiteXmlFiles>
                        <testFailureIgnore>true</testFailureIgnore>
                        <suiteXmlFile>testng.xml</suiteXmlFile>
                        <suiteXmlFile>testng.xml</suiteXmlFile>
                    </suiteXmlFiles>
                </configuration>

                <executions>
                    <execution>
                        <id>verify</id>
                        <configuration>
                            <projectName>Pet Insurance Login and Register</projectName>
                            <outputDirectory>${project.build.directory}/cucumber-JVM-reports</outputDirectory>
                            <cucumberOutput>${project.build.directory}/cucumber.json</cucumberOutput>
                            <skippedFails>true</skippedFails>
                            <enableFlashCharts>true</enableFlashCharts>
                            <buildNumber>1</buildNumber>
                        </configuration>
                    </execution>
                </executions>
            </plugin>
            <plugin>
                <!-- https://mvnrepository.com/artifact/org.apache.maven.plugins/maven-site-plugin -->
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-site-plugin</artifactId>
                <version>3.7.1</version>
            </plugin>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-deploy-plugin</artifactId>
                <version>3.0.0-M1</version>
            </plugin>
        </plugins>
    </build>

    <!--=============================================================================================================================-->
    <!--                                                Selenium Dependencies-->
    <!--=============================================================================================================================-->
    <dependencies>

        <!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
        <dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-java</artifactId>
            <version>3.141.59</version>
        </dependency>

        <!--=============================================================================================================================-->
        <!--                                                Cucumber Dependencies-->
        <!--=============================================================================================================================-->
        <!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-picocontainer -->
        <dependency>
            <groupId>io.cucumber</groupId>
            <artifactId>cucumber-picocontainer</artifactId>
            <version>3.0.2</version>
            <scope>test</scope>
        </dependency>

        <!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-jvm -->
        <dependency>
            <groupId>io.cucumber</groupId>
            <artifactId>cucumber-jvm</artifactId>
            <version>4.3.0</version>
            <type>pom</type>
        </dependency>

        <dependency>
            <groupId>io.cucumber</groupId>
            <artifactId>cucumber-testng</artifactId>
            <version>4.3.0</version>
            <scope>compile</scope>
        </dependency>

        <dependency>
            <groupId>io.cucumber</groupId>
            <artifactId>cucumber-java</artifactId>
            <version>4.3.0</version>
            <scope>compile</scope>
        </dependency>


        <!--=============================================================================================================================-->
        <!--                                                Log4j Dependencies-->
        <!--=============================================================================================================================-->

        <!-- https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-core -->
        <dependency>
            <groupId>org.apache.logging.log4j</groupId>
            <artifactId>log4j-core</artifactId>
            <version>2.11.1</version>
        </dependency>

        <!--=============================================================================================================================-->
        <!--                                                Extent Report  Dependencies-->
        <!--=============================================================================================================================-->
        <!-- https://mvnrepository.com/artifact/com.aventstack/extentreports -->
        <dependency>
            <groupId>com.aventstack</groupId>
            <artifactId>extentreports</artifactId>
            <version>4.0.9</version>
        </dependency>

        <!--=============================================================================================================================-->
        <!--                                                TestNg  Dependencies-->
        <!--=============================================================================================================================-->

        <dependency>
            <groupId>org.testng</groupId>
            <artifactId>testng</artifactId>
            <version>6.9.13.6</version>
            <scope>compile</scope>
        </dependency>

        <dependency>
            <groupId>net.masterthought</groupId>
            <artifactId>cucumber-reporting</artifactId>
            <version>4.5.1</version>
        </dependency>

    </dependencies>

</project>
BEFORE MODIFICATION

<groupId>bnp.cardiffpinnacle.automation.development</groupId>
<artifactId>cardiffpinnacle-automation</artifactId>
<version>1.0-SNAPSHOT</version>
<properties>
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    <maven.compiler.target>1.8</maven.compiler.target>
    <maven.compiler.source>1.8</maven.compiler.source>
</properties>
<build>
    <!-- Source directory configuration -->
    <sourceDirectory>src\test\java</sourceDirectory>
    <plugins>
        <!-- Following plugin executes the testng tests -->
        <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-surefire-plugin</artifactId>
            <version>3.0.0-M3</version>
            <configuration>
                <testFailureIgnore>true</testFailureIgnore>

                <!-- Suite testng xml file to consider for test execution -->
                <suiteXmlFiles>
                    <suiteXmlFile>testng.xml</suiteXmlFile>
                    <suiteXmlFile>testng.xml</suiteXmlFile>
                </suiteXmlFiles>
            </configuration>
        </plugin>
        <!-- Compiler plugin configures the java version to be used for compiling
            the code -->
        <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-compiler-plugin</artifactId>
            <configuration>
                <source>1.8</source>
                <target>1.8</target>
            </configuration>
        </plugin>
        <plugin>
            <groupId>net.masterthought</groupId>
            <artifactId>cucumber-reporting</artifactId>
            <version>4.5.1</version>
            <executions>
                <execution>
                    <id>verify</id>
                    <goals>
                        <goal>generate</goal>
                    </goals>
                    <configuration>
                        <projectName>Pet Insurance Login and Register</projectName>
                        <outputDirectory>${project.build.directory}/cucumber-JVM-reports</outputDirectory>
                        <cucumberOutput>${project.build.directory}/cucumber.json</cucumberOutput>
                        <skippedFails>true</skippedFails>
                        <enableFlashCharts>true</enableFlashCharts>
                        <buildNumber>1</buildNumber>
                    </configuration>

                </execution>
            </executions>
        </plugin>
        <plugin>
            <!-- https://mvnrepository.com/artifact/org.apache.maven.plugins/maven-site-plugin -->
            <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-site-plugin</artifactId>
                <version>3.7.1</version>
        </plugin>
        <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-deploy-plugin</artifactId>
            <version>3.0.0-M1</version>
        </plugin>
    </plugins>
</build>    <dependencies>

    <!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
    <dependency>
        <groupId>org.seleniumhq.selenium</groupId>
        <artifactId>selenium-java</artifactId>
        <version>3.141.59</version>
    </dependency>        <!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-picocontainer -->
    <dependency>
        <groupId>io.cucumber</groupId>
        <artifactId>cucumber-picocontainer</artifactId>
        <version>3.0.2</version>
        <scope>test</scope>
    </dependency>

    <!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-jvm -->
    <dependency>
        <groupId>io.cucumber</groupId>
        <artifactId>cucumber-jvm</artifactId>
        <version>4.3.0</version>
        <type>pom</type>
    </dependency>

    <dependency>
        <groupId>io.cucumber</groupId>
        <artifactId>cucumber-testng</artifactId>
        <version>4.3.0</version>
        <scope>compile</scope>
    </dependency>

    <dependency>
        <groupId>io.cucumber</groupId>
        <artifactId>cucumber-java</artifactId>
        <version>4.3.0</version>
        <scope>compile</scope>
    </dependency><!-- https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-core -->
    <dependency>
        <groupId>org.apache.logging.log4j</groupId>
        <artifactId>log4j-core</artifactId>
        <version>2.11.1</version>
    </dependency>        <!-- https://mvnrepository.com/artifact/com.aventstack/extentreports -->
    <dependency>
        <groupId>com.aventstack</groupId>
        <artifactId>extentreports</artifactId>
        <version>4.0.9</version>
    </dependency>

    <dependency>
        <groupId>org.testng</groupId>
        <artifactId>testng</artifactId>
        <version>6.9.13.6</version>
        <scope>compile</scope>
    </dependency>
</dependencies>
