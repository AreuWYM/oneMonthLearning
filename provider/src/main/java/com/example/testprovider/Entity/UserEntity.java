package com.example.testprovider.Entity;

import lombok.Data;

import java.util.Date;

@Data
public class UserEntity {
    private int id;
    private String Name;
    private String Desc;
    private Date CreateTime;

    public UserEntity(int id, String name, String desc, Date createTime) {
        this.id = id;
        Name = name;
        Desc = desc;
        CreateTime = createTime;
    }
}
