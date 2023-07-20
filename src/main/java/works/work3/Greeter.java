package works.work3;

public class Greeter {
    public String greeting;
    private String formality;
    private GreetType greetType;
    private String defaultFormality="Hello.";

    public Greeter(String formality) {
        greetType = new GreetType();
        this.formality = formality;
        this.greeting = greetType.getValue(defaultFormality);
    }

    public void setFormality(String newFormality) {
        this.formality = newFormality;
    }

    public String getGreeting(String formality) {
        this.greeting = greetType.hasValue(formality) ? greetType.getValue(formality) : greetType.getValue(defaultFormality);
        return greeting;
    }
}