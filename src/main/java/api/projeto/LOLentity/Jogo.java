package api.projeto.LOLentity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name="jogo")
public class Jogo {
	@Id
	private Long id;
	private String name;
	private double price;
	
	//getters e setters
	public Jogo() {
		// TODO Auto-generated constructor stub
	}

}
