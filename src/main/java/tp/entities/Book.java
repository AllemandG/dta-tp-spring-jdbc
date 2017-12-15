package tp.entities;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name="books")
@SequenceGenerator(name = "books_id_seq", sequenceName = "books_id_seq", initialValue = 0, allocationSize = 1)
public class Book {
	@Column(name="title")
	private String title;
	
	@Column(name = "nb_pages")
	private Integer nbPages;
	
	@Column(name="author")
	private String author;
	
	@Column(name = "publication_date")
	@Temporal(TemporalType.DATE)
	private Date publicationDate;
	
	@Id
	@GeneratedValue(generator = "books_id_seq")
	@Column(name="id")
	private Long id;

	public Book () {}
	
	public Book (String title, Integer nbPages, String author, Date publicationDate) {
		this.title = title;
		this.nbPages = nbPages;
		this.author = author;
		this.publicationDate = publicationDate;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", nbPages=" + nbPages + ", author=" + author
				+ ", publicationDate=" + publicationDate + "]";
	}

	public Long getId() {return id;}
	public void setId(Long id) {this.id = id;}
	public String getTitle() {return title;}
	public void setTitle(String title) {this.title = title;}
	public Integer getNbPages() {return nbPages;}
	public void setNbPages(Integer nbPages) {this.nbPages = nbPages;}
	public String getAuthor() {return author;}
	public void setAuthor(String author) {this.author = author;}
	public Date getPublicationDate() {return publicationDate;}
	public void setPublicationDate(Date publicationDate) {this.publicationDate = publicationDate;}
}
