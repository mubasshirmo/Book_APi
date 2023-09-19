package com.example.book.service;

import com.example.book.dao.BookRepo;
import com.example.book.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class BookServImple implements BookServ{

    @Autowired
    private BookRepo bookRepo;

    @Override
    public Book saveBooks(Book book) {
        return bookRepo.save(book);
    }

    @Override
    public List<Book> getAllBooks() {
        return bookRepo.findAll();
    }

    @Override
    public Book getBookById(Integer id) {
        return bookRepo.findById(id).get();
    }

    @Override
    public String deleteBook(Integer id) {
       Book book=bookRepo.findById(id).get();
       if(book!=null){
           bookRepo.deleteById(id);
           return "Deleted sucessfully";
       }
        return "Incorrect Id";
    }

    @Override
    //update the book
    public Book updateBook(Book book, Integer id) {
    Book existingbook=bookRepo.findById(id).get();
    if(existingbook!=null){
        existingbook.setBook_name(book.getBook_name());
        existingbook.setBookAuth(book.getBookAuth());
        existingbook.setIssue(book.isIssue());

    }
    return null;
    }
}
