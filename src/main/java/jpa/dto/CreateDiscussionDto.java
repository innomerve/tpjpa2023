package jpa.dto;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

import javax.validation.constraints.NotNull;
import java.util.List;

public class CreateDiscussionDto {

	// { "content": "hello essaie ceci", "author_id": 8, "ticket_id": 1}

	@NotNull(message = "Content may not be null")
	String content;

	@NotNull(message = "Author may not be null")
	Long authorId;

	@NotNull(message = "Ticket may not be null")
	Long ticketId;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@JsonGetter("authorId")
	public long getAuthorId() {
		return authorId;
	}

	@JsonSetter("authorId")
	public void setAuthorId(long authorId) {
		this.authorId = authorId;
	}

	public Long  getTicketId() {
		return ticketId;
	}

	public void setTicketId(Long ticketId) {
		this.ticketId = ticketId;
	}
}
