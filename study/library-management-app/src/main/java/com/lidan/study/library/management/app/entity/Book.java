package com.lidan.study.library.management.app.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 实体类
 * 书的相关信息
 */
@Data
public class Book implements Serializable {
    private Integer id;
    private String name;
    private String author;
    private String conent;
}
