package com.gx.sc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * springboot默认使用两种方式来和elasticsearch进行交互
 * 1. jest:默认是不生效的，需要导入jest的工具包
 * 2. springboot elasticsearch
 */
@SpringBootApplication
public class SpringbootElasticsearchApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootElasticsearchApplication.class, args);
	}

}
