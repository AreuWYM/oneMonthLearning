package com.example.testprovider;

import com.example.testprovider.exception.CustomErrorHandler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.client.RestTemplate;


import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.List;


@SpringBootApplication
public class ConsumerApplication {

//    @Bean
//    public RestTemplate restTemplate(RestTemplateBuilder templateBuilder) {
//        return templateBuilder.setConnectTimeout(Duration.ofSeconds(10))
//                .setReadTimeout(Duration.ofSeconds(10))
//                .build();
//    }

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }

}
