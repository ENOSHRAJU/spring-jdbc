package com.example.SpringDatabase.Model;

public class BookH2 {

    private int id;
    private String name;
    private String author;

    public BookH2(int id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return this.id;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public String getAuthor() {
        return this.author;
    }
 }
