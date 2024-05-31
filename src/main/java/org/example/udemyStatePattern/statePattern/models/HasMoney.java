package org.example.udemyStatePattern.statePattern.models;

public class HasMoney implements State{

    SodaMachine sodaMachine;

    public HasMoney(SodaMachine sodaMachine) {
        this.sodaMachine = sodaMachine;
    }

    @Override
    public void insertMoney() {
        System.out.println("No need to insert another bill ");
        sodaMachine.setState(sodaMachine.getHasMoney());
    }

    @Override
    public void ejectMoney() {
        System.out.println("returning your dollar ");
        sodaMachine.setState(sodaMachine.getNoMoney());
    }

    @Override
    public void select() {
        System.out.println("select item ...");
        sodaMachine.setState(sodaMachine.getSoldState());
    }

    @Override
    public void dispense() {
        System.out.println("No soda dispensed");
    }

    @Override
    public String toString() {
        return "waiting to a new selection";
    }
}
