package br.gov.conter.intranet.intranet.controller;

import br.gov.conter.intranet.intranet.model.MidiaPostagem;
import br.gov.conter.intranet.intranet.repository.MidiaPostagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/midiaPostagem")
public class MidiaPostagem {

    @Autowired
    private MidiaPostagemRepository midiaPostagemRepository;

    public MidiaPostagem(MidiaPostagemRepository midiaPostagemRepository) {
        this.midiaPostagemRepository = midiaPostagemRepository;
    }

    @GetMapping
    public List<MidiaPostagem> findAll() {
        return midiaPostagemRepository.findAll();
    }
}
