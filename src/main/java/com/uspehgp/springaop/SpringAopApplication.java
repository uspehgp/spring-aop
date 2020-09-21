package com.uspehgp.springaop;

import com.uspehgp.springaop.objects.FileManager;
import com.uspehgp.springaop.objects.FileManager2;
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
        FileManager fileManager = (FileManager) context.getBean("fileManager");
        FileManager2 fileManager2 = (FileManager2) context.getBean("fileManager2");

        // fileManager.getExtensionCount("c:\\Windows\\System32");

        fileManager.getExtensionCount("c:\\Windows\\system32\\drivers");
//        fileManager.getExtensionCount("c:\\Windows\\System32");
//        fileManager.getExtensionList("c:\\Windows\\system32\\drivers");

        fileManager2.getExtensionCount("c:\\Windows\\");

//        ((ConfigurableApplicationContext)context).close();// закрытие контекста вручную
    }

}
