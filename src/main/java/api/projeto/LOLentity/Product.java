package api.projeto.LOLentity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name="campeão")
public class Product {
	@Id
	private Long id;
	private String name;
	private double price;

	//getters e setters
	public Product() {
		// TODO Auto-generated constructor stub
	}

}
