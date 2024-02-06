package com.example.tobispring.IoC컨테이너와DI.IoC컨테이너_빈_팩토리와_애플리케이션_컨텍스트;

public class StringPrinter implements Printer{

    StringBuffer buffer = new StringBuffer();

    @Override
    public void print(String message) {
        this.buffer.append(message);
    }

    public String toString(){
        return this.buffer.toString();
    }
}
