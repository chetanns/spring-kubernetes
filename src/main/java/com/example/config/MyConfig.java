package com.example.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@Configuration
public class MyConfig {

    @Value("${app.minThread}")
    private int corePoolsize;

    @Value("${app.maxThread}")
    private int maxPoolsize;

    @Value("${app.queueCapacity}")
    private int queueCapacity;

    @Autowired
    private Environment prop;

    @Bean
    TaskExecutor taskExecutor() {

        ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();

        taskExecutor.setCorePoolSize(corePoolsize);
        taskExecutor.setMaxPoolSize(maxPoolsize);
        taskExecutor.setQueueCapacity(queueCapacity);

        return taskExecutor;
    }
}
