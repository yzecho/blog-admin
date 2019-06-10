package io.yzecho.springbootvuedemo.service;

import io.yzecho.springbootvuedemo.model.Article;

import java.util.List;

public interface ArticleService {

    //文章列表
    List<Article> articleList();

    //新增文章
    void addArticle(Article article);

    //编辑文章
    void editArticle(Article article);

    //删除文章
    void deleteArticle(Integer id);

    //文章详情
    Article showArticleById(Integer id);
}
