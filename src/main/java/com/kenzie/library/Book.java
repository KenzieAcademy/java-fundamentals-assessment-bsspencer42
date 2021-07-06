package com.kenzie.library;
import java.util.ArrayList;
import java.util.Collections;

// Create book class with override for compareTo method to specify how objects are sorted
public class Book implements Comparable<Book> {
	
	// Instance variables
	private String title;
	private String author;
	private Genre genre;
	private ArrayList<String> contents;
	private int CurrentPageNumber;
	
	// Constructor declaration of class
	public Book(String title, String author, Genre genre, String[] contents)
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

	// Override for compareTo method - Sort by title
	public int compareTo(Book book) {
		return this.title.compareTo(book.title);
	}

		// Getter for CurrentPageNumber
		public int getCurrentPageNumber() {
			return CurrentPageNumber;
		}
		
		// Getter for nextPage
		public String nextPage() {
			
			if (CurrentPageNumber+1 > contents.size()-1) {
				return null;
			}
			else {
				CurrentPageNumber = CurrentPageNumber + 1;
				return contents.get(CurrentPageNumber);
			}
		}
		
		// Getter for prevPage
		public String prevPage() {
						
			if (CurrentPageNumber <= 0) {
				return null;
				}
			else {
				CurrentPageNumber = CurrentPageNumber - 1;
				return contents.get(CurrentPageNumber);
				}
		}
	
		// Method to return contents of specific page
		public String openPage(int pageNumber) {
			// Save current page number to the opened page
			CurrentPageNumber = pageNumber;
			return contents.get(pageNumber);
		}
		
		// Method to remove specific page
		public String tearOutCurrentPage() {
			
			// Local variable to hold removed page contents before removing
			String removedPageContents = contents.get(CurrentPageNumber);
			// This is why I cast the original string into an ArrayList. Makes life easier.
			contents.remove(CurrentPageNumber);
			
			// Handles exception case where last page is page removed (resets pointer to previous page)
			if (CurrentPageNumber > contents.size() -1) {
				CurrentPageNumber--;
			}
			// Return removed page contents
			return removedPageContents;
		}
		
		// Getter for NumPages
		public int getNumPages() {
			return contents.size();
		}
		
		// Method for percent complete
		public int getPercentComplete() {
			
			// Local variables of type double for current page and total pages
			double localPageNum = CurrentPageNumber;
			double localTotalPages = (double) contents.size()-1.0;
			
			// Calculate percent complete and cast to int
			return (int) Math.round(localPageNum / localTotalPages * 100);
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
		public Genre getGenre() {
			return genre;
		}
			
}
