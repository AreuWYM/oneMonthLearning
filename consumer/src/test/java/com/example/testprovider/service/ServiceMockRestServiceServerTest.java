package com.example.testprovider.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.client.ExpectedCount;
import org.springframework.test.web.client.MockRestServiceServer;
import org.springframework.test.web.client.match.MockRestRequestMatchers;
import org.springframework.test.web.client.response.MockRestResponseCreators;
import org.springframework.util.CollectionUtils;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.Collections;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ServiceMockRestServiceServerTest {

    @Autowired
    private UserService userService;

    @Autowired
    private RestTemplate restTemplate;

    private MockRestServiceServer mockServer;

    private ObjectMapper mapper = new ObjectMapper();

    @Before
    public void init() {
        mockServer = MockRestServiceServer.createServer(restTemplate);
    }

    @Test
    public void MockRestServiceServerTest() throws Exception {
        // 模拟 RestTemplate 请求
        mockServer.expect(ExpectedCount.once(),
                        MockRestRequestMatchers.requestTo(new URI("http://localhost:8081/providerEnhance/add")))
                .andExpect(MockRestRequestMatchers.method(HttpMethod.GET))
                .andRespond(MockRestResponseCreators.withStatus(HttpStatus.OK)
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(mapper.writeValueAsString("MockRestServiceServer Success"))
                );
        String mockResult = userService.addUser();

        Assert.assertFalse(CollectionUtils.isEmpty(Collections.singleton(mockResult)));
        mockServer.verify();
        System.out.println(mockResult);
    }


}