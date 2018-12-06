package com.example.demo.basic.thread;

/**
 * @author: ChangXuefei
 * @date: 2018/12/3 10:20
 * @Version 1.0
 */
public class TestThread01 implements Runnable{
     private boolean flag = true;

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public static void main(String[] args) {
       TestThread01 test =  new TestThread01();
       Thread t = new Thread(test);
       t.start();
        try {
            Thread.sleep(3000);
            test.setFlag(false);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        String s = "ssss";
        System.out.println("开始");
        while (flag == true){
            synchronized (s) {

            }
        }
        System.out.println("结束了");
    }
}
