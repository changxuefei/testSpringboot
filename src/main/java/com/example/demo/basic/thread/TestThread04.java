package com.example.demo.basic.thread;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author: ChangXuefei
 * @date: 2018/12/3 10:20
 * @Version 1.0
 * 测试死锁
 */
public class TestThread04 implements Runnable{
    private String name;
    private Object a = new Object();
    private Object b = new Object();
   
    @Override
    public void run() {
        if(name.equals("a")){
            synchronized (a){
                System.out.println("已经获取a锁");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (b){
                    System.out.println("已经获取b锁");
                }
            }
        }else{
            synchronized (b){
                System.out.println("已经获取b锁");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (a){
                    System.out.println("已经获取a锁");
                }
            }
        }
    }
    public static void main(String[] args) {
        TestThread04 t = new TestThread04();
        Thread thread1 = new Thread(t);
        t.setName("a");
        thread1.start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread thread2 = new Thread(t);
        t.setName("b");
        thread2.start();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
