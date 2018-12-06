package com.example.demo.basic.thread;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author: ChangXuefei
 * @date: 2018/12/3 10:20
 * @Version 1.0
 */
public class TestThread03 implements Runnable{
//    volatile private int count = 1;
volatile private AtomicInteger count = new AtomicInteger(1);

    public static void main(String[] args) {
        TestThread03 test =  new TestThread03();
        Thread t1 = new Thread(test);
        Thread t2 = new Thread(test);
        Thread t3 = new Thread(test);
        Thread t4 = new Thread(test);
        Thread t5 = new Thread(test);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }

    @Override
    public void run() {
        for (int i=0;i<100;i++){
//            count++;
            count.addAndGet(1);
        }
        System.out.println(count);
    }
}
