package com.yyl.flyplus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@MapperScan("com.yyl.flyplus.mapper")
public class FlyplusApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlyplusApplication.class, args);
	}

}
