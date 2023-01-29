package jpa.domain;
import com.sun.istack.NotNull;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@Entity
public class User implements Serializable {
    private long id;
    private String name;
    private List<Ticket> createdTickets=new ArrayList<>();
    private List<Discussion> discussions = new ArrayList<>();
    private List<Ticket> affectedTickets = new ArrayList<>();

    @Id
    @GeneratedValue
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    @NotNull
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToMany (mappedBy = "author", cascade = CascadeType.PERSIST)
    public List<Ticket> getCreatedTickets() {
        return createdTickets;
    }

    public void setCreatedTickets(List<Ticket> tickets) {
        this.createdTickets = tickets;
    }
    @OneToMany (mappedBy = "author", cascade = CascadeType.PERSIST)
    public List<Discussion> getDiscussions() {
        return discussions;
    }

    public void setDiscussions(List<Discussion> discussions) {
        this.discussions = discussions;
    }

    @ManyToMany(cascade = CascadeType.PERSIST)
    public List<Ticket> getAffectedTickets() {
        return affectedTickets;
    }

    public void setAffectedTickets(List<Ticket> affectedTickets) {
        this.affectedTickets = affectedTickets;
    }


    public void addCreatedTicket(Ticket ticket){
        if(createdTickets.contains(ticket)) throw new NoSuchElementException("Ticket déja créé");
        createdTickets.add(ticket);
    }
    public void removeCreatedTicket(Ticket ticket){
        if(!createdTickets.contains(ticket)) throw new NoSuchElementException("Ticket inexistant");
        createdTickets.remove(ticket);
    }

    public void addAffectedTicket(Ticket ticket){
        if(affectedTickets.contains(ticket)) throw new NoSuchElementException("Ticket déja assigné à cet utilisateur");
        affectedTickets.add(ticket);
    }
    public void removeAffectedTicket(Ticket ticket){
        if(!affectedTickets.contains(ticket)) throw new NoSuchElementException("Ticket  inexistant");
        affectedTickets.remove(ticket);
    }

    public void addDiscussion(Discussion discussion){
        if(discussions.contains(discussion)) throw new NoSuchElementException("Discussion déja assigné à cet utilisateur");
        discussions.add(discussion);
    }
    public void removeDiscussion(Discussion discussion){
        if(!discussions.contains(discussion)) throw new NoSuchElementException("Discussion inexistante");
        discussions.remove(discussion);
    }
}
