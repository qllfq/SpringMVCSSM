package com.qiao.dao;

import com.qiao.pojo.Books;

import java.util.List;

public interface BookMapper {
    int addBook(Books book);
    int deleteBookById(int id);
    int updateBook(Books book);
    Books selectBookById(int id);
    List<Books> selectAllBooks();
}
