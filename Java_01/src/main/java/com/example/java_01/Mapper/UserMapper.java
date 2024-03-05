package com.example.java_01.Mapper;

import com.example.java_01.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("select * from sys_user")
    List<User> findAll();

    @Insert("INSERT into sys_user(username,password) VALUES(#{username},#{password})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insert(User user);

    @Update("update sys_user set username = #{username},password = #{password} where id = #{id}")
    int update(User user);


    @Delete("delete from sys_user where id = #{id}")
    int deleteById(@Param("id") Integer id);
}
