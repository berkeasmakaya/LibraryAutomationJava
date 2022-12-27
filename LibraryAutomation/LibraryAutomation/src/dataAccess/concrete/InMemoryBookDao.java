package dataAccess.concrete;

import java.util.ArrayList;
import java.util.List;

import Entities.Book;
import dataAccess.abstracts.BookDao;

public class InMemoryBookDao implements BookDao{

	List<Book> books = new ArrayList<Book>();
	public InMemoryBookDao() {		
		books.add(new Book("Korku","Stefan Zweig","Novel",80));
		books.add(new Book("Hayvan Çiftliği","George Orwell","Fable",160));
		books.add(new Book("Dönüşüm", "Franz Kafka","Novel",74));
	}

	@Override
	public List<Book> getAll() {		
		return books;
	}

	@Override
	public void add(Book book) {
		books.add(book);
		
	}
}
