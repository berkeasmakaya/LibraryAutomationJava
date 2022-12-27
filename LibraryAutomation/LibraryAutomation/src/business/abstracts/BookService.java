package business.abstracts;

import java.util.List;

import Entities.Book;

public interface BookService {
	List<Book> getAll();
	void add(Book book);
}
