package com.example.testprovider.controller;

import com.example.testprovider.Entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.testprovider.mapper.UserMapper;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/providerEnhance/")
public class ProviderMybatisController {
    /*在控制器域代码声明Mapper类型*/
    @Autowired
    private UserMapper UserMapper;

    @RequestMapping("add")
    public int testInsert() throws Exception {
        int id, num = 0;
        UserEntity u = new UserEntity(0, "刘备", "大哥", new Date());
        num = UserMapper.insert(u);
        id = u.getId();
        System.out.println("新增数据完成 id=" + id + ",num=" + num);
        return num;
    }

    @RequestMapping("get/{id}")
    public UserEntity testQueryOne(@PathVariable("id") int id) throws Exception {
        UserEntity UserEntity = UserMapper.getEntity(id);
        System.out.println(UserEntity.toString());
        return UserEntity;
    }

    @RequestMapping("getlist")
    public List<UserEntity> testQuery() throws Exception {
        List<UserEntity> UserEntitys = UserMapper.getAll();
        System.out.println(UserEntitys.toString());
        return UserEntitys;
    }

    @RequestMapping("edit")
    public int testUpdate(int id, String name, String desc) throws Exception {
        int num = 0;
        UserEntity UserEntity = UserMapper.getEntity(id);
        if (null != UserEntity && UserEntity.getId() > 0) {
            System.out.println(UserEntity.toString());
            UserEntity.setName(name);
            UserEntity.setDesc(desc);
            num = UserMapper.update(UserEntity);
        }
        return num;
    }

    @RequestMapping("del")
    public int testDelete(int id) throws Exception {
        int num = 0;
        if (id > 0) {
            num = UserMapper.delete(id);
        }
        return num;
    }
}