package br.gov.conter.intranet.intranet.controller;

import br.gov.conter.intranet.intranet.model.TipoPostagem;
import br.gov.conter.intranet.intranet.repository.TipoPostagemRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tipoPostagem")
public class TipoPostagemController {

    private TipoPostagemRepository tipoPostagemRepository;

    public TipoPostagemController(TipoPostagemRepository tipoPostagemRepository) {
        this.tipoPostagemRepository = tipoPostagemRepository;
    }

    @GetMapping
    public List<TipoPostagem> findAll() {
        return tipoPostagemRepository.findAll();
    }

    @PostMapping
    public void create(@RequestBody TipoPostagem tipoPostagem) {
        tipoPostagemRepository.save(tipoPostagem);
    }

    @GetMapping("/{id}")
    public TipoPostagem findById(@PathVariable Long id) {
        return tipoPostagemRepository.getOne(id);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        tipoPostagemRepository.deleteById(id);
    }

}
