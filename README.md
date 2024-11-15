## FastBoot
FastBoot 是一个基于SpringBoot3 并整合了 MyBatisPlus、Redisson、Sa-Token 的快速开发框架

## Quick Start
1. 创建一个空的maven项目
引用依赖
```xml
<dependency>
    <groupId>tech.andy</groupId>
    <artifactId>FastBoot-Starter</artifactId>
    <version>${version}</version>
</dependency>
```
2. 在resources目录下创建application.yml文件
```yaml
fastboot:
  # 数据库连接信息
  datasource:
    url: jdbc:mysql://localhost:3306/mydb
    username: root
    password: password
    driver-class-name: com.mysql.cj.jdbc.Driver
  redis:
    # redis 主机
    host: localhost
    port: 6379

sa-token:
  # token 名称（同时也是 cookie 名称）
  token-name: satoken
  # token 有效期（单位：秒） 默认30天，-1 代表永久有效
  timeout: 2592000
  # token 最低活跃频率（单位：秒），如果 token 超过此时间没有访问系统就会被冻结，默认-1 代表不限制，永不冻结
  active-timeout: -1
  # 是否允许同一账号多地同时登录 （为 true 时允许一起登录, 为 false 时新登录挤掉旧登录）
  is-concurrent: true
  # 在多人登录同一账号时，是否共用一个 token （为 true 时所有登录共用一个 token, 为 false 时每次登录新建一个 token）
  is-share: true
  # token 风格（默认可取值：uuid、simple-uuid、random-32、random-64、random-128、tik）
  token-style: uuid
  # 是否输出操作日志
  is-log: true
```
3. 创建一个启动类
```java
@SpringBootApplication
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
```

接下来就可以愉快的开发了