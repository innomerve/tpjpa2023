package jpa.dto;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TicketDto {


    long id;
    String title;
    String content;
    String createdAt;
    String closedAt;
    Map<String, Object> author = new HashMap<>();
    List<Map<String, Object>> resolvers = new ArrayList<>();
    List<Map<String, Object>> tags = new ArrayList<>();
    List<Map<String, Object>> discussions = new ArrayList<>();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy 'à' hh:mm a");
        this.createdAt = formatter.format(createdAt);
    }

    public String getClosedAt() {
        return closedAt;
    }

    public void setClosedAt(LocalDateTime closedAt) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy 'à' hh:mm a");
        this.closedAt = formatter.format(closedAt);
    }

    public Map<String, Object> getAuthor() {
        return author;
    }

    public void setAuthor(Long id, String name) {
        this.author.put("id", id);
        this.author.put("name", name);
    }

    public List<Map<String, Object>> getResolvers() {
        return resolvers;
    }

    public void addResolver(Map<String, Object> resolver) {
        this.resolvers.add(resolver);
    }

    public List<Map<String, Object>> getTags() {
        return tags;
    }

    public void addTag(Map<String, Object> tag) {
        this.tags.add(tag);
    }

    public List<Map<String, Object>> getDiscussions() {
        return discussions;
    }

    public void addDiscussion(Map<String, Object> discussion) {
        this.discussions.add(discussion);
    }
}
