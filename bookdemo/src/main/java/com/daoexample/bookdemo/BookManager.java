package com.daoexample.bookdemo;

import java.util.List;

public interface BookManager {
	
	public List<Book> CreateBook(Book b);
	public List<Book> DeleteBook(long id);
	public List<Book> GetAllBooks();
	public Book GetBookByName(String name);
	public List<Book> GetBookByCategory(String category);

}
