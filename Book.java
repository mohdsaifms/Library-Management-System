package library_ManSystem;


	import java.util.ArrayList;
	import java.util.List;
	import java.util.Scanner;

	class Book {
	    private int bookId;
	    private String title;
	    private String author;

	    public Book(int bookId, String title, String author) {
	        this.bookId = bookId;
	        this.title = title;
	        this.author = author;
	    }

	    public int getBookId() {
	        return bookId;
	    }

	    public String getTitle() {
	        return title;
	    }

	    public String getAuthor() {
	        return author;
	    }

	    @Override
	    public String toString() {
	        return "Book ID: " + bookId + ", Title: " + title + ", Author: " + author;
	    }

		public int getBookId1() {
			// TODO Auto-generated method stub
			return 0;
		}
	}

	