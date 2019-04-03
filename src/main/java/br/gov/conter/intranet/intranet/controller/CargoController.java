package br.gov.conter.intranet.intranet.controller;

import br.gov.conter.intranet.intranet.model.Cargo;
import br.gov.conter.intranet.intranet.repository.CargoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cargo")
public class CargoController {

    @Autowired
    private CargoRepository cargoRepository;

    public CargoController() {
    }

    public CargoController(CargoRepository cargoRepository) {
        this.cargoRepository = cargoRepository;
    }

    @GetMapping
    public List<Cargo> findAll() {
        return cargoRepository.findAll();
    }

    @PostMapping
    public void create(@RequestBody Cargo cargo) {
        cargoRepository.save(cargo);
    }

    @GetMapping("/{id}")
    public Optional<Cargo> findById(@PathVariable Long id) {
        return cargoRepository.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        cargoRepository.deleteById(id);
    }

}
