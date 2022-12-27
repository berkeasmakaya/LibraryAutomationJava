package Entities;

public class Book {
	private int id;
	private String name;
	private String author;
	private String type;
	private int numberOfPages;

	
	
	public Book(String name, String author,String type ,int numberOfPages) {
		super();
		this.name = name;
		this.author = author;
		this.type = type;
		this.numberOfPages = numberOfPages;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getNumberOfPages() {
		return numberOfPages;
	}
	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}


	
	
}
