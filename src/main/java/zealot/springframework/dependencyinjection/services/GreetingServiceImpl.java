package zealot.springframework.dependencyinjection.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    public static final String SAY_HELLO = "Hello this is GreetingServiceImpl(Property) !";

    @Override
    public String sayHello() {
        return SAY_HELLO;
    }
}
