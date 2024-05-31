package org.example.ticketMachine.models;

import org.example.ticketMachine.context.TicketMachineContext;
import org.example.ticketMachine.stateInteface.State;

public class CoinInsertedState implements State {
    @Override
    public void insertCoin(TicketMachineContext ticketMachine) {
        System.out.println("Coin already inserted . Press the button to get ticket.");
    }

    @Override
    public void pressButton(TicketMachineContext ticketMachine) {
        System.out.println("Button pressed . Dispensing a ticket");
        ticketMachine.setState(new DispensingTicketState());
        ticketMachine.dispenseTicket();

    }

    @Override
    public void dispenseTicket(TicketMachineContext ticketMachine) {
        System.out.println("Press button to dispense the ticket");
    }
}
