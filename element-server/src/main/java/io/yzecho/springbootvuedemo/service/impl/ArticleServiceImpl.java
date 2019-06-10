package io.yzecho.springbootvuedemo.service.impl;

import io.yzecho.springbootvuedemo.mapper.ArticleMapper;
import io.yzecho.springbootvuedemo.model.Article;
import io.yzecho.springbootvuedemo.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("articleService")
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleMapper articleMapper;
    @Override
    public List<Article> articleList() {
        return articleMapper.articleList();
    }

    @Override
    public void addArticle(Article article) {
        articleMapper.addArticle(article);
    }

    @Override
    public void editArticle(Article article) {
        articleMapper.editArticle(article);
    }

    @Override
    public void deleteArticle(Integer id) {
        articleMapper.deleteArticle(id);
    }

    @Override
    public Article showArticleById(Integer id) {
        return articleMapper.showArticleById(id);
    }
}
