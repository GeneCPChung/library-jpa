package library;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String title;

	@ManyToOne
	private Genre genre;

	@ManyToMany
	private Set<Author> authors;

	protected Book() {

	}

	public Book(Genre genre, String title, Author... authors) {
		this.title = title;
		this.genre = genre;
		this.authors = new HashSet<>(Arrays.asList(authors));
	}

	public Long getId() {
		return id;
	}

	public Genre getGenre() {
		return genre;
	}

	public String getTitle() {
		return title;
	}

	public Set<Author> getAuthors() {
		return authors;
	}

	@Override
	public String toString() {
		return title + ", genre=" + genre + ", authors=" + authors;
	}

}
