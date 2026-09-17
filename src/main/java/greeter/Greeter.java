package greeter;

public class Greeter {

    private final GreetingStrategy greetingStrategy;

    public Greeter() {
        this(new DefaultGreeting());
    }

    public Greeter(GreetingStrategy greetingStrategy) {
        this.greetingStrategy = greetingStrategy;
    }

    public String greet() {
        return greetingStrategy.greet();
    }
}