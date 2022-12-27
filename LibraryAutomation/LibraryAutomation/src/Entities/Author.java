package Entities;

public class Author {
	private int id;
	private String FirstName;
	private String LastName;
	private String biography;
	
	public Author(String FirstName, String LastName, String biography) {
		this.FirstName = FirstName;
		this.LastName = LastName;
		this.biography = biography;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getBiography() {
		return biography;
	}

	public void setBiography(String biography) {
		this.biography = biography;
	}
	
	
}
