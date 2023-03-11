package com.example;

import com.example.service.AsyncService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;

@SpringBootApplication
//@EnableAutoConfiguration(exclude = {ErrorMvcAutoConfiguration.class})
public class Main implements CommandLineRunner {

    private static final Logger logger = LogManager.getLogger(Main.class);
    @Autowired
    private Environment env;

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(Main.class, args);

        /*
        AsyncService service = context.getBean(AsyncService.class);

        for (int i=0;i<3;i++) {
            service.executeAsync();
        }
         */
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("==========Starting========================");
        System.out.println("Max Thread>>"+env.getProperty("app.maxthread"));
        System.out.println("Properties value>>"+env.getProperty("app.test"));
        System.out.println("Properties value>>"+env.getProperty("app1.value"));
        System.out.println("Properties val>>"+env.getProperty("example.datasource.username"));

/*        while(true) {

            System.out.println("Testing....");
            Thread.sleep(1000);
        }*/
    }
}