package com.daoexample.bookdemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookManagerImpl implements BookManager{

	@Autowired
	private BookDAO bookdao;
	
	public List<Book> CreateBook(Book b){
		return bookdao.AddBook(b);
	}
	public List<Book> DeleteBook(long id){
		return bookdao.RemoveBook(id);
	}
	public List<Book> GetAllBooks(){
		return bookdao.GetAllBooks();
	}
	public Book GetBookByName(String name) {
		return bookdao.GetBookByName(name);
	}
	public List<Book> GetBookByCategory(String category){
		return bookdao.GetBookByCategory(category);
	}
}
