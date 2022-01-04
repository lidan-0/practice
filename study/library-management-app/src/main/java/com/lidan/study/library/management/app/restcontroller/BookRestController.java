package com.lidan.study.library.management.app.restcontroller;

import com.lidan.study.library.management.app.entity.Book;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * rest接口
 * 管理图书类
 */
@RestController
public class BookRestController {

    @RequestMapping("/book/show")
    public Book showBook() {
        Book book = new Book();
        book.setConent("大家好才是真的好");
        book.setId(1);
        book.setAuthor("李旦");
        book.setName("随便说说");
        return book;
    }
}
