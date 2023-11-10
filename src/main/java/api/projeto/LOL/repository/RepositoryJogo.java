package api.projeto.LOL.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import api.projeto.LOLentity.Jogo;

public interface RepositoryJogo extends JpaRepository<Jogo, UUID> {

}
