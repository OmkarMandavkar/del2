package Aggregation;

class Book{
	String title, author;

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
}

class Bag{
	String color, brand;
	Book b;

	public Bag(String color, String brand) {
		this.color = color;
		this.brand = brand;
	}

	public void addBook(Book b) {
		this.b = b;
	}

	public void removeBook() {
		this.b = null;
	}
}

public class P1 {
	public static void main(String[] args) {
		Bag b1 = new Bag("Blue", "AT");
		b1.addBook(new Book("Title 1", "Author 1"));
		
		System.out.println(b1.b.title);
		System.out.println(b1.b.author);
		System.out.println(b1.color);

		b1.removeBook();
		System.out.println(b1.brand);
	}
}
