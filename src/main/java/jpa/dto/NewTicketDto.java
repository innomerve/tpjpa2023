package jpa.dto;

import javax.validation.constraints.NotNull;


import java.util.List;

public class NewTicketDto {

	// { "title": "pb de charge", "content": "mon pc a un problème de charge", "author_id": 8,
	// "tag_ids": [1,2,3,4]}
	@NotNull(message = "Title may not be null")
	String title;

	@NotNull(message = "Content may not be null")
	String content;

	@NotNull(message = "Author may not be null")
	Long author_id;

	List<Long> tag_ids;

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
		return author_id;
	}

	public void setAuthorId(long author_id) {
		this.author_id = author_id;
	}

	public List<Long>  getTagIds() {
		return tag_ids;
	}

	public void setTagIds(List<Long>  tag_ids) {
		this.tag_ids = tag_ids;
	}
}
