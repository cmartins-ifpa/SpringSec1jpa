package edu.ifpa.app.example.repository;
 
import org.springframework.data.jpa.repository.JpaRepository;

import edu.ifpa.app.example.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {	
}
