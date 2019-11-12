package com.xcl.controller;

import com.xcl.entity.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/Test")
public class TestController {

    @RequestMapping("/findAll/{currentPage}")
    private List<User> findAll(@PathVariable("currentPage") Integer id){
        List<User> list =new ArrayList<>();
        switch(id){
            case 1:
                list.add(new User(new Date(),"张三","华旗国际"));
                list.add(new User(new Date(),"李四","华旗国际"));
                list.add(new User(new Date(),"王五","华旗国际"));
                list.add(new User(new Date(),"小张","华旗国际"));
                break;
            case 2:
                list.add(new User(new Date(),"张三2","华旗国际"));
                list.add(new User(new Date(),"李四2","华旗国际"));
                list.add(new User(new Date(),"王五2","华旗国际"));
                list.add(new User(new Date(),"小张2","华旗国际"));
                break;
            case 3:
                list.add(new User(new Date(),"张三3","华旗国际"));
                list.add(new User(new Date(),"李四3","华旗国际"));
                list.add(new User(new Date(),"王五3","华旗国际"));
                list.add(new User(new Date(),"小张3","华旗国际"));
                break;
        }

        return  list;
    }
}
