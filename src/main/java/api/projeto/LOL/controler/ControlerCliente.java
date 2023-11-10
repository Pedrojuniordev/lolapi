package api.projeto.LOL.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import api.projeto.LOL.repository.RepositoryCliente;
import api.projeto.LOLentity.Cliente;
import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/cliente")
public class ControlerCliente {

	@Autowired
	private RepositoryCliente repositoryCliente;
	
	@PostMapping("/cadastrar")
	public ResponseEntity salvarCliente(@RequestBody Cliente cliente, HttpServletRequest request) {
		
		return ResponseEntity.status(HttpStatus.OK).body("campeão criado com sucesso");
	}

}
