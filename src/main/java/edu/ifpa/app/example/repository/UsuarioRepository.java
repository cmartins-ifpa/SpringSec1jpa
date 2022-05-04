package edu.ifpa.app.example.repository;
 
import org.springframework.data.jpa.repository.JpaRepository;

import edu.ifpa.app.example.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	Usuario findByLogin(String login);
}
