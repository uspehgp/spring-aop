package com.uspehgp.springaop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.uspehgp.springaop.objects.SomeService;

@SpringBootApplication
public class SpringAopApplication {

    public static void main(String[] args)
    {
        SpringApplication.run(SpringAopApplication.class, args);
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        SomeService service = (SomeService) context.getBean("someService");
        double val = service.getDoubleValue();
        int valint = service.getIntValue();

        ((ConfigurableApplicationContext)context).close();// закрытие контекста вручную
    }

}
