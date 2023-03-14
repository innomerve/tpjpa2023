package jpa.dto;

import javax.validation.constraints.NotNull;


import java.util.List;

public class CreateTicketDto {

	// { "title": "pb de charge", "content": "mon pc a un problème de charge", "author_id": 8,
	// "tag_ids": [1,2,3,4]}
	@NotNull(message = "Title may not be null")
	String title;

	@NotNull(message = "Content may not be null")
	String content;

	@NotNull(message = "Author may not be null")
	Long authorId;

	List<Long> tagIds;

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

	public long getAuthorId() {
		return authorId;
	}

	public void setAuthorId(long authorId) {
		this.authorId = authorId;
	}

	public List<Long>  getTagIds() {
		return tagIds;
	}

	public void setTagIds(List<Long>  tagIds) {
		this.tagIds = tagIds;
	}
}
