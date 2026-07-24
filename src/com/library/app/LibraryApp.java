package com.library.app;

import com.library.books.Library;
import com.library.staff.Librarian;

public class LibraryApp {
	public static void main(String[] args) {

		Library library=new Library();
		Librarian librariyan=new Librarian();
		
		library.setLibraryName("Gandhi library");
		library.setTotalBooks(1000);
		library.showLibraryDetails();
		System.out.println("-----------------");
		
		
		librariyan.setLibrarianName("Nehru");
		librariyan.setYearsofExp(3);
		librariyan.showLibrarianInfo();
		
		
		
	}
}
