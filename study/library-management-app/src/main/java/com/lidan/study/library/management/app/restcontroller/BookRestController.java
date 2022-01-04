package com.lidan.study.library.management.app.restcontroller;

import com.lidan.study.library.management.app.dao.BookRepository;
import com.lidan.study.library.management.app.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * rest接口
 * 管理图书类
 */
@RestController
public class BookRestController {

    @Autowired
    private BookRepository bookRepository;

    @RequestMapping("/getAllbook")
    @ResponseBody
    public List<Book> findAll() {
        List<Book> list = new ArrayList<Book>();
        list = bookRepository.findAll();
        return list;
    }

    @RequestMapping("/getByName")
    @ResponseBody
    public Book getByUserName(String name) {
        Book book = bookRepository.findByname(name);
        return book;
    }

}
