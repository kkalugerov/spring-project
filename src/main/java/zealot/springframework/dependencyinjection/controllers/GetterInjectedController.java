package zealot.springframework.dependencyinjection.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import zealot.springframework.dependencyinjection.services.GreetingService;

@Controller
public class GetterInjectedController {


    private GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayHello();
    }

    @Autowired
    @Qualifier("getterGreetingServiceImpl")// give a hint to spring framework witch service(bean) to use
    public void setGreetingService(GreetingService greetingService){
        this.greetingService = greetingService;
    }
}
