
package sv.edu.udb.Desafio_01.service;

import org.springframework.security.core.userdetails.*;
import org.springframework.stereotype.Service;
import sv.edu.udb.Desafio_01.model.User;
import sv.edu.udb.Desafio_01.repository.UserRepository;

import java.util.ArrayList;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    private final UserRepository userRepo;

    public UserDetailsServiceImpl(UserRepository userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = (User) userRepo.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("Usuario no encontrado: " + username));
        // No estamos manejando roles/encriptación de roles complejos; dejamos una lista vacía de authorities.
        return new org.springframework.security.core.userdetails.User(
                user.getUsername(),
                user.getPassword(),
                new ArrayList<>()
        );
    }
}
