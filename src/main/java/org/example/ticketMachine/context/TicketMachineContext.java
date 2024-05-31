package org.example.ticketMachine.context;

import org.example.ticketMachine.models.IdleState;
import org.example.ticketMachine.stateInteface.State;

public class TicketMachineContext {
    private State state;

    public TicketMachineContext() {
        state = new IdleState();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void insertCoin(){
        state.insertCoin(this);
    }
    public void pressButton(){
        state.pressButton(this);
    }
    public void dispenseTicket(){
        state.dispenseTicket(this);
    }
}
