package com.uspehgp.springaop;

import com.uspehgp.springaop.objects.FileManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringAopApplication {

    public static void main(String[] args)
    {
        SpringApplication.run(SpringAopApplication.class, args);
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        FileManager fileUtil = (FileManager) context.getBean("fileManager");
        fileUtil.getExtensionCount("c:\\Windows\\System32");
        fileUtil.getExtensionCount("c:\\Windows\\");

        ((ConfigurableApplicationContext)context).close();// закрытие контекста вручную
    }

}
