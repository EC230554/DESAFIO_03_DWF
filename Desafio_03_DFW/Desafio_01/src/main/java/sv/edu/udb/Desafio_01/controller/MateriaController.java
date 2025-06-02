package sv.edu.udb.Desafio_01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sv.edu.udb.Desafio_01.Materia;
import sv.edu.udb.Desafio_01.service.MateriaService;

import java.util.List;
import java.util.Optional;

// MateriaController.java
@RestController
@RequestMapping("/api/materias")
public class MateriaController {
    @Autowired
    private MateriaService materiaService;

    @GetMapping
    public List<Materia> listar() {
        return materiaService.listarMaterias();
    }

    @GetMapping("/{id}")
    public Optional<Materia> obtenerPorId(@PathVariable Long id) {
        return materiaService.obtenerMateriaPorId(id);
    }

    @PostMapping
    public Materia crear(@RequestBody Materia materia) {
        return materiaService.guardarMateria(materia);
    }

    @PutMapping("/{id}")
    public Materia actualizar(@PathVariable Long id, @RequestBody Materia materia) {
        return materiaService.actualizarMateria(id, materia);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        materiaService.eliminarMateria(id);
    }
}
