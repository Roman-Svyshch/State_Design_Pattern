package org.example.ticketMachine;

import org.example.ticketMachine.context.TicketMachineContext;

public class Main {
    public static void main(String[] args) {
        TicketMachineContext machine = new TicketMachineContext();

        machine.insertCoin(); // Coin inserted. You can now press the button.
        machine.pressButton(); // Button pressed. Dispensing ticket...
        // Ticket dispensed. Thank you!
        System.out.println("here");
        machine.pressButton(); // No coin inserted. Please insert a coin first.
        machine.insertCoin(); // Coin inserted. You can now press the button.
        machine.insertCoin(); // Coin already inserted. Press the button to get a ticket.
        machine.pressButton(); // Button pressed. Dispensing ticket...
        // Ticket dispensed. Thank you!
    }
}
