package com.xcl.entity;

import lombok.Data;

@Data
public class Book {
    private Integer id;
    private String name;
    private String author;
    private String publish;
    private Double price;
    private Integer pages;
    private BookCase bookCase;
    private Integer bookcaseid;
}
