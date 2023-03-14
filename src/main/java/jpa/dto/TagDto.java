package jpa.dto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TagDto {


	// {"id":1, "name": "Baké"}

	Long id;
	String label;
	List<TicketDto> tickets = new ArrayList<>();


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

	public List<TicketDto> getTickets() {
		return tickets;
	}

	public void setTickets(List<TicketDto> tickets) {
		this.tickets = tickets;
	}

}
