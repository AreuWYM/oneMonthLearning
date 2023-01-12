package com.example.testprovider.Entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Authrity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @Column
    String name;
    @Column
    String password;
    @Column
    String role;
}
