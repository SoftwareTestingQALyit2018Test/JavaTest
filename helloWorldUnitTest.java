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
