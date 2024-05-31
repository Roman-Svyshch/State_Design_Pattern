package org.example.simpeStatePattern;

public class Context {
    private State currentState;

    public Context(State currentState) {
        this.currentState = currentState;
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }
    public void request(){
        currentState.handleRequest();
    }
}
