package br.gov.conter.intranet.intranet.controller;

import br.gov.conter.intranet.intranet.model.MidiaPostagem;
import br.gov.conter.intranet.intranet.repository.MidiaPostagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/midiaPostagem")
public class MidiaPostagemController {

    @Autowired
    private MidiaPostagemRepository midiaPostagemRepository;

    public MidiaPostagemController(MidiaPostagemRepository midiaPostagemRepository) {
        this.midiaPostagemRepository = midiaPostagemRepository;
    }

    @GetMapping
    public List<MidiaPostagem> findAll() {
        return midiaPostagemRepository.findAll();
    }

    @PostMapping
    private void create(@RequestBody MidiaPostagem midiaPostagem) {
        midiaPostagemRepository.save(midiaPostagem);
    }

    @GetMapping("/{id}")
    private MidiaPostagem findById(@PathVariable Long id) {
        return midiaPostagemRepository.getOne(id);
    }

    @DeleteMapping("/delete/{id}")
    private void delete(@PathVariable Long id) {
        midiaPostagemRepository.deleteById(id);
    }
}
