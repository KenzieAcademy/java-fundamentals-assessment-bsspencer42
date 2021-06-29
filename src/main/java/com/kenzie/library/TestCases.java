package com.kenzie.library;

import java.util.LinkedList;

public class TestCases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// My book
		String[] myContents = {"This is page one.", "This is page two", "Roses are red", "Tohmy is a Who"};
		Book myBook = new Book("Sorcerer's Stone", "J.K. Rowling", Genre.SCIENCE_FICTION, myContents);
		String[] myContents2 = {"Harry Potter", "Hermione", "Ronald Wealsey", "Voldemort"};
		Book myBook2 = new Book("Chamber of Secrets", "J.K. Rowling", Genre.SCIENCE_FICTION, myContents2);
		String[] myContents3 = {"Harry Potter", "Hermione", "Ronald Wealsey", "Voldemort"};
		Book myBook3 = new Book("Prisoner of Azkaban", "J.K. Rowling", Genre.FANTASY, myContents3);

		// Create library and add books
		Library myLibrary = new Library();
		myLibrary.addBook(myBook);
		myLibrary.addBook(myBook2);
		myLibrary.addBook(myBook3);

		// Checkout book
		//Book mybook = myLibrary.checkoutBook("Sorcerer's Stone");
		Book mybook2 = myLibrary.checkoutBook("Prisoner of Azkaban");
		//myBook2.tearOutCurrentPage();
		//Book myBook3 = myLibrary.checkoutBook("Sorcerer's Stone");

		// Test listBooks
		for (String book : myLibrary.listBooks()) {
			System.out.println(book);
		}

		// Check available books
		System.out.println("\n" + "Check available books" + "\n");
		for (String book2 : myLibrary.listAvailableBooks()) {
			System.out.println(book2);
		}

		System.out.println("My percent complete is...");
		System.out.println(myBook2.getPercentComplete());

		// Return book
		System.out.println("\n" + "Returning " + myBook2.getTitle() + "\n");
		myLibrary.returnBook(mybook2);
		for (String book2 : myLibrary.listAvailableBooks()) {
			System.out.println(book2);
		}

	}
}
