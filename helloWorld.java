import java.io.*;


public class helloWorld{

    private String name;

	public String sayHello(){
		return("Hello");
	}

	public String sayGoodbye(){
		return ("goodbye");
	}

    public String sayName(String name){
        this.name = name;
        return name;
    }
}
