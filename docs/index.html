# Commentary on Example 1

## Synopsis
The purpose of the example is to show the bare bones invocation of a JUnit test
from the command line and then provide a detailed commentary on the elementary
steps in the JUnit testing process.


In this example we have a Java source file which contains a SUT, a system
under test, and an accompanying JUnit 4 test.


## The System Under Test
The first step is to create the SUT - in this simple example I will create and
execute all commands from a bash shell:


```shell
$ vim helloWorld.java
...
$
```

Where vim is a well known text-editor which is invoked with a single argument
which the name of the Java source code.

helloworld.java is the SUT element in this testing example and is very simple in
its behaviour:

```java
import java.io.*;


public class helloWorld{

    private String name;

	public String sayHello(){
		return("Hello");
	}

	public String sayGoodbye(){
		return ("Goodbye");
	}

    public String sayName(String name){
        this.name = name;
        return name;
    }
}
```

Once we have written the source for the SUT, we then compile the source and create an executable class
file:
```bash
$ javac helloWorld.java
```

## The Junit Test Code

Having created the SUT, we now create a Junit test called helloWorldUnitTest:
```bash
$ vim helloWorldUnitTest.java
...
$
```

Which consists of the following code:
```java
import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;

public class helloWorldUnitTest{

    @Test
    public void testSayHello(){
        helloWorld helloTest = new helloWorld();
        assertEquals("Hello", helloTest.sayHello());
    }

    @Test
    public void testSayGoodbye(){
        helloWorld helloTest = new helloWorld();
        assertEquals("Goodbye", helloTest.sayGoodbye());
    }

    @Test
    public void testSayName(){
        String name = "Chester";
        helloWorld helloTest = new helloWorld();
        assertEquals(name, helloTest.sayName(name));
    }
}
```
This code consists of three tests all of which invoke the Junit test method
assertEquals which in this case tests the two parameters for equality.

We then compile the Junit test code:
```bash
$ javac -cp .:/usr/share/java/junit4.jar  helloWorldUnitTest.java
```
Noting the use of the -cp or classpath flag to locate the Junit jar file for the
compliler.


## Running the test from the command line

We invoke the Junit test.
```shell
java -cp .:/usr/share/java/junit4.jar org.junit.runner.JUnitCore  helloWorldUnitTest
JUnit version 4.12
...
Time: 0.003

OK (3 tests)
```

Again, note the use of the classpath to specify the location of the Junit jar file
in the local file-system. We should also note the invocation of the
org.junit.runner.JUnitCore class as the second argument to the java vm - this is
the Junit class responsible for running tests.

In this instance the SUT passed all three tests.

## The SUT Fails...
For the sake of completeness we make a minor alteration to the helloWorld class
to make it fail one of the unit tests:

```java
    public String sayGoodbye(){
		return ("goodbye");
	}
```
We then repeat the process above:
    1. Recompile helloWorld.java,
    2. And then rerun the JUnit test.

We observe the output:
```bash
$ java -cp .:/usr/share/java/junit4.jar org.junit.runner.JUnitCore  helloWorldUnitTest
JUnit version 4.12
..E.
Time: 0.004
There was 1 failure:
1) testSayGoodbye(helloWorldUnitTest)
org.junit.ComparisonFailure: expected:<[G]oodbye> but was:<[g]oodbye>
	at org.junit.Assert.assertEquals(Assert.java:115)
	at org.junit.Assert.assertEquals(Assert.java:144)
	at helloWorldUnitTest.testSayGoodbye(helloWorldUnitTest.java:16)
    ...
FAILURES!!!
Tests run: 3,  Failures: 1
$
```
