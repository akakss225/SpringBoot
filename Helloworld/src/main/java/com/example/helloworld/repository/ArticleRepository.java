package com.example.helloworld.repository;

import com.example.helloworld.entity.Article;
import org.springframework.data.repository.CrudRepository;

public interface ArticleRepository extends CrudRepository<Article, Long> {


}
