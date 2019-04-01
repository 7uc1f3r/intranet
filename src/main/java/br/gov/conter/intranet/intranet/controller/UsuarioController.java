package br.gov.conter.intranet.intranet.controller;

import br.gov.conter.intranet.intranet.model.Departamento;
import br.gov.conter.intranet.intranet.model.Usuario;
import br.gov.conter.intranet.intranet.repository.CargoRepository;
import br.gov.conter.intranet.intranet.repository.DepartamentoRepository;
import br.gov.conter.intranet.intranet.repository.PerfilAcessoRepository;
import br.gov.conter.intranet.intranet.repository.UsuarioRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    private UsuarioRepository usuarioRepository;
    private CargoRepository cargoRepository;
    private DepartamentoRepository departamentoRepository;
    private PerfilAcessoRepository perfilAcessoRepository;

    public UsuarioController(UsuarioRepository usuarioRepository, CargoRepository cargoRepository, DepartamentoRepository departamentoRepository, PerfilAcessoRepository perfilAcessoRepository) {
        this.usuarioRepository = usuarioRepository;
        this.cargoRepository = cargoRepository;
        this.departamentoRepository = departamentoRepository;
        this.perfilAcessoRepository = perfilAcessoRepository;
    }

    @GetMapping
    public List<Usuario> findAll() {
        return usuarioRepository.findAll();
    }

    @PostMapping(path = "/{id}/{id}/{id}")
    public void create(@RequestBody Usuario usuario,@PathVariable Long idCargo, @PathVariable Long idDepart, @PathVariable Long idPA) {
        usuario.setCargo(cargoRepository.getOne(idCargo));
        usuario.setDepartamento(departamentoRepository.getOne(idDepart));
        usuario.setPerfilAcesso(perfilAcessoRepository.getOne(idPA));
        usuarioRepository.save(usuario);
    }

    @GetMapping("/{id}")
    public Usuario usuario(@PathVariable Long id) {
        return usuarioRepository.getOne(id);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        usuarioRepository.deleteById(id);
    }

}
