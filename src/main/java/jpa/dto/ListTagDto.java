package jpa.dto;

public class ListTagDto {


	// {"id":1, "name": "Baké"}

	Long id;
	String label;
	int nbTicket;


	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

	public int getNbTicket() {
		return nbTicket;
	}

	public void setNbTicket(int nbTicket) {
		this.nbTicket = nbTicket;
	}

}
