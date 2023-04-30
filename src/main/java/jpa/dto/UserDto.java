package jpa.dto;


public class UserDto {


	// {"id":1, "name": "Baké"}

	Long id;
	String name;
	int nbDiscussion;
	int nbAffectedTicket;
	int nbCreatedTicket;

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

	public int getNbDiscussion() {
        return nbDiscussion;
    }

    public void setNbDiscussion(int nbDiscussion) {
        this.nbDiscussion = nbDiscussion;
    }


	public int getNbAffectedTicket() {
        return nbAffectedTicket;
    }

    public void setNbAffectedTicket(int nbAffectedTicket) {
        this.nbAffectedTicket = nbAffectedTicket;
    }


	public int getNbCreatedTicket() {
        return nbCreatedTicket;
    }

    public void setNbCreatedTicket(int nbCreatedTicket) {
        this.nbCreatedTicket = nbCreatedTicket;
    }

}
