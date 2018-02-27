# Commentary on Example 1

## Synopsis 
The purpose of the example is to show the bare bones invocation of a JUnit test
from the command line and then provide a detailed commentary on the elementary
steps in the JUnit testing process.


In this example we have a Java source file which contains a SUT, a system
under test, and an accompanying JUnit 4 test.

The first step is to create the SUT - in this simple example I will create and
execute all commands from a bash shell:
```shell
$ vim helloWorld.java
...
$
```
Which consists of the following code:
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


