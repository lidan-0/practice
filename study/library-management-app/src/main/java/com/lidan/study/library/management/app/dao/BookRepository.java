package com.lidan.study.library.management.app.dao;

import com.lidan.study.library.management.app.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 图书数据库层
 */
public interface BookRepository extends JpaRepository<Book,Integer> {
    Book findByname(String name);
}
