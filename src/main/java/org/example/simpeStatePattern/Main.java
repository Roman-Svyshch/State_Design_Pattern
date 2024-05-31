package org.example.simpeStatePattern;

public class Main {
    public static void main(String[] args) {
        Context context = new Context(new ConcreteClassA());
        context.request();
        context.setCurrentState(new ConcreteClassB());
        context.request();
    }
}
