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

