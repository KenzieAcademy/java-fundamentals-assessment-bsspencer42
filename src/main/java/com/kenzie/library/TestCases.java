package com.kenzie.library;

import java.util.LinkedList;

public class TestCases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// My book
		String [] myContents = { "This is page one.", "This is page two", "Roses are red", "Tohmy is a Who"};
		Book myBook = new Book("Sorcerer's Stone","J.K. Rowling",Genre.SCIENCE_FICTION, myContents);
		String [] myContents2 = { "Harry Potter", "Hermione", "Ronald Wealsey", "Voldemort"};
		Book myBook2 = new Book("Chamber of Secrets","J.K. Rowling",Genre.SCIENCE_FICTION, myContents2);
		String [] myContents3 = { "Harry Potter", "Hermione", "Ronald Wealsey", "Voldemort"};
		Book myBook3 = new Book("Prisoner of Azkaban","J.K. Rowling",Genre.FANTASY, myContents3);
		
		Library myLibrary = new Library();
		myLibrary.addBook(myBook);
		myLibrary.addBook(myBook2);
		myLibrary.addBook(myBook3);
		Book mybook = myLibrary.checkoutBook("Sorcerer's Stone");
		//myBook2.tearOutCurrentPage();
		//Book myBook3 = myLibrary.checkoutBook("Sorcerer's Stone");
		for (String book : myLibrary.listBooks()) {
			System.out.println(book);
		}
		
		System.out.println("\n");
		
		for (String book : myLibrary.listBooks(Genre.SCIENCE_FICTION)) {
			System.out.println(book);
		}
		
		
		
		
		// Test script for next/prev page
		
		/*
		System.out.println("Current page: " + myBook.getCurrentPageNumber() + " Next page:" + myBook.nextPage());
		System.out.println("Current page: " + myBook.getCurrentPageNumber() + " Next page:" + myBook.nextPage());
		System.out.println("Current page: " + myBook.getCurrentPageNumber() + " Next page:" + myBook.nextPage());
		System.out.println("Current page: " + myBook.getCurrentPageNumber() + " Next page:" + myBook.prevPage());
		System.out.println("Current page: " + myBook.getCurrentPageNumber() + " Next page:" + myBook.prevPage());
		System.out.println("Current page: " + myBook.getCurrentPageNumber() + " Next page:" + myBook.prevPage());
		*/
		
		
		}
	}
