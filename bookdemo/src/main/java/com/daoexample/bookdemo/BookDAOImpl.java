package com.daoexample.bookdemo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BookDAOImpl implements BookDAO{
	
	private static List<Book> bkRepository = new ArrayList();
	
	public BookDAOImpl() {}
	
	public List<Book> AddBook(Book b){
		this.bkRepository.add(b);
		return bkRepository;
		//return getBkRepository();
	}
	public List<Book> RemoveBook(long id){
		Book tempBook = new Book();
		for (int i=0;i<bkRepository.size();i++) {
			tempBook = bkRepository.get(i);
			if(tempBook.getId() == id) {
				bkRepository.remove(i);
				break;
			}
		}
		return bkRepository;
		//return getBkRepository();
	}
	public List<Book> GetAllBooks(){
		return bkRepository;
	}
	public Book GetBookByName(String name){
		Book tempBook = new Book();
		for (int i=0;i<bkRepository.size();i++) {
			tempBook = bkRepository.get(i);
			if(tempBook.getName().equals(name)) {
				break;
			}
		}
		return tempBook;
	}
	public List<Book> GetBookByCategory(String category){
		List<Book> tempArray = new ArrayList();
		Book tempBook = new Book();
		for (int i=0;i<bkRepository.size();i++) {
			tempBook = bkRepository.get(i);
			if(tempBook.getCategory().equals(category)) {
				tempArray.add(tempBook);
			}
		}
		return tempArray;
	}

	public static List<Book> getBkRepository() {
		return bkRepository;
	}

	public static void setBkRepository(List<Book> bkRepository) {
		BookDAOImpl.bkRepository = bkRepository;
	}
	
	

}
