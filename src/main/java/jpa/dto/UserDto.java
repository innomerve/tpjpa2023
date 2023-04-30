package jpa.dto;


public class UserDto {


	// {"id":1, "name": "Baké"}

	Long id;
	String name;

	public UserDto(){};
	public UserDto(Long id, String name){
		this.id = id;
		this.name = name;
	};

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
