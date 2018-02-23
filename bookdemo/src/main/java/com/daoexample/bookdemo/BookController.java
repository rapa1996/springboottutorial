package com.daoexample.bookdemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/")
public class BookController {
	
	@Autowired
	private BookManager bookManager;
	
	@RequestMapping(value = "addbook", method = RequestMethod.POST)
	public List<Book> AddBook(@RequestBody Book b){
		return bookManager.CreateBook(b);
	}
	
	@RequestMapping(value = "deletebook", method = RequestMethod.POST)
	public List<Book> DeleteBook(@RequestBody long id){
		return bookManager.DeleteBook(id);
	}
	
	@RequestMapping(value = "books", method = RequestMethod.GET)
	public List<Book> GetBooks(){
		return bookManager.GetAllBooks();
	}
	
	@RequestMapping(value = "getbyname", method = RequestMethod.GET)
	public Book GetByName(@RequestParam String name){
		return bookManager.GetBookByName(name);
	}

	@RequestMapping(value = "getbycategory", method = RequestMethod.POST)
	public List<Book> GetByCategory(@RequestParam String category){
		return bookManager.GetBookByCategory(category);
	}

}
