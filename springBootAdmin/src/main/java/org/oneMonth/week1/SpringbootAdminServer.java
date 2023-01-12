package org.oneMonth.week1;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAdminServer
@SpringBootApplication
public class SpringbootAdminServer {
    public static void main(String[] args) {

        SpringApplication.run(SpringbootAdminServer.class, args);
    }
}