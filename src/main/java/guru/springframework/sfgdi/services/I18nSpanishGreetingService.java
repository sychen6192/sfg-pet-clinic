package guru.springframework.sfgdi.services;

public class I18nSpanishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello From - ES";
    }
}
