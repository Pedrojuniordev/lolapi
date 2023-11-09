package api.projeto.LOL.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import api.projeto.LOLentity.Campeão;

public interface RepositoryCampeao extends JpaRepository<Campeão, UUID> {

}
