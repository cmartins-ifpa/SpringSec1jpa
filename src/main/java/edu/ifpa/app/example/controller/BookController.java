package edu.ifpa.app.example.controller;
 
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.ifpa.app.example.model.Book;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@Validated
public class BookController {

    @GetMapping("/books")    
    List<Book> findAll() {
    	// para simplificar, criamos dois livros na entidade "Book"
    	List<Book> livros = new ArrayList<Book>();
        livros.addAll(
                Arrays.asList(
                        new Book("Livro 1", new BigDecimal(1)),
                        new Book("Livro 2", new BigDecimal(21))
                ));                
        return livros;
    }

    @GetMapping("/books2")
    List<Book> findAll2() {
        List<Book> livros = new ArrayList<Book>();
        livros.addAll(
                Arrays.asList(
                        new Book("Livro 2", new BigDecimal(1))
                ));
        return livros;
    }

}
