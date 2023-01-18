package jpa.dao;

import java.util.List;

import jpa.EntityManagerHelper;
import jpa.domain.Ticket;

public class TicketDao extends AbstractJpaDao <Long, Ticket> {

    public TicketDao()
    {
        super(Ticket.class);
    }
}