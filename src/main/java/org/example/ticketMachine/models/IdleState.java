package org.example.ticketMachine.models;

import org.example.ticketMachine.context.TicketMachineContext;
import org.example.ticketMachine.stateInteface.State;

public class IdleState implements State {
    @Override
    public void insertCoin(TicketMachineContext ticketMachine) {
        System.out.println("Coin inserted you can press button");
        ticketMachine.setState(new CoinInsertedState());
    }

    @Override
    public void pressButton(TicketMachineContext ticketMachine) {
        System.out.println("No coin inserted . please insert a coin first");
    }

    @Override
    public void dispenseTicket(TicketMachineContext ticketMachine) {
        System.out.println("no coin inserted .");
    }
}
