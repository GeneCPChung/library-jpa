package library;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class LibraryPopulator implements CommandLineRunner {

	@Resource
	GenreRepository genreRepo;

	@Resource
	AuthorRepository authorRepo;

	@Resource
	BookRepository bookRepo;

	@Override
	public void run(String... args) throws Exception {

		Genre fiction = new Genre("Fiction");
		genreRepo.save(fiction);
		Genre nonFiction = new Genre("Non Fiction");
		genreRepo.save(nonFiction);

		Author kathy = new Author("Kathy", "Sierra");
		authorRepo.save(kathy);
		Author bert = new Author("Bert", "Bates");
		authorRepo.save(bert);
		Author elisabeth = new Author("Elisabeth", "Freeman");
		authorRepo.save(elisabeth);
		Author cliff = new Author("Clifford", "Stoll");
		authorRepo.save(cliff);

		Book hfdp = new Book(nonFiction, "Head First Design Patterns", kathy, bert);
		bookRepo.save(hfdp);
		Book hfj = new Book(nonFiction, "Head First Java", kathy, elisabeth);
		bookRepo.save(hfj);
		Book tce = new Book(fiction, "The Cukoo's Egg", cliff);
		bookRepo.save(tce);
	}

}
