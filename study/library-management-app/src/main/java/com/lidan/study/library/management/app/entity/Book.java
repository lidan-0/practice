package com.lidan.study.library.management.app.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 实体类
 * 书的相关信息
 */
@Data
@Entity
public class Book implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    private Integer id;
    @Column(nullable = false, unique = true, length = 32)
    private String name;
    private String author;
    private String content;


}
