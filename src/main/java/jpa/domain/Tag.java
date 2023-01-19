package jpa.domain;
import com.sun.istack.NotNull;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@Entity
public class Tag implements Serializable {

    private Long id;
    private String label="";
    private List<Ticket> tickets = new ArrayList<>();

    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @NotNull
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
    @ManyToMany
    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }

    public void addTicket(Ticket ticket){
        if(tickets.contains(ticket)) throw new NoSuchElementException("Ticket déja assigné à ce tag");
        tickets.add(ticket);
    }
    public void removeTicket(Ticket ticket){
        if(!tickets.contains(ticket)) throw new NoSuchElementException("Ticket  inexistant");
        tickets.remove(ticket);
    }
}
