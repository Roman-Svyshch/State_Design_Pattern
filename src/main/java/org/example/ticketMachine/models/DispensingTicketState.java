package org.example.ticketMachine.models;

import org.example.ticketMachine.context.TicketMachineContext;
import org.example.ticketMachine.stateInteface.State;

public class DispensingTicketState implements State {
    @Override
    public void insertCoin(TicketMachineContext ticketMachine) {
        System.out.println("Dispensing Ticket please wait");
    }

    @Override
    public void pressButton(TicketMachineContext ticketMachine) {
        System.out.println("Dispensing Ticket please wait");
    }

    @Override
    public void dispenseTicket(TicketMachineContext ticketMachine) {
        System.out.println("Ticked dispensed. thank you");
        ticketMachine.setState(new IdleState());
    }
}
