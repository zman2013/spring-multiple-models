package com.zmannotes.spring.application;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 */
@SpringBootApplication
public class App implements CommandLineRunner {
    /**
     * main函数
     */
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    /**
     * 程序入口
     */

    public void run(String... args) throws Exception {
    }

}
