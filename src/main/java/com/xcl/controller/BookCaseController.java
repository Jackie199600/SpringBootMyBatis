package com.xcl.controller;

import com.xcl.entity.BookCase;
import com.xcl.repository.BookCaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/bookCase")
public class BookCaseController {
    @Autowired
    private BookCaseRepository bookCaseRepository;

    @GetMapping("/findAll")
    public List<BookCase> findAll(){
        return bookCaseRepository.findAll();
    }
}
