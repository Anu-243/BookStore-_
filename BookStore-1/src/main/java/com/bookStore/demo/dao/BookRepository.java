package com.bookStore.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookStore.demo.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book,Integer>{

}
