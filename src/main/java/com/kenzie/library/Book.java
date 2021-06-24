package com.kenzie.library;

public class Book {
	
	// Instance variables
	private String title;
	private String author;
	private String genre;
	private String [] contents;
	private int CurrentPageNumber;
	
	// Constructor declaration of class
	public Book(String title, String author, String genre, String [] contents)
	{
		this.title = title;
		this.author = author;
		this.genre = genre;
		this.contents = contents;
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
		return contents.length;
	}
	
	// Getter for nextPage
	// Not sure if need to handle no next page
	public int nextPage() {
		
		if (CurrentPageNumber+1 > contents.length-1) {
			return -1;
		}
		else {
			CurrentPageNumber = CurrentPageNumber + 1;
			return CurrentPageNumber + 1;
		}
	}
	
	// Getter for prevPage
	// Not sure if need to handle no next page
	public int prevPage() {
					
		if (CurrentPageNumber <= 0) {
			return -1;
			}
		else {
			CurrentPageNumber = CurrentPageNumber - 1;
			return CurrentPageNumber+1;
			}
	}
				
}
