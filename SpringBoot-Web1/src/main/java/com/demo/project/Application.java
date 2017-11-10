package com.demo.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//建议放到根目录下面,主要用于做一些框架配置
@SpringBootApplication //等价于使用 @Configuration @EnableAutoConfiguration @ComponentScan
public class Application {
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
