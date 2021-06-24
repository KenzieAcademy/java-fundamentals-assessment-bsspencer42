package com.kenzie.library;

public class gettingStarted {

	public static void main(String[] args) {

		// Class declaration
		class Book
		{
			// Instance variables
			private String title;
			private String author;
			private String genre;
			private String [] contents;
			
			// Constructor declaration of class
			public Book(String title, String author, String genre, String [] contents)
			{
				this.title = title;
				this.author = author;
				this.genre = genre;
				this.contents = contents;
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
			
			// Getter for FirstPage
			public getNumPages() {
				return contents.length;
			}
			
		}
		
		String [] myContents = { "I", "Love", "Reading" };
		Book myBook = new Book("Sorcerer's Stone","J.K. Rowling","SciFi", myContents);
		System.out.println(myContents		.getNumPages());
		
		
		
	}

}
