package com.kenzie.library;
import java.util.ArrayList;

public class Library {
	
	// Instance variables
	private ArrayList<Book> myLibrary;
	private ArrayList<String> checkedOut;
	
	// Constructor
	public Library() {
		this.myLibrary = new ArrayList<Book>();
		this.checkedOut = new ArrayList<String>();
		
	}
	
	// Add book method
	public void addBook(Book newBook) {
		myLibrary.add(newBook);
	}
	
	// List all books
	public String[] listBooks() {
		// New local variable for string
		String[] allBooks = new String[myLibrary.size()];
		for (int i = 0; i < myLibrary.size(); i++) {
			allBooks[i] = myLibrary.get(i).getTitle();
		}
		return allBooks;
	}
	
	
	
	
	
	// Checkout book
	public Book checkoutBook(String checkoutTitle) {
		// Search the current inventory and check out book if available
		for (int i = 0; i < myLibrary.size(); i++) {
			// Local variable for current iteration title
			String currentBook = myLibrary.get(i).getTitle();
			
				// Check if current book is the desired book
				if (currentBook == checkoutTitle && !checkedOut.contains(currentBook)) {
					// Add title to checkedOut array
					checkedOut.add(currentBook);
					// Finally, return book object
					return myLibrary.get(i);
				}
				// If book checked out, throw exception
				else if (currentBook == checkoutTitle && checkedOut.contains(currentBook)) {
					throw new BookNotAvailableException(checkoutTitle);
				}
			}
			// If book not found, throw not found exception
			throw new BookNotFoundException(checkoutTitle);
	}
	
}
