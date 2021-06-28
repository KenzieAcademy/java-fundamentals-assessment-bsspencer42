package com.kenzie.library;

import java.util.LinkedList;

public class TestCases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] myContents = { "This is page one.", "Love", "Reading" };
		Book myBook = new Book("Sorcerer's Stone","J.K. Rowling",Genre.SCIENCE_FICTION, myContents);
		
		// Test case for private variable
		//System.out.println(myBook.getNumPages());
		System.out.println(myBook.openPage(3));
		//System.out.println(myBook.getNumPages());
		//System.out.println(myBook.tearOutCurrentPage());
		System.out.println(myBook.getCurrentPageNumber());
		System.out.println(myBook.openPage(2));
		//System.out.println(myBook.nextPage());
		System.out.println(myBook.getPercentageComplete());
		
		System.out.println(myBook.getGenre());
		
		Library myLibrary = new Library();
		myLibrary.addBook(myBook);
		
		
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
