package zealot.springframework.dependencyinjection.services;


import zealot.springframework.dependencyinjection.repositories.GreetingRepository;

//@Service
//@Profile("es") //with property in application.properties we can choose which primary service to use
//@Primary
public class PrimarySpanishGreetingServiceImpl implements GreetingService {

    private GreetingRepository greetingRepository;

    public PrimarySpanishGreetingServiceImpl(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayHello() {
        return greetingRepository.getSpanishGreeting();
    }
}
