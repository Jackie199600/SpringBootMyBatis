package com.xcl.entity;

import lombok.Data;

import java.util.List;


@Data
public class BorrowVo {
   private List<Integer> values;
   private List<String> names;
}
