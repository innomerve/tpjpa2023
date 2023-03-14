package jpa.dto;

import javax.validation.constraints.NotNull;

public class UpdateDiscussionDto {

	// { "content": "hello essaie ceci"}

	@NotNull(message = "Content may not be null")
	String content;
	public String getContent() { return content; }

	public void setContent(String content) {
		this.content = content;
	}

}
