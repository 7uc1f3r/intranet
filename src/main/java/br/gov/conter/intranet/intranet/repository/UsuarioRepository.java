package br.gov.conter.intranet.intranet.repository;

import br.gov.conter.intranet.intranet.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
