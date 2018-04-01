package zealot.springframework.dependencyinjection.services;

import zealot.springframework.dependencyinjection.repositories.GreetingRepository;

//@Service
//@Primary // if we have more than one bean(service) use this one as primary if there is no Qualifier selected
//@Profile({"en", "default"}) // if we don't specified in props file which profile we are going to use the default is en
public class PrimaryGreetingServiceImpl implements GreetingService {

    private GreetingRepository greetingRepository;

    public PrimaryGreetingServiceImpl(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayHello() {
        return greetingRepository.getEnglishGreeting();
    }
}
