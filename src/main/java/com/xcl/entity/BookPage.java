package com.xcl.entity;

import lombok.Data;

import java.util.List;
@Data
public class BookPage {
    private List<Book> data;
    private Integer total;
    private Integer pageSize;
}
