package edu.ifpa.app.example.repository;
 
import org.springframework.data.jpa.repository.JpaRepository;

import edu.ifpa.app.example.model.Grupo;
import edu.ifpa.app.example.model.Usuario;

import java.util.List;

public interface GrupoRepository extends JpaRepository<Grupo, Long> {
	
	List<Grupo> findByUsuariosIn(List<Usuario> usuario);

}
