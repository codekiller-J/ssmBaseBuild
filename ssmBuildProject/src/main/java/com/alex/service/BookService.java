package com.alex.service;


import com.alex.pojo.Books;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface BookService {
    //增加一本书
    int addBook(Books books);

    //删除一本书
    int delteBookById(int id);

    //更新一本书
    int updateBook(Books books);

    //查询一本书
    Books queryBookById(int id);

    //查询全部的书
    List<Books> queryAllBook();


}