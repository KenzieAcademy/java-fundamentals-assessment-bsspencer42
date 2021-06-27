package com.kenzie.library;
import java.util.ArrayList;
import java.util.Collections;

public class Book {
	
	// Instance variables
	private String title;
	private String author;
	private String genre;
	private ArrayList<String> contents;
	private int CurrentPageNumber;
	
	// Constructor declaration of class
	public Book(String title, String author, String genre, String[] contents)
	{
		//Create ArrayList from string list argument
		ArrayList<String> myList = new ArrayList<>();
		Collections.addAll(myList,contents);
		
		// Assign instance variable initial values
		this.title = title;
		this.author = author;
		this.genre = genre;
		this.contents = myList;
		this.CurrentPageNumber = 0;
	}
	
	// Getter for title
	public String getTitle() {
		return title;
	}
	
	// Getter for author
	public String getAuthor() {
		return author;
	}
	
	// Getter for genre
	// This is somehow linked to library *return later*
	public String getGenre() {
		return genre;
	}
	
	// Getter for CurrentPageNumber
	public int getCurrentPageNumber() {
		return CurrentPageNumber + 1;
	}
	
	
	// Getter for NumPages
	public int getNumPages() {
		return contents.size();
	}
	
	public String openPage(int pageNumber) {
		return contents.get(pageNumber-1);
	}
	
	/*
	// Getter for nextPage
	// Not sure if need to handle no next page
	public String nextPage() {
		
		if (CurrentPageNumber+1 > contents.length-1) {
			return null;
		}
		else {
			CurrentPageNumber = CurrentPageNumber + 1;
			return contents[CurrentPageNumber];
		}
	}
	
	// Getter for prevPage
	// Not sure if need to handle no next page
	public String prevPage() {
					
		if (CurrentPageNumber <= 0) {
			return null;
			}
		else {
			CurrentPageNumber = CurrentPageNumber - 1;
			return contents[CurrentPageNumber];
			}
	}
	*/
				
}
