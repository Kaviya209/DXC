package Aassignment;
class Author
{
	private String name;
	private String emailId;
	private char gender;
	
	Author(String name,String emailId,char gender){
		this.name = name;
		this.emailId = emailId;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
 
}
class Book {
 //Implement your code here 
	private String name;
	private Author author;
	private double price;
	private int quantity;
	
	Book(String name, Author author,double price,int quality){
		this.name = name;
		this.author = author;
		this.price = price;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public void displayAuthorDetails() {
		System.out.println("Display author details ");
		System.out.println("Author name : "+getName());
		System.out.println("Author email :"+author.getEmailId());
		System.out.println("Author gender : "+author.getGender());
	}
}
class ATester {
 public static void main(String[] args) {
	 Author author = new Author("Joshua Blouch","Joshu@gmail.com",'M');
	 Book book = new Book("Effective java",author,45,15);
	 book.displayAuthorDetails();
  
 }
}
