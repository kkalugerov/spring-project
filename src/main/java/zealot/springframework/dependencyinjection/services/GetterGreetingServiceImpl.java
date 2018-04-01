package zealot.springframework.dependencyinjection.services;

import org.springframework.stereotype.Service;

@Service
public class GetterGreetingServiceImpl implements GreetingService {

    @Override
    public String sayHello() {
        return "Hello I was injected by the GetterGreetingService !";
    }
}
