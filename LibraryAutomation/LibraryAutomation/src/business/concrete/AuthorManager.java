package business.concrete;

import java.util.List;

import Entities.Author;
import business.abstracts.AuthorService;
import dataAccess.abstracts.AuthorDao;

public class AuthorManager implements AuthorService {
	
	AuthorDao authorDao;	
	public AuthorManager(AuthorDao authorDao) {
		super();
		this.authorDao = authorDao;
	}

	@Override
	public List<Author> getAll() {
		return authorDao.getAll();
	}

	public boolean getAuthorsBiography(String authorsFirstName, String authorsLastName) {
		for (Author author : authorDao.getAll()) {
			if (author.getFirstName().equals(authorsFirstName)) {
				if (author.getLastName().equals(authorsLastName)) {
					System.out.println(author.getBiography());
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public void add(Author author) {
		authorDao.add(author);
		
	} 

}
