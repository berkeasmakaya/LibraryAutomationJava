package business.concrete;

import java.time.LocalDate;
import java.util.List;

import Entities.Book;
import business.abstracts.BookService;
import dataAccess.abstracts.BookDao;

public class BookManager implements BookService{
	BookDao bookDao;
	
	public BookManager(BookDao bookDao) {
		super();
		this.bookDao = bookDao;
	}


	@Override
	public List<Book> getAll() { 
		return bookDao.getAll();
	}

	public boolean FindBook(String name){
		for (Book book : bookDao.getAll()) {
			if (book.getName().equals(name)) {
				System.out.println(book.getName() + " adlı kitabınızı " + book.getType() + " bölümünden bulabilirsiniz."); 
				return true;
			}
		}
		return false;
	}
	
	LocalDate tarih = LocalDate.now();
	public void Barrow(String name) {	

		for (Book book : bookDao.getAll()) {
			if (book.getName().equals(name)) {
				System.out.println(name + " adlı kitabı ödünç aldınız: " + tarih);
			}
		}
	}

	@Override
	public void add(Book book) {
		bookDao.add(book);
		
	}

}
