package business.abstracts;

import java.util.List;

import Entities.Author;

public interface AuthorService {
	List<Author> getAll();
	void add(Author author);
}
