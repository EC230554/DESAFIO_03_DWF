package sv.edu.udb.Desafio_01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sv.edu.udb.Desafio_01.Alumno;
import sv.edu.udb.Desafio_01.service.AlumnoService;

import java.util.List;
import java.util.Optional;

// AlumnoController.java
@RestController
@RequestMapping("/api/alumnos")
public class AlumnoController {
    @Autowired
    private AlumnoService alumnoService;

    @GetMapping
    public List<Alumno> listar() {
        return alumnoService.listarAlumnos();
    }

    @GetMapping("/{id}")
    public Optional<Alumno> obtenerPorId(@PathVariable Long id) {
        return alumnoService.obtenerAlumnoPorId(id);
    }

    @PostMapping
    public Alumno crear(@RequestBody Alumno alumno) {
        return alumnoService.guardarAlumno(alumno);
    }

    @PutMapping("/{id}")
    public Alumno actualizar(@PathVariable Long id, @RequestBody Alumno alumno) {
        return alumnoService.actualizarAlumno(id, alumno);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        alumnoService.eliminarAlumno(id);
    }
}
