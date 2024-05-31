package org.example.udemyStatePattern.statePattern.models;

public class SoldState implements State{

    SodaMachine sodaMachine;

    public SoldState(SodaMachine sodaMachine) {
        this.sodaMachine = sodaMachine;
    }

    @Override
    public void insertMoney() {
        System.out.println("give a second soda coming right up");
    }

    @Override
    public void ejectMoney() {
        System.out.println("sorry soda is coming ...");
    }

    @Override
    public void select() {
        System.out.println("Nope ... you cant eject the money ");
    }

    @Override
    public void dispense() {
        System.out.println("stop trying to get soda for free");
        if (sodaMachine.getCount() > 0 ){
            sodaMachine.setState(sodaMachine.getNoMoney());
        }else {
            System.out.println("Sorry out of sodas");
            sodaMachine.setState(sodaMachine.soldOut);
        }
    }

    @Override
    public String toString() {
        return "Dispensing soda ...";
    }
}
