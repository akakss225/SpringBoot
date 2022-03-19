package com.example.helloworld.dto;

import com.example.helloworld.entity.Article;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;


@AllArgsConstructor
@ToString
public class ArticleForm {

    private String title;
    private String content;

    public Article toEntity() {
        return new Article(null, title, content);
    }
}
