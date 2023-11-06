package api.projeto.LOLentity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name="campeão")
public class Campeão {

	@Id
	private Long id;
	private String name;
	private double price;
	
	
	//getters e setters
	public Campeão() {
		// TODO Auto-generated constructor stub
	}

}
