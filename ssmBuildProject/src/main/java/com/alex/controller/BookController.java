package com.alex.controller;

import com.alex.pojo.Books;
import com.alex.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {
    //controller 层调service层

    @Autowired
//    @Qualifier("BookServiceImpl")
    private BookService bookService;

    //查询全部的书籍 并且返回到书籍展示页面
    @RequestMapping("/allBook")
    public  String list(Model model){
        List<Books> list=bookService.queryAllBook();
        model.addAttribute("list",list);
        return "allBook";
    }

}
