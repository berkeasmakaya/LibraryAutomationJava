package dataAccess.abstracts;

import java.util.List;

import Entities.Author;

public interface AuthorDao {
	List<Author> getAll();
	void add(Author author);
}
