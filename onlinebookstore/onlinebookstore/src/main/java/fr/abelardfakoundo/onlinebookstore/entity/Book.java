package fr.abelardfakoundo.onlinebookstore.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="tbl_book") //name="tbl_book" est exCactement le nom quon a donne a notre Table sur la base de donnee
//ceci qui suit est importe sur Lombock pour nous generer Getter,Setter et ToString automatisch
@Setter
@Getter
@ToString
public class Book {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String sku;
	
	private String name;
	
	private String description;

	@Column(name="unit_price") //ici on ajoute ceci:@Column(name="unit_price")  car le nom de cette
	//proriete dans la base de donnees est unit_price or ici nous avons unitPrice. Les noms des propiretes
	//ici sur Java et sur la base de donnees doivent etre semblable
	private BigDecimal unitPrice;
	
	@Column(name="image_url")
	private String imageUrl;
	
	private boolean active;
	
	@Column(name="units_in_stock")
	private int unitsInStock;
	
	@Column(name="date_created")
	private Date createdOn;
	
	@Column(name="last_updated")
	private Date updatedOn;
	
//dans ce qui suit on defin la relation entre la classe Book et BookCategory
	
	@ManyToOne
	@JoinColumn(name="category_id", nullable=false)
	private BookCategory category;
		
}
