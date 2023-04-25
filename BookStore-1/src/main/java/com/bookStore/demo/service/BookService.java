package com.bookStore.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookStore.demo.dao.BookRepository;
import com.bookStore.demo.model.Book;


@Service
public class BookService
{
	@Autowired
	BookRepository bkRepository;

	public List<Book> getAll()
	{
		List<Book> bkList = bkRepository.findAll();
		return bkList;
	}
	
	public Book save(Book s)
	{
		Book obj = bkRepository.save(s);
		return obj;
	}
	
	public Book update(Book s)
	{
		Book obj=bkRepository.save(s);
		return obj;
	}
	public void delete(int billno)
	{
		bkRepository.deleteById(billno);
	}
	public Book get(int billno)
	{
		Book s=bkRepository.findById(billno).get();
		return s;
	}

}