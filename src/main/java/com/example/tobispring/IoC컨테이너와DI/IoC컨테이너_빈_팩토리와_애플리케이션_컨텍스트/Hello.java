package com.example.tobispring.IoC컨테이너와DI.IoC컨테이너_빈_팩토리와_애플리케이션_컨텍스트;

// 지정된 사람에게 인사를 할 수있는 Hello 클래스
public class Hello {
    String name;
    Printer printer;

    public String sayHello(){
        return "Hello " + name;
    }

    public void print(){
        this.printer.print(sayHello());
    }

    public void setName(String name){
        this.name = name;
    }

    // Printer 인터페이스를 구현한 오브젝트를 DI 받기
    public void setPrinter(Printer printer){
        this.printer = printer;
    }
}
