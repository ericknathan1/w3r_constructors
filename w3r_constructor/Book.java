package w3r_constructor;

public class Book {
 private String title;
 private String author;
 private Double price;
 
 public Book(String title, String author) {
	 this.title = title;
	 this.author = author;
 }
 
 public Book(String title, String author, double price) {
	 this.title = title;
	 this.author = author;
	 this.price = price;
 }
 	
 public static void main(String[] args) {
	Book b1 = new Book("The Black Cat","Edgar Allan Poe");
	Book b2 = new Book("Lord Of The Rings", "J.R.R. Tolkien",50.00);
	
	System.out.println("Book 1 name: "+b1.title);
	System.out.println("Book 1 author: "+b1.author);
	
	System.out.println("\nBook 2 name: "+b2.title);
	System.out.println("Book 2 author: "+b2.author);
	System.out.println("Book 2 price: $"+b2.price);
}
}
