import org.junit.Test;

import static org.junit.Assert.*;

public class HelloWorldTest {
    @Test
    public void sayHi_should_return_Hello_World(){
        HelloWorld h = new HelloWorld();
        String result = h.sayHi("Hello World");
        assertEquals("Hello World", result);

    }
    @Test
    public void sayHi_with_simkiat_should_return_Hello_somkiat(){
        HelloWorld h = new HelloWorld();
        String result = h.sayHi("Somkiat");
        assertEquals("Hello Somkiat", result);

    }
    @Test
    public void sayHi_with_pui_should_return_Hello_pui(){
        HelloWorld h = new HelloWorld();
        String result = h.sayHi("pui");
        assertEquals("Hello Pui", result);

    }

    public void yyyy(){

    }

}