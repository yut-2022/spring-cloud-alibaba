package com.snk.email;

import com.snk.swagger.annotation.EnableCustomSwagger2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author :Cai.ChangJun
 * @version 1.0.0
 * @Description : 邮件服务启动类
 * @Date : 2021/5/5
 */
@SpringBootApplication
@EnableCustomSwagger2
public class EmailApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmailApplication.class);
    }
}
