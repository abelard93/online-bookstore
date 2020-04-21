package fr.abelardfakoundo.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.abelardfakoundo.onlinebookstore.entity.Book;
//JpaRepository<Book, Long> (Book=Entity Name, Long=Primary Key Type)
public interface BookRepository extends JpaRepository<Book, Long> {

}
