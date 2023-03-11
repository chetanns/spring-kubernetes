package com.example.service;

import com.example.component.MyThread;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.core.task.TaskExecutor;
import org.springframework.stereotype.Service;

@Service
public class AsyncService {

    @Autowired
    private TaskExecutor taskExecutor;

    @Autowired
    private ApplicationContext appContext;

    public void executeAsync() {

        MyThread thread = appContext.getBean(MyThread.class);
        taskExecutor.execute(thread);

    }
}
