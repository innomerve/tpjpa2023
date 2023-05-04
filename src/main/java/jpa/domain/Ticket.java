package jpa.domain;
import com.sun.istack.NotNull;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;
import java.util.NoSuchElementException;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="DTYPE",discriminatorType=DiscriminatorType.STRING)
@DiscriminatorValue("General")
public class Ticket implements Serializable {
    private long id;
    private String title;
    private String content;
    private LocalDateTime createdAt;
    private LocalDateTime closedAt;
    private User author;

    private Set<User> resolvers =new HashSet<>();
    private Set<Discussion> discussions = new HashSet<>();
    private Set<Tag> tags = new HashSet<>();

    @Id
    @GeneratedValue
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    @NotNull
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    @NotNull
    @Lob
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getClosedAt() {
        return closedAt;
    }

    public void setClosedAt(LocalDateTime closeAt) {
        this.closedAt = closeAt;
    }
    @ManyToOne
    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }
    @OneToMany (mappedBy = "ticket", fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    public Set<Discussion> getDiscussions() {
        return discussions;
    }

    public void setDiscussions(Set<Discussion> discussions) {
        this.discussions = discussions;
    }

    @ManyToMany (fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    public Set<Tag> getTags() {
        return tags;
    }

    public void setTags(Set<Tag> tags) {
        this.tags = tags;
    }

    @ManyToMany (fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    public Set<User> getResolvers() {
        return resolvers;
    }

    public void setResolvers(Set<User> resolvers) {
        this.resolvers = resolvers;
    }

    public void addTag(Tag tag){
        if(tags.contains(tag)) throw new NoSuchElementException("Tag déja assigné à ce ticket");
        this.tags.add(tag);
        tag.getTickets().add(this);
    }
    public void removeTag(Tag tag){
        if(!tags.contains(tag)) throw new NoSuchElementException("Tag  inexistant");
        this.tags.remove(tag);
        tag.getTickets().remove(this);
    }

    public void addResolver(User user){
        if(resolvers.contains(user)) throw new NoSuchElementException("Utilisateur déja assigné à ce ticket");
        this.resolvers.add(user);
        user.getAffectedTickets().add(this);
    }
    public void removeResolver(User user){
        if(!resolvers.contains(user)) throw new NoSuchElementException("Resolver  inexistant");
        this.resolvers.remove(user);
        user.getAffectedTickets().remove(this);
    }


}
