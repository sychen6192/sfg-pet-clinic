package guru.springframework.sfgdi.services;


public class PrimaryGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hello world - from PRIMARY BEAN!";
    }
}
