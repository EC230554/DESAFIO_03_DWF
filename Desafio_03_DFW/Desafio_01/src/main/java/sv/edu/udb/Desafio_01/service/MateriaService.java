// src/main/java/sv/edu/udb/Desafio_01/service/MateriaService.java
package sv.edu.udb.Desafio_01.service;

import sv.edu.udb.Desafio_01.Materia;

import java.util.List;
import java.util.Optional;

public interface MateriaService {
    List<Materia> listarMaterias();
    Optional<Materia> obtenerMateriaPorId(Long id);
    Materia guardarMateria(Materia materia);
    Materia actualizarMateria(Long id, Materia materia);
    void eliminarMateria(Long id);
}
