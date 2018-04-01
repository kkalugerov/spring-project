package zealot.springframework.dependencyinjection.services;

import zealot.springframework.dependencyinjection.repositories.GreetingRepository;

public class GreetingServiceFactory {

    private GreetingRepository greetingRepository;

    public GreetingServiceFactory(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public GreetingService createGreetingService(String lang) {

        switch (lang){
            case "en":
                return new PrimaryGreetingServiceImpl(greetingRepository);
            case "de":
                return new PrimaryGermanGreetingImpl(greetingRepository);
            case "es":
                return new PrimarySpanishGreetingServiceImpl(greetingRepository);
            default:
                return new PrimaryGreetingServiceImpl(greetingRepository);
        }

    }
}
