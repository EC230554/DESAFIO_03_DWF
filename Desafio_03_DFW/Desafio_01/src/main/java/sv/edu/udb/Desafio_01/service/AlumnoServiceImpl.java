package sv.edu.udb.Desafio_01.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sv.edu.udb.Desafio_01.Alumno;
import sv.edu.udb.Desafio_01.repository.AlumnoRepository;

import java.util.List;
import java.util.Optional;

@Service
public class AlumnoServiceImpl extends AlumnoService {

    // Constructor que inyecta el repositorio y pasa al padre
    @Autowired
    public AlumnoServiceImpl(AlumnoRepository alumnoRepository) {
        super(alumnoRepository);
    }

    @Override
    public List<Alumno> listarAlumnos() {
        return alumnoRepository.findAll();
    }

    @Override
    public Optional<Alumno> obtenerAlumnoPorId(Long id) {
        return alumnoRepository.findById(id);
    }

    @Override
    public Alumno guardarAlumno(Alumno alumno) {
        return alumnoRepository.save(alumno);
    }

    @Override
    public Alumno actualizarAlumno(Long id, Alumno alumno) {
        Optional<Alumno> existente = alumnoRepository.findById(id);
        if (existente.isPresent()) {
            Alumno a = existente.get();
            a.setNombre(alumno.getNombre());
            a.setApellido(alumno.getApellido());
            // Corrige esta línea si getMateria no es un setter
            // a.getMateria(alumno.getIdMateria());
            // Por ejemplo, si quieres actualizar la materia:
            a.setMateria(alumno.getMateria());  // o el método que corresponda
            return alumnoRepository.save(a);
        }
        return null;
    }

    @Override
    public void eliminarAlumno(Long id) {
        alumnoRepository.deleteById(id);
    }
}
