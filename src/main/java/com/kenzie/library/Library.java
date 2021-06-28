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

}
