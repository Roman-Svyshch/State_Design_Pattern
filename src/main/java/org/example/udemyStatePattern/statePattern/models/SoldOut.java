package org.example.udemyStatePattern.statePattern.models;

public class SoldOut implements State{
    SodaMachine sodaMachine;

    public SoldOut(SodaMachine sodaMachine) {
        this.sodaMachine = sodaMachine;
    }

    @Override
    public void insertMoney() {
        System.out.println("Machine sold out");
    }

    @Override
    public void ejectMoney() {
        System.out.println("insert money first before injecting");
    }

    @Override
    public void select() {
        System.out.println("no available soda");
    }

    @Override
    public void dispense() {
        System.out.println("sold out");
    }

    @Override
    public String toString() {
        return "sold out";
    }
}
