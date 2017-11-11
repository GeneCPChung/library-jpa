package library;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Genre {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String genre;

	@OneToMany(mappedBy = "genre")
	private Set<Book> booksInGenre = new HashSet<Book>();

	protected Genre() {
	}

	public Genre(String genre) {
		this.genre = genre;
	}

	public Long getId() {
		return id;
	}

	public String getGenre() {
		return genre;
	}

	public Set<Book> getBooksInGenre() {
		return booksInGenre;
	}

	@Override
	public String toString() {
		return "Genre [id=" + id + ", genre=" + genre + ", booksInGenre=" + booksInGenre + "]";
	}

}
