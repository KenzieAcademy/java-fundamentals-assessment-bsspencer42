package com.kenzie.library;

public class TestCases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] myContents = { "I", "Love", "Reading" };
		Book myBook = new Book("Sorcerer's Stone","J.K. Rowling","SciFi", myContents);
		
		// Test case for private variable
		System.out.println(myBook.getTitle());
		
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
