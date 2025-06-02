package sv.edu.udb.Desafio_01.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sv.edu.udb.Desafio_01.model.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username); // ✅ CORRECTO
}
