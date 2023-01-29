package jpa.domain;
import com.sun.istack.NotNull;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
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

    private List<User> resolvers =new ArrayList<>();
    private List<Discussion> discussions = new ArrayList<>();
    private List<Tag> tags = new ArrayList<>();

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
    @OneToMany (mappedBy = "ticket", cascade = CascadeType.PERSIST)
    public List<Discussion> getDiscussions() {
        return discussions;
    }

    public void setDiscussions(List<Discussion> discussionList) {
        this.discussions = discussionList;
    }

    @ManyToMany (mappedBy = "tickets", cascade = CascadeType.PERSIST)
    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    @ManyToMany(mappedBy = "affectedTickets", cascade = CascadeType.PERSIST)
    public List<User> getResolvers() {
        return resolvers;
    }

    public void setResolvers(List<User> resolvers) {
        this.resolvers = resolvers;
    }

    public void addTag(Tag tag){
        if(tags.contains(tag)) throw new NoSuchElementException("Tag déja assigné à ce ticket");
        tags.add(tag);
    }
    public void removeTag(Tag tag){
        if(!tags.contains(tag)) throw new NoSuchElementException("Tag inexistant");
        tags.remove(tag);
    }

    public void addResolver(User user){
        if(resolvers.contains(user)) throw new NoSuchElementException("Utilisateur déja assigné à ce ticket");
        resolvers.add(user);
    }
    public void removeResolver(User user){
        if(!resolvers.contains(user)) throw new NoSuchElementException("Resolver  inexistant");
        resolvers.remove(user);
    }

    public void addDiscussion(Discussion discussion){
        if(discussions.contains(discussion)) throw new NoSuchElementException("Discussion déja assigné à ce ticket");
        discussions.add(discussion);
    }
    public void removeDiscussion(Discussion discussion){
        if(!discussions.contains(discussion)) throw new NoSuchElementException("Discussion inexistante");
        discussions.remove(discussion);
    }

}
