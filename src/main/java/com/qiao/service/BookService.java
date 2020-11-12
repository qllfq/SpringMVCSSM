package com.qiao.service;

import com.qiao.pojo.Books;

import java.util.List;

public interface BookService {
    int addBook(Books book);
    int deleteBookById(int id);
    int updateBook(Books book);
    Books selectBookById(int id);
    List<Books> selectAllBooks();
}
