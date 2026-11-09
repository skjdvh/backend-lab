package com.example.backenddemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;

/**
 * @RestController = @Controller + @ResponseBody
 * 方法返回值会被 Jackson 自动转成 JSON，不用自己写序列化。
 */
@RestController
@RequestMapping("/api")
public class HelloController {

    /**
     * GET /api/hello?name=张三
     * 浏览器直接打开 http://localhost:8080/api/hello?name=张三 就能看到结果
     */
    @GetMapping("/hello")
    public Map<String, Object> hello(@RequestParam(defaultValue = "world") String name) {
        return Map.of(
                "message", "你好，" + name + "！这是你的第一个接口。",
                "time", LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))
        );
    }

    /**
     * GET /api/ping —— 最简单的健康检查，用来确认服务活着
     */
    @GetMapping("/ping")
    public String ping() {
        return "pong";
    }
}
