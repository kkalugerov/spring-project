package zealot.springframework.dependencyinjection.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import zealot.springframework.dependencyinjection.services.GreetingService;

@Controller
public class PropertyInjectedController {

    // this is not the right way to create Dependency Injection

    @Autowired
    @Qualifier("greetingServiceImpl")
    public GreetingService greetingServiceImpl;

    public String sayHello(){

        return greetingServiceImpl.sayHello();
    }

}
