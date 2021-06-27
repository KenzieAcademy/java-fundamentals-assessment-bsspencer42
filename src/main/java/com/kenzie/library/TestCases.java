package com.kenzie.library;

import java.util.LinkedList;

public class TestCases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] myContents = { "This is page one.", "Love", "Reading" };
		Book myBook = new Book("Sorcerer's Stone","J.K. Rowling","SciFi", myContents);
		
		// Test case for private variable
		//System.out.println(myBook.getNumPages());
		System.out.println(myBook.openPage(1));
		
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
