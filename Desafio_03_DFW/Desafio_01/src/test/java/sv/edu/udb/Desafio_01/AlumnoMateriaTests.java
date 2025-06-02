package sv.edu.udb.Desafio_01;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;
import sv.edu.udb.Desafio_01.repository.AlumnoRepository;
import sv.edu.udb.Desafio_01.repository.MateriaRepository;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class AlumnoMateriaTests {

    @Autowired
    private AlumnoRepository alumnoRepository;

    @Autowired
    private MateriaRepository materiaRepository;

    @Test
    @Transactional
    public void testInsertarRegistros() {
        // Crear y guardar una nueva materia
        Materia materia = new Materia();
        materia.setNombre("Biología");
        materiaRepository.save(materia);

        // Verificar que la materia se haya guardado
        assertThat(materiaRepository.findById(materia.getId())).isPresent();

        // Crear y guardar un nuevo alumno
        Alumno alumno = new Alumno();
        alumno.setNombre("Pedro");
        alumno.setApellido("Ramírez");
        alumno.setIdMateria(materia.getId());
        alumnoRepository.save(alumno);

        // Verificar que el alumno se haya guardado
        assertThat(alumnoRepository.findById(alumno.getId())).isPresent();
    }
}