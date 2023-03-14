package jpa.dto;

import javax.validation.constraints.NotNull;


public class CreateOrUpdateTagDto {

	// { "name": "Baké"}
	@NotNull(message = "Label may not be null")
	String label;


	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

}
