package com.example.testprovider;

import com.example.testprovider.controller.ConsumerController;
import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import java.net.SocketTimeoutException;

@SpringBootTest
@RunWith(SpringRunner.class)
class ConsumerApplicationTest {

    @Autowired
    RestTemplate restTemplate;
    @Autowired
    ConsumerController consumerController;

    @Test
    void getRequest() {
        System.out.println(consumerController.getRequest());
    }

    @Test
    void postRequest() {
        System.out.println(consumerController.postRequest());
    }

    @Test
    void putRequest() {
        System.out.println(consumerController.putRequest());
    }

    @Test
    void timeOut(){
        ResponseEntity<String> exchange = null;
        try {
            exchange = restTemplate.exchange("http://localhost:8080/consumer/timeOutTest", HttpMethod.GET, null, String.class);
        } catch (Exception e) {
            if (e.getCause() instanceof SocketTimeoutException) {
                System.out.println(e.getCause().getMessage());
            } else e.printStackTrace();
            System.out.println("Exception handled");

        }
        System.out.println("end");
    }

}
