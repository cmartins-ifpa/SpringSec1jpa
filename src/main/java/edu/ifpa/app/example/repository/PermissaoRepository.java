package edu.ifpa.app.example.repository;
 
import org.springframework.data.jpa.repository.JpaRepository;

import edu.ifpa.app.example.model.Grupo;
import edu.ifpa.app.example.model.Permissao;

import java.util.List;

public interface PermissaoRepository extends JpaRepository<Permissao, Long> {
	
	List<Permissao> findByGruposIn(List<Grupo> grupo);

}
