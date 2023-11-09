package api.projeto.LOLentity;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Entity(name="jogo")
public class Jogo {
	@Id
    @GeneratedValue(generator = "UUID")
    private UUID id;

    @Column(unique = true)
	private String partida;
	private String participantes;
	
	
	//getters e setters
	

}
