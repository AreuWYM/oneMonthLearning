//package com.example.testprovider.service.impl;
//
//
//import org.springframework.scheduling.annotation.Scheduled;
//import org.springframework.stereotype.Component;
//
//import java.time.LocalDateTime;
//import java.time.format.DateTimeFormatter;
//
//@Component
//public class TaskService {
//
//    @Scheduled(cron = "0/5 * * * * ?")
//    //cron 表达式 https://help.aliyun.com/document_detail/64769.html
//    public void task() {
//        System.out.println("Thread Name: "
//                + Thread.currentThread().getName() + "  i am a task : date ->  "
//                + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
//
//    }
//
//    @Scheduled(cron = "30 57 21 16 1 ?")
//    //cron 表达式 https://help.aliyun.com/document_detail/64769.html
//    public void taskOnce() {
//        System.out.println("Thread Name: "
//                + Thread.currentThread().getName() + "  run once task ->  "
//                + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
//
//    }
//}
