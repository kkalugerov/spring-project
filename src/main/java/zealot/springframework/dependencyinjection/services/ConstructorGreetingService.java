package zealot.springframework.dependencyinjection.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService {

    @Override
    public String sayHello() {
        return "Hello I was injected via the ConstructorGreetingService ! ";
    }
}
