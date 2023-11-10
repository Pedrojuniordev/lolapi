package api.projeto.LOL.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import api.projeto.LOLentity.Cliente;

public interface RepositoryCliente extends JpaRepository<Cliente, UUID> {

}
