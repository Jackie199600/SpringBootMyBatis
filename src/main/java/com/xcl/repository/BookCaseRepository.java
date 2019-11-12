package com.xcl.repository;

import com.xcl.entity.BookCase;
import java.util.List;


public interface BookCaseRepository {
    public BookCase findById(Integer id);
    public List<BookCase> findAll();
}
