package br.com.letscode.aula01.repository;

import br.com.letscode.aula01.model.ClientModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<ClientModel, Long> {
}
