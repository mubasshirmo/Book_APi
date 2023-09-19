package com.example.book.model;

import jakarta.persistence.*;

@Entity
@Table(name = "bookAuth")
public class BookAuth {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int authid;
    @Column(name = "authName")
    private String authName;
    @Column(name = "publication")
    private String publication;



    public int getauthId() {
        return authid;
    }

    public void setId(int id) {
        this.authid = authid;
    }

    public String getAuthName() {
        return authName;
    }

    public void setAuthName(String authName) {
        this.authName = authName;
    }

    public String getPublication() {
        return publication;
    }

    public void setPublication(String publication) {
        this.publication = publication;
    }
}
