package sv.edu.udb.Desafio_01.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sv.edu.udb.Desafio_01.Materia;
import sv.edu.udb.Desafio_01.repository.MateriaRepository;

import java.util.List;
import java.util.Optional;

@Service
public class MateriaServiceImpl implements MateriaService {

    @Autowired
    private MateriaRepository materiaRepository;

    @Override
    public List<Materia> listarMaterias() {
        return materiaRepository.findAll();
    }

    @Override
    public Optional<Materia> obtenerMateriaPorId(Long id) {
        return materiaRepository.findById(id);
    }

    @Override
    public Materia guardarMateria(Materia materia) {
        return materiaRepository.save(materia);
    }

    @Override
    public Materia actualizarMateria(Long id, Materia materia) {
        materia.setId(id);
        return materiaRepository.save(materia);
    }

    @Override
    public void eliminarMateria(Long id) {
        materiaRepository.deleteById(id);
    }
}
