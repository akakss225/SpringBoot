package com.example.helloworld.entity;

import lombok.AllArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@ToString
public class Article {

    @Id
    @GeneratedValue // 1, 2, 3, --- 자동생성 어노테이션
    private Long id;

    @Column
    private String title;

    @Column
    private String content;


}
