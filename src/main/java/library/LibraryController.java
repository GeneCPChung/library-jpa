package library;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LibraryController {

	@Resource
	GenreRepository genreRepo;

	@Resource
	AuthorRepository authorRepo;

	@Resource
	BookRepository bookRepo;

	@RequestMapping("/genres")
	public String getAllGenres(Model model) {
		model.addAttribute("genres", genreRepo.findAll());
		return "genres";
	}

	@RequestMapping("/genre")
	public String getOneGenre(@RequestParam Long id, Model model) {
		model.addAttribute("genre", genreRepo.findOne(id));
		return "genre";
	}

	@RequestMapping("/books")
	public String getAllBooks(Model model) {
		model.addAttribute("books", bookRepo.findAll());
		return "books";
	}

	@RequestMapping("/book")
	public String getOneBook(@RequestParam Long id, Model model) {
		model.addAttribute("book", bookRepo.findOne(id));
		return "book";
	}

	@RequestMapping("/authors")
	public String getAllAuthors(Model model) {
		model.addAttribute("authors", authorRepo.findAll());
		return "authors";
	}

	@RequestMapping("/author")
	public String getOneAuthor(@RequestParam Long id, Model model) {
		model.addAttribute("authors", authorRepo.findOne(id));
		return "author";
	}

}
