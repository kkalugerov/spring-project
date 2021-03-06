package zealot.springframework.dependencyinjection.controllers;

import org.junit.Before;
import org.junit.Test;
import zealot.springframework.dependencyinjection.services.GreetingServiceImpl;

import static org.junit.Assert.assertEquals;


public class ConstructorInjectedControllerTest {
    private ConstructorInjectedController constructorInjectedController;

    @Before
    public void setUp(){
        this.constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting(){
        assertEquals(GreetingServiceImpl.SAY_HELLO,constructorInjectedController.sayHello());
    }
}
