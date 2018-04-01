package zealot.springframework.dependencyinjection.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import zealot.springframework.dependencyinjection.services.GreetingService;

@Controller
public class ConstructorInjectedController {

    // best way to create Dependency Injection

    private GreetingService greetingService;

    public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService){
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayHello();
    }
}
