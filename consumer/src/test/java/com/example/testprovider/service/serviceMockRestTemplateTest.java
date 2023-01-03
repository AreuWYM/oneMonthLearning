package com.example.testprovider.service;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.CollectionUtils;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;

@SpringBootTest
@RunWith(SpringRunner.class)
public class serviceMockRestTemplateTest {

    // 模拟一个假的 RestTemplate 实例
    @Mock
    private RestTemplate restTemplate;

    @Autowired
    @InjectMocks
    private UserService userService;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetUsers() {
        // Mock RestTemplate
        Mockito.when(restTemplate.getForObject("http://localhost:8081/providerEnhance/add", String.class))
                .thenReturn("mock successfully");
        String mockResult = userService.addUser();
        System.out.println(mockResult);
        Assert.assertFalse(CollectionUtils.isEmpty(Collections.singleton(mockResult)));

    }

    @Test
    public void GetUserByIdTest() {
        // Mock RestTemplate

        String result = userService.getUserById(5);
        System.out.println(result);


    }
}

