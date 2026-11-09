package com.example.backenddemo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * 冒烟测试：能启动 Spring 上下文就算通过。
 * 它的价值在于——如果某个 Bean 配错了，mvn test 会立刻失败，而不是等你手动启动才发现。
 */
@SpringBootTest
class BackendDemoApplicationTests {

    @Test
    void contextLoads() {
    }
}
