package com.example.demo.basic.thread;

/**
 * @author: ChangXuefei
 * @date: 2018/12/5 18:05
 * @Version 1.0
 */
public class TestThread05 implements Runnable{
    private int i=0;

    @Override
    public void run() {

            while (true){
                System.out.println(Thread.currentThread().getId()+":"+i);
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }


    public static void main(String[] args) {
        TestThread05 t = new TestThread05();
        Thread thread1 = new Thread(t);
        thread1.start();
        try {
            Thread.sleep(2000);
            t.setI(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}
