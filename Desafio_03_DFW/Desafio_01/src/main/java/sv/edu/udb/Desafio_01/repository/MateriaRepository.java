// src/main/java/sv/edu/udb/Desafio_01/repository/MateriaRepository.java
package sv.edu.udb.Desafio_01.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sv.edu.udb.Desafio_01.Materia;

public interface MateriaRepository extends JpaRepository<Materia, Long> {
}
