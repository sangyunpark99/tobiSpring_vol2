package com.example.tobispring;

import com.example.tobispring.IoC컨테이너와DI.IoC컨테이너_빈_팩토리와_애플리케이션_컨텍스트.Hello;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.StaticApplicationContext;

@SpringBootApplication
public class TobiSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(TobiSpringApplication.class, args);
    }

}
