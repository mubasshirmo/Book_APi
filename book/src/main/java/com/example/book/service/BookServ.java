package com.example.book.service;

import com.example.book.model.Book;

import java.util.List;

public interface BookServ {


    public Book saveBooks(Book book);

    public List<Book> getAllBooks();

    public Book getBookById(Integer id);

    public String deleteBook(Integer id);

    public Book updateBook(Book book,Integer id);
}
