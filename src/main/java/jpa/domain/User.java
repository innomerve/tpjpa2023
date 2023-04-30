package jpa.domain;
import com.sun.istack.NotNull;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import java.util.NoSuchElementException;

@Entity
public class User implements Serializable {
    private long id;
    private String name;
    private Set<Ticket> createdTickets=new HashSet<>();
    private Set<Discussion> discussions = new HashSet<>();
    private Set<Ticket> affectedTickets = new HashSet<>();

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
    public Set<Ticket> getCreatedTickets() {
        return createdTickets;
    }

    public void setCreatedTickets(Set<Ticket> tickets) {
        this.createdTickets = tickets;
    }
    @OneToMany (mappedBy = "author", cascade = CascadeType.PERSIST)
    public Set<Discussion> getDiscussions() {
        return discussions;
    }

    public void setDiscussions(Set<Discussion> discussions) {
        this.discussions = discussions;
    }

    @ManyToMany(mappedBy = "resolvers", fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    public Set<Ticket> getAffectedTickets() {
        return affectedTickets;
    }

    public void setAffectedTickets(Set<Ticket> affectedTickets) {
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

    public void addDiscussion(Discussion discussion){
        if(discussions.contains(discussion)) throw new NoSuchElementException("Discussion déja assigné à cet utilisateur");
        discussions.add(discussion);
    }
    public void removeDiscussion(Discussion discussion){
        if(!discussions.contains(discussion)) throw new NoSuchElementException("Discussion inexistante");
        discussions.remove(discussion);
    }
}
