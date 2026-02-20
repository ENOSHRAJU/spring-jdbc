package com.example.SpringDatabase.Service;

import com.example.SpringDatabase.Model.BookH2;
import com.example.SpringDatabase.Model.BookH2RowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import com.example.SpringDatabase.Repository.BookRepository;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookH2Service implements BookRepository {

    @Autowired
    private JdbcTemplate db;

    @Override
    public ArrayList<BookH2> getBooks() {
        List<BookH2> list = db.query("Select * from BookH2", new BookH2RowMapper());
        return new ArrayList<>(list);
    }

    public BookH2 getBook(int bookId) {
        try {
            return db.queryForObject("Select * from BookH2 where id = ?", new BookH2RowMapper(), bookId);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

    public BookH2 addBook(BookH2 book) {
        db.update("Insert into BookH2(id,name,author) Values (?,?,?)", book.getId(), book.getName(), book.getAuthor());
        return getBook(book.getId());
    }

    public BookH2 updateBook(int bookId, BookH2 book) {
        if(book.getName() != null) {
            db.update("Update BookH2 Set name = ? where id = ?", book.getName(), bookId);
        }

        if(book.getAuthor() != null) {
            db.update("Update BookH2 Set author = ? where id = ?", book.getAuthor(), bookId);
        }

        return getBook(bookId);
    }

    public String deleteBook(int id) {
        try {
            db.update("Delete from BookH2 where id = ?", id);
            return "Deleted Book: "+ id;
        } catch(Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }
}
