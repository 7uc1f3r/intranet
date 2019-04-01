package br.gov.conter.intranet.intranet.controller;

import br.gov.conter.intranet.intranet.model.Postagem;
import br.gov.conter.intranet.intranet.model.TipoPostagem;
import br.gov.conter.intranet.intranet.repository.PostagemRepository;
import br.gov.conter.intranet.intranet.repository.TipoPostagemRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/postagem")
public class PostagemController {

    private PostagemRepository postagemRepository;
    private TipoPostagemRepository tipoPostagemRepository;

    public PostagemController(PostagemRepository postagemRepository, TipoPostagemRepository tipoPostagemRepository) {
        this.postagemRepository = postagemRepository;
        this.tipoPostagemRepository = tipoPostagemRepository;
    }

    @GetMapping
    public List<Postagem> findAll() {
        return postagemRepository.findAll();
    }

    @PostMapping(path = "/{id}")
    public void create(@RequestBody Postagem postagem, @PathVariable Long id) {
        TipoPostagem tp = tipoPostagemRepository.getOne(id);
        postagem.setTipoPostagem(tp);
        postagemRepository.save(postagem);
    }

    @GetMapping("/{id}")
    public Postagem findById(@PathVariable Long id) {
        return postagemRepository.getOne(id);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        postagemRepository.deleteById(id);
    }

}
