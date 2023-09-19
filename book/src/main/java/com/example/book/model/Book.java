package com.example.book.model;

import jakarta.persistence.*;

@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private int id;

    @Column(name = "Book_name")
    private String Book_name;
    @OneToOne(cascade = CascadeType.ALL)
    private BookAuth bookAuth;
    @Column(name = "issue")
    private boolean issue;

    public Book(int id, String book_name, BookAuth bookAuth, boolean issue) {
        this.id = id;
        Book_name = book_name;
        this.bookAuth = bookAuth;
        this.issue = issue;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBook_name() {
        return Book_name;
    }

    public void setBook_name(String book_name) {
        Book_name = book_name;
    }

    public BookAuth getBookAuth() {
        return bookAuth;
    }

    public void setBookAuth(BookAuth bookAuth) {
        this.bookAuth = bookAuth;
    }

    public boolean isIssue() {
        return issue;
    }

    public void setIssue(boolean issue) {
        this.issue = issue;
    }
}
