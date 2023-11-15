package api.projeto.LOL.controler;

import api.projeto.LOL.entitys.Jogo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import api.projeto.LOL.repository.RepositoryJogo;
import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/jogo")
public class ControlerJogo {

	@Autowired
	private RepositoryJogo repositoryJogo;
	
	@PostMapping("/cadastrar")
	public ResponseEntity salvarJogo(@RequestBody Jogo jogo, HttpServletRequest request) {
		
		return ResponseEntity.status(HttpStatus.OK).body("jogo criado com sucesso");
	}

}
