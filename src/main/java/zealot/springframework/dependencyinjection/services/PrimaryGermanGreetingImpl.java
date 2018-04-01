package zealot.springframework.dependencyinjection.services;

import zealot.springframework.dependencyinjection.repositories.GreetingRepository;

//@Service
//@Primary
//@Profile("de")
public class PrimaryGermanGreetingImpl implements GreetingService {


    private GreetingRepository greetingRepository;

    public PrimaryGermanGreetingImpl(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayHello() {
        return greetingRepository.getGermanGreeting();
    }
}
