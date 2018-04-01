package zealot.springframework.dependencyinjection.controllers;

import org.junit.Before;
import org.junit.Test;
import zealot.springframework.dependencyinjection.services.GreetingServiceImpl;

import static org.junit.Assert.assertEquals;


public class SetterInjectedControllerTest {

    private GetterInjectedController setterInjectedController;

    @Before
    public void setUp(){
        this.setterInjectedController = new GetterInjectedController();
        this.setterInjectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting(){
        assertEquals(GreetingServiceImpl.SAY_HELLO,setterInjectedController.sayHello());
    }
}
