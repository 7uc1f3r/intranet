package br.gov.conter.intranet.intranet.controller;

import br.gov.conter.intranet.intranet.model.ContatoUsuario;
import br.gov.conter.intranet.intranet.model.Usuario;
import br.gov.conter.intranet.intranet.repository.ContatoUsuarioRepository;
import br.gov.conter.intranet.intranet.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contatoUsuario")
public class ContatoUsuarioController {

    @Autowired
    private ContatoUsuarioRepository contatoUsuarioRepository;
    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping
    public List<ContatoUsuario> findAll() {
        return contatoUsuarioRepository.findAll();
    }

    @PostMapping("/{id}")
    public void create(@RequestBody ContatoUsuario contatoUsuario, @PathVariable Long id) {
        Usuario usuario = usuarioRepository.getOne(id);
        contatoUsuario.setUsuario(usuario);
        contatoUsuarioRepository.save(contatoUsuario);
    }

    @GetMapping("/{id}")
    public ContatoUsuario findById(@PathVariable Long id) {
        return contatoUsuarioRepository.getOne(id);
    }
    @DeleteMapping("/delete/{id}")
    private void delete(@PathVariable Long id) {
        contatoUsuarioRepository.deleteById(id);
    }
}
