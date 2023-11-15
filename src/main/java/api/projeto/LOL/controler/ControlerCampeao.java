package api.projeto.LOL.controler;

import api.projeto.LOL.entitys.Campeão;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import api.projeto.LOL.repository.RepositoryCampeao;
import jakarta.servlet.http.HttpServletRequest;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/campeão")
public class ControlerCampeao {

	@Autowired
	private RepositoryCampeao repositoryCampeao;

	// Método para cadastrar um campeão
	@PostMapping("/cadastrar")
	public ResponseEntity<String> salvarCampeao(@RequestBody Campeão campeão, HttpServletRequest request) {
		repositoryCampeao.save(campeão);
		return ResponseEntity.status(HttpStatus.OK).body("Campeão criado com sucesso");
	}

	// Método para obter todos os campeões
	@GetMapping("/listar")
	public ResponseEntity<List<Campeão>> listarCampeoes() {
		List<Campeão> campeoes = repositoryCampeao.findAll();
		return ResponseEntity.status(HttpStatus.OK).body(campeoes);
	}

	// Método para obter um campeão por ID
	@GetMapping("/buscar/{id}")
	public ResponseEntity<Campeão> buscarCampeao(@PathVariable UUID id) {
		Optional<Campeão> campeaoOptional = repositoryCampeao.findById(id);
		if (campeaoOptional.isPresent()) {
			return ResponseEntity.status(HttpStatus.OK).body(campeaoOptional.get());
		} else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		}
	}

	// Método para atualizar um campeão por ID
	@PutMapping("/atualizar/{id}")
	public ResponseEntity<String> atualizarCampeao(@PathVariable UUID id, @RequestBody Campeão campeão) {
		Optional<Campeão> campeaoOptional = repositoryCampeao.findById(id);
		if (campeaoOptional.isPresent()) {
			campeão.setId(id);
			repositoryCampeao.save(campeão);
			return ResponseEntity.status(HttpStatus.OK).body("Campeão atualizado com sucesso :D");
		} else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Campeão não encontrado :(!");
		}
	}

	// Método para excluir um campeão por ID
	@DeleteMapping("/excluir/{id}")
	public ResponseEntity<String> excluirCampeao(@PathVariable UUID id) {
		Optional<Campeão> campeaoOptional = repositoryCampeao.findById(id);
		if (campeaoOptional.isPresent()) {
			repositoryCampeao.deleteById(id);
			return ResponseEntity.status(HttpStatus.OK).body("Campeão excluído com sucesso");
		} else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Campeão não encontrado");
		}
	}
}

