# backend-demo

第一个 Spring Boot 后端项目，配合 12 周学习计划 W1–W2 使用。

## 技术栈

| 项 | 版本 |
|---|---|
| JDK | 17 |
| Spring Boot | 4.1.2 |
| 构建工具 | Maven |
| 内嵌容器 | Tomcat |

## 本地运行

```bash
# 方式一：Maven 插件直接跑
mvn spring-boot:run

# 方式二：打包成 jar 再跑
mvn clean package -DskipTests
java -jar target/backend-demo-0.0.1-SNAPSHOT.jar
```

启动后访问：

- <http://localhost:8080/api/hello?name=张三>
- <http://localhost:8080/api/ping>

返回示例：

```json
{
  "message": "你好，张三！这是你的第一个接口。",
  "time": "2026-11-09 19:10:00"
}
```

## 目录结构

```
backend-demo
├── pom.xml                         # 依赖与构建配置
└── src
    ├── main
    │   ├── java/com/example/backenddemo
    │   │   ├── BackendDemoApplication.java   # 启动类，入口
    │   │   └── controller
    │   │       └── HelloController.java      # 接口层
    │   └── resources
    │       └── application.yml               # 端口、日志等配置
    └── test
        └── java/com/example/backenddemo
            └── BackendDemoApplicationTests.java
```

## 下一步（按学习计划）

1. **W2**：把 `HelloController` 换成真正的业务分层——`Controller` → `Service` → 内存 `Repository`
2. **W6**：加统一响应体 `Result<T>`、全局异常处理、参数校验
3. **W7**：接 MySQL，把内存实现换成 MyBatis-Plus
4. **W10**：写 `Dockerfile` + `docker-compose.yml`，部署到服务器

## 常用命令

```bash
mvn clean package      # 打包（会跑测试）
mvn test               # 只跑测试
mvn -q -DskipTests package   # 跳过测试快速打包
```
