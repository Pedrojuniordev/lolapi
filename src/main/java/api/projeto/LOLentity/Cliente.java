package api.projeto.LOLentity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name="cliente")
public class Cliente {
	@Id
	private Long id;
	private String name;
	private double price;

	//getters e setters
	public Cliente() {
		// TODO Auto-generated constructor stub
	}

}
