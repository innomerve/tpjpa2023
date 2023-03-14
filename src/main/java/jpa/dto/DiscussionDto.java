package jpa.dto;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

public class DiscussionDto {

	Long id;
	String content;
	Map<String, Object> author = new HashMap<>();
	Map<String, Object> ticket = new HashMap<>();
	String createdAt;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

	public Map<String, Object> getAuthor() {
		return author;
	}

	public void setAuthor(Long id, String name) {
		this.author.put("id", id);
		this.author.put("name", name);
	}

	public Map<String, Object> getTicket() {
		return ticket;
	}

	public void setTicket(Long id, String title, String content, Long authorId) {
		this.ticket.put("id", id);
		this.ticket.put("title", title);
		this.ticket.put("content", content);
		this.ticket.put("authorId", authorId);
	}

	public String getCreatedAt() {
        return createdAt;

    }

    public void setCreatedAt(LocalDateTime createdAt) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy 'à' hh:mm a");

        this.createdAt = formatter.format(createdAt);
    }

}
