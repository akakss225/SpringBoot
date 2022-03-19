package com.example.helloworld.controller;

import com.example.helloworld.dto.ArticleForm;
import com.example.helloworld.entity.Article;
import com.example.helloworld.repository.ArticleRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j // 로깅을 위한 어노테이션
public class ArticleController {

    @Autowired // 의존성 주입
    private ArticleRepository articleRepository;

    @GetMapping("/articles/new")
    public String newArticleForm(){
        return "articles/new";
    }

    @PostMapping("/articles/create")
    public String createArticle(ArticleForm form){

//        로깅기능으로 대체해야함 >> sout은 서버성능 저하를 초래함
//        System.out.println(form.toString());
        log.info(form.toString());


        // 1. DTO 를 Entity로 변환
        Article article = form.toEntity();

//        System.out.println(article.toString());
        log.info(article.toString());

        // 2. Repository 에게 Entity를 저장하게 함.
        Article saved = articleRepository.save(article);
//        System.out.println(saved.toString());
        log.info(saved.toString());

        return "";
    }
}
