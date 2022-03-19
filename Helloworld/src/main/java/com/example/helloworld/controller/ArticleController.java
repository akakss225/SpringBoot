package com.example.helloworld.controller;

import com.example.helloworld.dto.ArticleForm;
import com.example.helloworld.entity.Article;
import com.example.helloworld.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ArticleController {

    @Autowired // 의존성 주입
    private ArticleRepository articleRepository;

    @GetMapping("/articles/new")
    public String newArticleForm(){
        return "articles/new";
    }

    @PostMapping("/articles/create")
    public String createArticle(ArticleForm form){
        System.out.println(form.toString());

        // 1. DTO 를 Entity로 변환
        Article article = form.toEntity();

        System.out.println(article.toString());

        // 2. Repository 에게 Entity를 저장하게 함.
        Article saved = articleRepository.save(article);
        System.out.println(saved.toString());

        return "";
    }
}
