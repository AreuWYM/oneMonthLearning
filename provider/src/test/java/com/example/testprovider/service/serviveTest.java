package com.example.testprovider.service;

import com.example.testprovider.Entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;

@SpringBootTest
public class serviveTest {
    @Autowired UserService userService;
    @Test
    public void addUserTest(){

        User user = new User().setName("zhangliangyin").setCreatedTime(new Date());
        userService.addUser(user);

    }

    @Test
    public void deleteUserTest(){
        userService.deleteUserById("3");

    }

    @Test
    public void updateUserTest(){
        User user = new User().setName("wusong").setCreatedTime(new Date());
        userService.updateUser(user);

    }

    @Test
    public void getUserTest(){
        List<User> users = userService.getAllUsers();
        System.out.println(users);

    }

    @Test
    public void getUser(){
        // 模糊查询 并排序
        List<User> users = userService.listUserNameLike("wuson");
        System.out.println(users);
    }

    @Test
    public  void listUserByNameAndVolume(){
        //通过名字查询 限制id<5 ，限制查询结果数量
        List<User> users = userService.listUserByNameAndVolume("wusong", 1);
        System.out.println(users);
    }


    @Test
    public void tranctionTest(){
        //添加事务，回滚测试
        userService.updateNameById("wusong" );
    }




}
