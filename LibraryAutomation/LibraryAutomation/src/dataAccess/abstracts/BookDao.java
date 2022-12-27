package dataAccess.abstracts;

import java.util.List;

import Entities.Book;

public interface BookDao {
	List<Book> getAll();
	void add(Book book);
}
