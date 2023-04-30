package jpa.dto;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class UpdateTicketDto {

	// { "title": "pb de charge", "content": "mon pc a un problème de charge"}
	@NotNull(message = "Title may not be null")
	String title;

	@NotNull(message = "Content may not be null")
	String content;

	LocalDateTime closedAt;

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

	public LocalDateTime getClosedAt() {
		return closedAt;
	}

	public void setClosedAt(LocalDateTime closedAt) {
		this.closedAt = closedAt;
	}

}
