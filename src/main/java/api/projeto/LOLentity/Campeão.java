package api.projeto.LOLentity;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Entity(name="campeão")
@Table(name="campeão")
public class Campeão {

	@Id
    @GeneratedValue(generator = "UUID")
    private UUID id;

    @Column(unique = true)
	private String nome;
	private double preço;
	private String level;
	private Integer xp;
	private String habilidade;
	private Integer tempodefabricacao;
	
	
	//getters e setters
	

}
