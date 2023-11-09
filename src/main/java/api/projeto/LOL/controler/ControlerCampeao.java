package api.projeto.LOL.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import api.projeto.LOL.repository.RepositoryCampeao;
import api.projeto.LOLentity.Campeão;
import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/campeão")
public class ControlerCampeao {

	@Autowired
	private RepositoryCampeao repositoryCampeao;
	
	@PostMapping("/cadastrar")
	public ResponseEntity salvarCampeao(@RequestBody Campeão campeão, HttpServletRequest request) {
        
        return ResponseEntity.status(HttpStatus.OK).body("campeão criado com sucesso");
    }

}
