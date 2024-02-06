package com.example.tobispring.IoC컨테이너와DI.IoC컨테이너_빈_팩토리와_애플리케이션_컨텍스트;

public class ConsolePrinter implements Printer{

    @Override
    public void print(String message) {
        System.out.println(message);
    }
}
