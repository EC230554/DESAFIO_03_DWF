package sv.edu.udb.Desafio_01.service;

import sv.edu.udb.Desafio_01.Alumno;

import java.util.List;
import java.util.Optional;

public abstract class AlumnoService {

    protected final sv.edu.udb.Desafio_01.repository.AlumnoRepository alumnoRepository;

    // Constructor que recibe el repositorio
    public AlumnoService(sv.edu.udb.Desafio_01.repository.AlumnoRepository alumnoRepository) {
        this.alumnoRepository = alumnoRepository;
    }

    // Métodos abstractos para implementar en la clase hija
    public abstract List<Alumno> listarAlumnos();

    public abstract Optional<Alumno> obtenerAlumnoPorId(Long id);

    public abstract Alumno guardarAlumno(Alumno alumno);

    public abstract Alumno actualizarAlumno(Long id, Alumno alumno);

    public abstract void eliminarAlumno(Long id);
}
