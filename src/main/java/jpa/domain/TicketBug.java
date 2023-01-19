package jpa.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Bug")
public class TicketBug extends Ticket{
    long idBug;

    public long getIdBug() {
        return idBug;
    }

    public void setIdBug(long idBug) {
        this.idBug = idBug;
    }
}
