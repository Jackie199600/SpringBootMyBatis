package com.xcl.repository;

import com.xcl.entity.Book;
import com.xcl.entity.Borrow;

import java.util.List;

public interface BookRepository {
    public List<Book> findAll();
    public List<Book> findByPage(Integer index,Integer limit);
    public Integer count();
    public Book findById(Integer id);
    public void add(Book book);
    public void deleteById(Integer id);
    public void update(Book book);
    public List<Borrow> findAllBorrow();
}
