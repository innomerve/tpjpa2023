package jpa.dto;

import javax.validation.constraints.NotNull;


public class CreateOrUpdateUserDto {

	// { "name": "Baké"}
	@NotNull(message = "Name may not be null")
	String name;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
