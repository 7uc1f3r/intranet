package br.gov.conter.intranet.intranet.repository;

import br.gov.conter.intranet.intranet.model.ContatoUsuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContatoUsuarioRepository extends JpaRepository<ContatoUsuario, Long> {
}
