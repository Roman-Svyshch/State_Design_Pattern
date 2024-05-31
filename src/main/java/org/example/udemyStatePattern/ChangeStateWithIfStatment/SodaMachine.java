package org.example.udemyStatePattern.ChangeStateWithIfStatment;

public class SodaMachine {

    final static int SOLD_OUT = 0;
    final static int NO_MONEY = 1;
    final static int HAS_MONEY =2;
    final static int SOLD = 3;

    int state = SOLD_OUT;
    int count = 0;

    public SodaMachine(int count) {
        this.count = count;

        if (count > 0 ){
            state = NO_MONEY;

            System.out.println("Welcome to our soda Vending Machine");
            System.out.println("inventory is " + count + "Sodas");
            System.out.println("Insert Dollar bil to get started");
        }
    }

    public void insertMoney(){
        if (state == HAS_MONEY){
            System.out.println("You can`t insert dollar bill");
        } else if (state == NO_MONEY) {
            state = HAS_MONEY;
            System.out.println("You insert a dollar");
        } else if (state == SOLD_OUT) {
            System.out.println("The machine is sold out");
        } else if (state == SOLD) {
            System.out.println("please waiting for your soda");
        }
    }
    public void ejectMoney(){
        if (state == HAS_MONEY){
            System.out.println("Returning dollar bill");
            state = NO_MONEY;
        } else if (state == NO_MONEY) {
            System.out.println("you haven`t inserted a dollar bill");
        } else if (state ==SOLD) {
            System.out.println("already selected soda");
        } else if (state == SOLD_OUT) {
            System.out.println("Machine Sold out");
        }
    }
    public void selectSoda(){
        if (state == SOLD){
            System.out.println("Dispensing your Soda as we speak ...");
        } else if (state == NO_MONEY) {
            System.out.println("you selected soda but money first baby");
        } else if (state == SOLD_OUT) {
            System.out.println("You`re outta luck - no sodas left");
        } else if (state == HAS_MONEY) {
            System.out.println("you selected a soda");
            state = SOLD;
            dispense();

        }
    }

    public void dispense(){
        if (state == SOLD){
            System.out.println("Dispensing your soda enjoy");
            count = count - 1;
            if (count == 0 ){
                System.out.println("Sorry  out of sodas");
                state = SOLD_OUT;
            }
        } else if (state == NO_MONEY) {
            System.out.println("you haven`t inserted a dollar bill");
        } else if (state ==HAS_MONEY) {
            System.out.println(" no soda dispensed");
        } else if (state == SOLD_OUT) {
            System.out.println("Machine Sold out");
        }
    }

}
