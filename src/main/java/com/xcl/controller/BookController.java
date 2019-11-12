package com.xcl.controller;

import com.xcl.entity.*;
import com.xcl.repository.BookCaseRepository;
import com.xcl.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private BookCaseRepository bookCaseRepository;

    @RequestMapping("/findAll/{currentPage}")
    public List<Book> findAll(@PathVariable("currentPage") Integer currentPage) {
        List<Book> list = new ArrayList<>();
        list = bookRepository.findAll();
        return list;
    }

    @GetMapping("/findByPage/{page}")
    @ResponseBody
    public BookPage findByPage(@PathVariable("page") Integer page) {
        Integer limit = 5;
        Integer index = (page - 1) * limit;
        BookPage bookPage = new BookPage();
        bookPage.setData(bookRepository.findByPage(index, limit));
        bookPage.setPageSize(limit);
        bookPage.setTotal(bookRepository.count());
        return bookPage;
    }

    @GetMapping("/findById/{id}")
    @ResponseBody
    public BookVo findById(@PathVariable("id") Integer id) {
        Book book = bookRepository.findById(id);
        List<BookCase> list = bookCaseRepository.findAll();
        return new BookVo(book, list);
    }

    @PutMapping("/update")
    @ResponseBody
    public String update(@RequestBody Book book) {
        bookRepository.update(book);
        return "success";
    }

    @DeleteMapping("/deleteById/{id}")
    @ResponseBody
    public String deleteById(@PathVariable("id") Integer id) {
        bookRepository.deleteById(id);
        return "success";
    }

    @PostMapping("/add")
    @ResponseBody
    public String add(@RequestBody Book book) {
        bookRepository.add(book);
        return "success";
    }

    @GetMapping("/findBarData")
    @ResponseBody
    public BorrowVo findBarData() {
        List<Borrow> list = bookRepository.findAllBorrow();
        List<String> names = new ArrayList<>();
        List<Integer> values = new ArrayList<>();
        for (Borrow borrow : list) {
            names.add(borrow.getName());
            values.add(borrow.getValue());
        }
        BorrowVo borrowVo = new BorrowVo();
        borrowVo.setNames(names);
        borrowVo.setValues(values);
        return borrowVo;
    }

    @GetMapping("/findPieData")
    @ResponseBody
    public List<Borrow> findPieData() {
        return bookRepository.findAllBorrow();
    }

}
