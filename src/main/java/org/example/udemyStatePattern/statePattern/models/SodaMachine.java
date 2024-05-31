package org.example.udemyStatePattern.statePattern.models;

public class SodaMachine {
    HasMoney hasMoney;
    NoMoney noMoney;
    SoldOut soldOut;
    SoldState soldState;

    State state = soldOut;
    int count = 0;

    public SodaMachine(int numberOfSodas) {
        soldOut = new SoldOut(this);
        noMoney = new NoMoney(this);
        hasMoney = new HasMoney(this);
        soldState = new SoldState(this);
        this.count = numberOfSodas;

        if (numberOfSodas > 0){
            state = noMoney;
        }
    }


    public void insertMoney(){
       state.insertMoney();
    }
    public void ejectMoney(){
       state.ejectMoney();
    }
    public void selectSoda(){
       state.select();
    }

    public void dispense(){
      state.dispense();
    }

    int getCount (){
        return count;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public HasMoney getHasMoney() {
        return hasMoney;
    }

    public void setHasMoney(HasMoney hasMoney) {
        this.hasMoney = hasMoney;
    }

    public NoMoney getNoMoney() {
        return noMoney;
    }

    public void setNoMoney(NoMoney noMoney) {
        this.noMoney = noMoney;
    }

    public SoldOut getSoldOut() {
        return soldOut;
    }

    public void setSoldOut(SoldOut soldOut) {
        this.soldOut = soldOut;
    }

    public SoldState getSoldState() {
        return soldState;
    }

    public void setSoldState(SoldState soldState) {
        this.soldState = soldState;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
