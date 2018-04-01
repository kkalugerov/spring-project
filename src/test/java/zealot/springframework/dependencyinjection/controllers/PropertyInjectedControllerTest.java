package zealot.springframework.dependencyinjection.controllers;

import org.junit.Before;
import org.junit.Test;
import zealot.springframework.dependencyinjection.services.GreetingServiceImpl;

import static org.junit.Assert.assertEquals;

public class PropertyInjectedControllerTest {

    private PropertyInjectedController propertyInjectedController;

    @Before
    public void setUp(){
        this.propertyInjectedController = new PropertyInjectedController();
        this.propertyInjectedController.greetingServiceImpl = new GreetingServiceImpl();

    }

    @Test
    public void testGreeting(){
        assertEquals(GreetingServiceImpl.SAY_HELLO, propertyInjectedController.sayHello());
    }
}
