// src/main/java/sv/edu/udb/Desafio_01/repository/AlumnoRepository.java
package sv.edu.udb.Desafio_01.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sv.edu.udb.Desafio_01.Alumno;

public interface AlumnoRepository extends JpaRepository<Alumno, Long> {
}
