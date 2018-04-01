package zealot.springframework.dependencyinjection.controllers;

import org.springframework.stereotype.Controller;
import zealot.springframework.dependencyinjection.services.GreetingService;
import zealot.springframework.dependencyinjection.services.GreetingServiceImpl;

@Controller
public class MyController {

    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello(){
//        System.out.println("Hello !");
        return greetingService.sayHello( );
    }
}
