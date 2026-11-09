package com.example.backenddemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动类：整个项目的入口。
 * 放在最外层包下，Spring 会自动扫描它所在包及子包里的 @Component / @Controller / @Service。
 */
@SpringBootApplication
public class BackendDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackendDemoApplication.class, args);
    }
}
