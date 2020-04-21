package fr.abelardfakoundo.onlinebookstore.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="tbl_category") 
@Setter
@Getter
@ToString
public class BookCategory {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="category_name")
	private String categoryName;
	
	//dans ce qui suit on defin la relation entre la classe Book et BookCategory
	
	 @OneToMany(cascade=CascadeType.ALL, mappedBy="category") //ici mappedBy="category". Ce category a ete
	 // defini dans la classe Book ou nous avon fait:private BookCategory category;
	private Set<Book> book;

}
