package com.gxwuz.ly.shetuan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class ShetuanApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShetuanApplication.class, args);
    }
}
