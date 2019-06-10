package io.yzecho.springbootvuedemo.mapper;

import io.yzecho.springbootvuedemo.model.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface UserMapper {
    @Insert("insert into user(username,password) values(#{name},#{password})")
    int add(User user);

    @Update("update user set username = #{username}, password = #{password} where id = #{id}")
    int update(User user);

    @Delete("delete from user where id = #{id}")
    int deleteById(Integer id);

    @Select("select id,username,password from user where id = #{id}")
    @Results(value = {
            @Result(property = "id", column = "id", javaType = Integer.class),
            @Result(property = "age", column = "age", javaType = Integer.class),
            @Result(property = "name", column = "name", javaType = String.class)
    })
    User queryUserById(Integer id);

    @Select("select id,username,password from user")
    @Results(value = {
            @Result(property = "id", column = "id", javaType = Integer.class),
            @Result(property = "username", column = "name", javaType = String.class),
            @Result(property = "password", column = "password", javaType = String.class)
    })
    List<User> queryAllUser();
}
