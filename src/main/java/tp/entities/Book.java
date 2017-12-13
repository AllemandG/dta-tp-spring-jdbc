package tp.entities;


import java.sql.Date;

/*
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import org.hibernate.validator.constraints.NotBlank;
*/

//@Entity
//@SequenceGenerator(name = "seq_book", sequenceName = "seq_book", initialValue = 1, allocationSize = 1)
public class Book {
	//@Id
	//@GeneratedValue(generator = "seq_book")
	private Integer id;
	
	//@Column
	//@NotBlank
	private String title;
	
	//@Column
	private Integer nbPages;
	
	//@Column
	private String author;
	
	//@Column
	private Date publicationDate;

	public Book () {}
	
	public Book (String title, Integer nbPages, String author, Date publicationDate) {
		this.title = title;
		this.nbPages = nbPages;
		this.author = author;
		this.publicationDate = publicationDate;
	}
	
	

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", nbPages=" + nbPages + ", author=" + author
				+ ", publicationDate=" + publicationDate + "]";
	}

	public Integer getId() {return id;}
	public void setId(Integer id) {this.id = id;}
	public String getTitle() {return title;}
	public void setTitle(String title) {this.title = title;}
	public Integer getNbPages() {return nbPages;}
	public void setNbPages(Integer nbPages) {this.nbPages = nbPages;}
	public String getAuthor() {return author;}
	public void setAuthor(String author) {this.author = author;}
	public Date getPublicationDate() {return publicationDate;}
	public void setPublicationDate(Date publicationDate) {this.publicationDate = publicationDate;}
}
