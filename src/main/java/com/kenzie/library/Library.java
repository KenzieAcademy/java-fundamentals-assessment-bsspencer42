package com.kenzie.library;
import java.util.ArrayList;
import java.util.Collections;

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
		Collections.sort(myLibrary);
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
	
	// List books by genre
	public String[] listBooks(Genre genre) {
		// New local arrayList
		ArrayList<String> genreOnly = new ArrayList<>();
		for (int i = 0; i < myLibrary.size();i++) {
			if (myLibrary.get(i).getGenre() == genre) {
				genreOnly.add(myLibrary.get(i).getTitle());
			}
		}
		// Cast arrayList to String list
		String[] genreOnlyList = new String[genreOnly.size()];
		for (int x = 0; x <genreOnly.size();x++) {
			genreOnlyList[x] = genreOnly.get(x);
		}
		return genreOnlyList;
	}
	
	// List available books
	public String[] listAvailableBooks() {
		// New local arrayList
		ArrayList<String> availableBooksArrList = new ArrayList<>();
		// Add if the book not in the checked out book list
		for (int i = 0; i < myLibrary.size();i++) {
			if (!checkedOut.contains(myLibrary.get(i).getTitle())) {
				availableBooksArrList.add(myLibrary.get(i).getTitle());
			}	
		}
		// Cast arrayList to String list
		String[] availableBooks = new String[availableBooksArrList.size()];
		for (int x = 0; x <availableBooksArrList.size();x++) {
			availableBooks[x] = availableBooksArrList.get(x);
		}
		return availableBooks;
	}
	
	// List available books of specific genre
	public String[] listAvailableBooks(Genre genre) {
		// New local arrayList
		ArrayList<String> availableBooksArrList = new ArrayList<>();
		// Add if the book not in the checked out book list
		for (int i = 0; i < myLibrary.size();i++) {
			if (myLibrary.get(i).getGenre() == genre && !checkedOut.contains(myLibrary.get(i).getTitle())) {
				availableBooksArrList.add(myLibrary.get(i).getTitle());
			}
		}
		// Cast arrayList to String list
		String[] availableBooks = new String[availableBooksArrList.size()];
		for (int x = 0; x <availableBooksArrList.size();x++) {
			availableBooks[x] = availableBooksArrList.get(x);
		}
		return availableBooks;
	}
	
	// Check to see if book exists in library
	public boolean hasBook(String checkTitle) {
		for (int i = 0; i < myLibrary.size();i++) {
			if (myLibrary.get(i).getTitle() == checkTitle) {
				return true;
			}
		}
		return false;
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
	
	// Return book
	public void returnBook(Book book) {
		String bookTitle = book.getTitle();
		if (checkedOut.contains(bookTitle)) {
			checkedOut.remove(bookTitle);
		}
		else{
			System.out.println("Book not in checked out list.");
		}
	}
	
}
