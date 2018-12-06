package com.example.demo.basic.thread;

/**
 * @author: ChangXuefei
 * @date: 2018/12/6 10:42
 * @Version 1.0
 */
public class Thread01 extends Thread {

    public Thread01(Counter counter){
        this.counter = counter;
    }

    private Counter counter;
    @Override
    public void run() {
        for(int i=0;i<10000;i++){
            counter.add();
        }
     System.out.println(Thread.currentThread().getId()+":"+counter.getI());
    }

    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread01 t1 = new Thread01(counter);
        Thread01 t2 = new Thread01(counter);
        Thread01 t3 = new Thread01(counter);
        Thread01 t4 = new Thread01(counter);
        Thread01 t5 = new Thread01(counter);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}
