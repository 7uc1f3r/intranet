package br.gov.conter.intranet.intranet.controller;


import br.gov.conter.intranet.intranet.model.Departamento;
import br.gov.conter.intranet.intranet.repository.DepartamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departamento")
public class DepartamentoController {

    @Autowired
    private DepartamentoRepository departamentoRepository;

    public DepartamentoController(DepartamentoRepository departamentoRepository) {
        this.departamentoRepository = departamentoRepository;
    }

    @GetMapping
    public List<Departamento> findAll() {
        return departamentoRepository.findAll();
    }

    @PostMapping
    public void create(@RequestBody Departamento departamento) {
        departamentoRepository.save(departamento);
    }

    @GetMapping("/{id}")
    public Departamento findById(@PathVariable Long id) {
        return departamentoRepository.getOne(id);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        departamentoRepository.deleteById(id);
    }
}
