package api.projeto.LOL.repository;

import java.util.UUID;

import api.projeto.LOL.entitys.Campeão;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RepositoryCampeao extends JpaRepository<Campeão, UUID> {

}
