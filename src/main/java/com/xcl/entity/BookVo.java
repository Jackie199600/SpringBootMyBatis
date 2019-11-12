package com.xcl.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class BookVo {
    private Book book;
    private List<BookCase> list;

}
