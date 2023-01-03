package com.example.testprovider.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Collections;

@Service
public class UserService {

    @Autowired
    private RestTemplate restTemplate;

    public String addUser() {
        return restTemplate.getForObject("http://localhost:8081/providerEnhance/add", String.class);
    }

    public String getUserById(int id) {
        return restTemplate.getForObject("http://localhost:8081/providerEnhance/get/" + id, String.class);
    }

}