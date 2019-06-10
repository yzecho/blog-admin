package io.yzecho.springbootvuedemo.controller;

import io.yzecho.springbootvuedemo.model.Article;
import io.yzecho.springbootvuedemo.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ArticleController {
    @Autowired
    private ArticleService articleService;

    @CrossOrigin
    @GetMapping("/articles")
    public List<Article> articleList() {
        return articleService.articleList();
    }

    @CrossOrigin
    @PostMapping("/articles")
    public void addArticle(@RequestBody Article article) {
        articleService.addArticle(article);
    }

    @CrossOrigin
    @PutMapping("/articles/{id}")
    public void editArticle(@PathVariable(value = "id") Integer id, @RequestBody Article article) {
        articleService.editArticle(article);
    }

    @CrossOrigin
    @DeleteMapping("/articles/{id}")
    public void deleteArticle(@PathVariable(value = "id") Integer id) {
        articleService.deleteArticle(id);
    }

    @CrossOrigin
    @GetMapping("/articles/{id}")
    public Article showArticleById(@PathVariable(value = "id") Integer id) {
        return articleService.showArticleById(id);
    }
}
