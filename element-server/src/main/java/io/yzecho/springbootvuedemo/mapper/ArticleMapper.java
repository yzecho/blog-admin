package io.yzecho.springbootvuedemo.mapper;

import io.yzecho.springbootvuedemo.model.Article;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface ArticleMapper {
    @Insert("insert into article(title, body) values(#{title}, #{body})")
    void addArticle(Article article);

    @Select("select id, title, body from Article")
    @Results(value = {
            @Result(property = "id", column = "id", javaType = Integer.class),
            @Result(property = "title", column = "title", javaType = String.class),
            @Result(property = "body", column = "body", javaType = String.class)
    })
    List<Article> articleList();

    @Update("update article set title = #{title}, body = #{body} where id = #{id}")
    void editArticle(Article article);

    @Delete("delete from article where id = #{id}")
    void deleteArticle(Integer id);

    @Select("select id, title, body from article where id = #{id}")
    @Results(value = {
            @Result(property = "id", column = "id", javaType = Integer.class),
            @Result(property = "title", column = "title", javaType = String.class),
            @Result(property = "body", column = "body", javaType = String.class)
    })
    Article showArticleById(Integer id);
}
