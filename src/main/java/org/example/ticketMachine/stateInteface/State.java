package org.example.ticketMachine.stateInteface;

import org.example.ticketMachine.context.TicketMachineContext;

public interface State {
    void insertCoin(TicketMachineContext ticketMachine);
    void pressButton(TicketMachineContext ticketMachine);
    void dispenseTicket(TicketMachineContext ticketMachine);
}
