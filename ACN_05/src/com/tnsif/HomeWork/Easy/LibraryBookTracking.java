package com.tnsif.HomeWork.Easy;

class Book{
	
	int bookId;
	String title;
	String author;
	
	static int totalBooks = 0;
	
	final String LibraryName = "SARA Central Library";
	
	Book(int bookId, String title, String author){
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		totalBooks ++;
	}
	
	void display() {

		System.out.println("Library Name : " +LibraryName);
        System.out.println("Book ID      : " + bookId);
        System.out.println("Title        : " + title);
        System.out.println("Author       : " + author);
	}
}


class IssuedBook extends Book{
	
	String StudentName;
	String IssuedDate;
	String returnDate;
	
	
	IssuedBook(int bookId, String title, String author, String StudentName, String IssuedDate, String returnDate){
		
		
		super(bookId, title, author);
		
		
		this.StudentName = StudentName;
		this.IssuedDate = IssuedDate;
		this.returnDate = returnDate;
		
	}
	
	
	void display() {
	
		super.display();
		
		System.out.println("Issued To    : " + StudentName);
        System.out.println("Issue Date   : " + IssuedDate);
        System.out.println("Return Date  : " + returnDate);
        System.out.println("Status       : Issued");
        
	}
}




public class LibraryBookTracking {

	public static void main(String[] args) {
		
		Book b1 = new Book(
                101,
                "Java Programming",
                "Herbert Schildt");

        IssuedBook b2 = new IssuedBook(
                102,
                "Data Structures",
                "Narasimha Karumanchi",
                "Sruthi",
                "31-May-2026",
                "10-Jun-2026");

        System.out.println("===== Available Book =====");
        b1.display();

        System.out.println();

        System.out.println("===== Issued Book =====");
        b2.display();

        System.out.println();

        System.out.println("Total Books in System : "
                           + Book.totalBooks);
		
	}

}

