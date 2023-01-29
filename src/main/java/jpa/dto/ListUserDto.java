package jpa.dto;


public class ListUserDto {


	// {"id":1, "name": "Baké"}

	Long id;
	String name;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
