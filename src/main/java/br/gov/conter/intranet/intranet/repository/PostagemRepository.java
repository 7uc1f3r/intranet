package br.gov.conter.intranet.intranet.repository;

import br.gov.conter.intranet.intranet.model.Postagem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostagemRepository extends JpaRepository<Postagem, Long> {
}
