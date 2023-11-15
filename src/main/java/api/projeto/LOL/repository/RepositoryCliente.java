package api.projeto.LOL.repository;

import java.util.UUID;

import api.projeto.LOL.entitys.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RepositoryCliente extends JpaRepository<Cliente, UUID> {

}
