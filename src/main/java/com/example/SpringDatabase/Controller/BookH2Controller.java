package com.example.SpringDatabase.Controller;

import com.example.SpringDatabase.Model.BookH2;
import com.example.SpringDatabase.Service.BookH2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class BookH2Controller {

    @Autowired
    BookH2Service service;

    @GetMapping("/books")
    public ArrayList<BookH2> getBooks() {
        return service.getBooks();
    }

    @GetMapping("/books/{bookId}")
    public BookH2 getBook(@PathVariable("bookId") int bookId) {
        return service.getBook(bookId);
    }

    @PostMapping("/books")
    public BookH2 addBook(@RequestBody BookH2 book) {
        return service.addBook(book);
    }

    @PutMapping("/books/{bookId}")
    public BookH2 updateBook(@PathVariable("bookId") int bookId, @RequestBody BookH2 book) {
        return service.updateBook(bookId, book);
    }

    @DeleteMapping("/books/{id}")
    public String deleteBook(@PathVariable("id") int id) {
        return service.deleteBook(id);
    }
}
