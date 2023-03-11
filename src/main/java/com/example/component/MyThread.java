package com.example.component;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class MyThread implements Runnable{
    private static final Logger LOGGER = LogManager.getLogger(MyThread.class);

    @Override
    public void run() {

        LOGGER.info("Running thread"+ Thread.currentThread().getName());

    }
}
