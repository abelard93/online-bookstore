package fr.abelardfakoundo.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import fr.abelardfakoundo.onlinebookstore.entity.Book;

@CrossOrigin("http://localhost:4200")
//JpaRepository<Book, Long> (Book=Entity Name, Long=Primary Key Type)
public interface BookRepository extends JpaRepository<Book, Long> {

}
