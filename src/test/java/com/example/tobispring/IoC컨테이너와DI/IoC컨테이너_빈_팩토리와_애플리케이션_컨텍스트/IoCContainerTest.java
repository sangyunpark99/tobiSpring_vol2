package com.example.tobispring.IoC컨테이너와DI.IoC컨테이너_빈_팩토리와_애플리케이션_컨텍스트;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.support.StaticApplicationContext;

@SpringBootTest
public class IoCContainerTest {
    @Test
    void 클래스_빈_등록() throws Exception{
        StaticApplicationContext ac = new StaticApplicationContext();
        ac.registerSingleton("hello1", Hello.class);

        Hello hello1 = ac.getBean("hello1",Hello.class);
        assertThat(hello1).isNotNull();
    }

    @Test
    void BeanDefinition을_이용한_빈_등록() throws Exception{

        StaticApplicationContext ac = new StaticApplicationContext();

        // 빈 메타정보를 담은 오브젝트를 만든다. 빈 클래스는 Hello로 지정한다.
        BeanDefinition helloDef = new RootBeanDefinition(Hello.class);

        // 빈의 name 프로퍼티에 들어갈 값을 지정한다.
        // <property name="name" value="Spring"/>
        helloDef.getPropertyValues().addPropertyValue("name", "Spring");

        // 앞에서 생성한 빈 메타정보를 hello2라는 이름을 가진 빈으로 해서 등록한다.
        // <bean id = "hello2 ... />
        ac.registerBeanDefinition("hello2", helloDef);

        Hello hello2 = ac.getBean("hello2",Hello.class);

        String value = hello2.sayHello();
        assertThat(value).isEqualTo("Hello Spring");
    }
}
