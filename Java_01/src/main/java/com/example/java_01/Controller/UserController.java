package com.example.java_01.Controller;

import com.example.java_01.Mapper.UserMapper;
import com.example.java_01.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserMapper userMapper;

    //新增和修改
    @PostMapping
    public Integer save(@RequestBody User user){
        //新增或更新
        return userMapper.insert(user);
    }

    //查询所有数据
    @GetMapping
    public List<User> findAll(){
        List<User> all = userMapper.findAll();
        return all;
    }

    //删除数据
    @DeleteMapping("/{id}")
    public int delete(@PathVariable Integer id){
        return userMapper.deleteById(id);
    }

    //修改数据
    @PutMapping("/{id}")
    public int update(@RequestBody User user){
        return userMapper.update(user);
    }
}
