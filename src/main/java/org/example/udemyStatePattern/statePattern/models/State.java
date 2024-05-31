package org.example.udemyStatePattern.statePattern.models;

public interface State {
     void insertMoney();
     void ejectMoney();
     void select();
     void dispense();
}
