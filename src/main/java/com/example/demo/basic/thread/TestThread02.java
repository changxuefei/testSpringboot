package com.example.demo.basic.thread;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author: ChangXuefei
 * @date: 2018/12/3 10:20
 * @Version 1.0
 */
public class TestThread02 implements Runnable{
     private AtomicInteger ato = new AtomicInteger();


    public static void main(String[] args) {
       TestThread02 test =  new TestThread02();
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
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        for (int i=0;i<100;i++) {
            ato.addAndGet(1);
//            System.out.println( Thread.currentThread().getId()+":"+ato.addAndGet(1));

        }
        System.out.println( Thread.currentThread().getId()+":"+ato);
    }
}
