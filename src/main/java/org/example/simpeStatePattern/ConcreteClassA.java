package org.example.simpeStatePattern;

public class ConcreteClassA implements State{
    @Override
    public void handleRequest() {
        System.out.println("Concrete state A handling request ");
    }
}
