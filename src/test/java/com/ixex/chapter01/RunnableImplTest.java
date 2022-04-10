package com.ixex.chapter01;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnableImplTest {

    public static void main(String[] args) {
        Thread thread = new Thread(new RunnableImpl());
        thread.start();

        ExecutorService executorService = Executors.newFixedThreadPool(1);
        executorService.execute(new RunnableImpl());

        // shutdown
        executorService.shutdown();
    }
}
