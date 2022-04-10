package com.ixex.chapter01;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableImplTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(1);

        Future<Integer> submit = executorService.submit(new CallableImpl());
        System.out.println(submit.get());
        // shutdown
        executorService.shutdown();
    }
}
