package br.gov.conter.intranet.intranet.controller;

import br.gov.conter.intranet.intranet.model.PerfilAcesso;
import br.gov.conter.intranet.intranet.repository.PerfilAcessoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/perfilAcesso")
public class PerfilAcessoController {

    @Autowired
    private PerfilAcessoRepository perfilAcessoRepository;

    public PerfilAcessoController(PerfilAcessoRepository perfilAcessoRepository) {
        this.perfilAcessoRepository = perfilAcessoRepository;
    }

    @GetMapping
    public List<PerfilAcesso> findAll() {
        return perfilAcessoRepository.findAll();
    }

    @PostMapping
    public void create(@RequestBody PerfilAcesso perfilAcesso) {
        perfilAcessoRepository.save(perfilAcesso);
    }

    @GetMapping("/{id}")
    public Optional<PerfilAcesso> findById(@PathVariable Long id) {
        return perfilAcessoRepository.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        perfilAcessoRepository.deleteById(id);
    }
}
