package com.daoexample.bookdemo;

import java.util.List;

public interface BookDAO {
	
	public List<Book> AddBook(Book b);
	public List<Book> RemoveBook(long id);
	public List<Book> GetAllBooks();
	public Book GetBookByName(String name);
	public List<Book> GetBookByCategory(String category);

}
