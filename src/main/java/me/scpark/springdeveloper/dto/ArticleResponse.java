package me.scpark.springdeveloper.dto;

import lombok.Getter;
import me.scpark.springdeveloper.dao.Article;

@Getter
public class ArticleResponse {

    private Long id;
    private String title;
    private String content;

    public ArticleResponse(Article article) {
        this.id = article.getId();
        this.title = article.getTitle();
        this.content = article.getContent();
    }
}