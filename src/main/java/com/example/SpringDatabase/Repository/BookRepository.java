package com.example.SpringDatabase.Repository;

import com.example.SpringDatabase.Model.BookH2;
import java.util.ArrayList;

public interface BookRepository {
    ArrayList<BookH2> getBooks();
    BookH2 getBook(int bookId);
    BookH2 addBook(BookH2 book);
    BookH2 updateBook(int bookId, BookH2 book);
}
