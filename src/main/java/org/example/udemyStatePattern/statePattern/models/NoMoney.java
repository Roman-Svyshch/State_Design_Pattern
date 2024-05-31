package org.example.udemyStatePattern.statePattern.models;

public class NoMoney implements State{

    SodaMachine sodaMachine;

    public NoMoney(SodaMachine sodaMachine) {
        this.sodaMachine = sodaMachine;
    }

    @Override
    public void insertMoney() {
        System.out.println("You inserted a dollar");
        sodaMachine.setState(sodaMachine.getHasMoney());
    }

    @Override
    public void ejectMoney() {
        System.out.println("You haven`t inserted a dollar ");

    }

    @Override
    public void select() {
        System.out.println("you selected but there is no money");
    }

    @Override
    public void dispense() {
        System.out.println("pay me first");
    }

    @Override
    public String toString() {
        return "Waiting for a dollar ...";
    }
}
