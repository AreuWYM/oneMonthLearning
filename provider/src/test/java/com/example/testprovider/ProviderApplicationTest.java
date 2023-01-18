package com.example.testprovider;

import com.example.testprovider.controller.ProviderController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.HashMap;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

@SpringBootTest
class ProviderApplicationTest {

    @Autowired
    ThreadPoolTaskExecutor threadPoolTaskExecutor;

    @Autowired
    ProviderController providerController;

    @Test
    void getRequest() {
        System.out.println(providerController.getRequest());
    }

    @Test
    void postRequest() {
        HashMap<String, Object> map = new HashMap<>();
        map.put("id", "2");
        map.put("age", 2);
        try {
            System.out.println(providerController.postRequest(map));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    void completableFuture() {

//        ExecutorService executorService = Executors.newFixedThreadPool(100);
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("子线程" + Thread.currentThread().getName());
            return "123";
        }, threadPoolTaskExecutor).thenApplyAsync(value -> {
            System.out.println("thenApply子线程" + Thread.currentThread().getName());
            threadPoolTaskExecutor.shutdown();
            return value + "thenApply";
        }, threadPoolTaskExecutor);
        String s = null;
        try {
            s = future.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println(s + "主线程结束" + Thread.currentThread().getName());
    }


}
