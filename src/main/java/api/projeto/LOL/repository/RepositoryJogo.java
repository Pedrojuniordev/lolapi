package api.projeto.LOL.repository;

import java.util.UUID;

import api.projeto.LOL.entitys.Jogo;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RepositoryJogo extends JpaRepository<Jogo, UUID> {

}
