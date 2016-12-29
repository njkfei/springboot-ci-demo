package com.niejinping.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootCiDemoApplication {

    @RequestMapping("/hello")
    public String sayHello(){
        return "hello,travis ci";
    }

	public static void main(String[] args) {
		SpringApplication.run(SpringbootCiDemoApplication.class, args);
	}
}
