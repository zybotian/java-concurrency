package com.ixex.chapter01;

import java.util.Random;
import java.util.concurrent.Callable;

public class CallableImpl implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        return new Random().nextInt();
    }
}
