package TicketFolder.domain.Model;

import TicketFolder.domain.valueObject.*;

public class Ticket {

    private final TicketId ticketId;
    private final UserId userId;
    //folder id
    private TicketName ticketName;
    private TicketImagePath ticketImagePath;
    private TicketStore ticketStore;
    private TicketProduct ticketProduct;
    private TicketDate ticketDate;
    private TicketCode ticketCode;

    public Ticket(TicketId ticketId, UserId userId, TicketName ticketName, TicketProduct ticketProduct, TicketStore ticketStore, TicketImagePath ticketImagePath, TicketCode ticketCode, TicketDate ticketDate) {
        this.ticketId = ticketId;
        this.userId = userId;
        this.ticketName = ticketName;
        this.ticketProduct = ticketProduct;
        this.ticketStore = ticketStore;
        this.ticketImagePath = ticketImagePath;
        this.ticketCode = ticketCode;
        this.ticketDate = ticketDate;
    }
}
