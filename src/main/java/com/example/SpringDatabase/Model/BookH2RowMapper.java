package com.example.SpringDatabase.Model;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BookH2RowMapper implements RowMapper<BookH2> {
    @Override
    public BookH2 mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new BookH2(rs.getInt("id"), rs.getString("name"), rs.getString("author"));
    }
}
