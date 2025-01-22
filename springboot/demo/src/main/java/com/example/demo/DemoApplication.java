package com.example.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
      ApplicationContext context = SpringApplication.run(DemoApplication.class, args) ;
    // Gọi Bean 
        Engine engine = context.getBean(Engine.class);
    // Gọi phương thức của Bean
        engine.active();
    }
}
