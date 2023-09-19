package com.example.book.controller;

import com.example.book.model.Book;
import com.example.book.service.BookServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.lang.annotation.Repeatable;

@RestController
@RequestMapping("/Books")
public class BookContro {

    @Autowired
    private BookServ bookServ;

    @PostMapping()
    public ResponseEntity<?> saveBook(@RequestBody Book book){
        return new ResponseEntity<>(bookServ.saveBooks(book), HttpStatus.CREATED);
    }

    @GetMapping()
    public ResponseEntity<?> getAllBooks(){
        return new ResponseEntity<>(bookServ.getAllBooks(),HttpStatus.FOUND);
    }
    @GetMapping("/{id}")
    public ResponseEntity<?> getBookById(@PathVariable Integer id){
        return new ResponseEntity<>(bookServ.getBookById(id),HttpStatus.FOUND);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteById(@PathVariable Integer id){
        return new ResponseEntity<>(bookServ.deleteBook(id),HttpStatus.OK);
    }
    @PutMapping("/{id}")
    public ResponseEntity<?> updateBook(@RequestBody Book book,@PathVariable Integer id){
        return new ResponseEntity<>(bookServ.updateBook(book,id),HttpStatus.OK);
    }



}
