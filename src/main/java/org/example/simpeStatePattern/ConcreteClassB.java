package org.example.simpeStatePattern;

public class ConcreteClassB implements State{
    @Override
    public void handleRequest() {
        System.out.println("Concrete state B handling request ");
    }
}
