package com.example.demo.basic.thread;

import java.util.List;

/**
 * @author: ChangXuefei
 * @date: 2018/12/5 19:44
 * @Version 1.0
 */
public class Customer implements Runnable {
    private List list;
    @Override
    public void run() {
        customer();
    }
    public Customer(List list){
        this.list = list;
    }
     public void customer(){
         synchronized (list){
             while (true){
                 while (list.size()<=0){
                     try {
                         System.out.println("篮子空啦");
                         wait();
                     } catch (InterruptedException e) {
                         e.printStackTrace();
                     }
                 }
                 System.out.println("消费商品啦"+list.remove(0));
                 try {
                     Thread.sleep(1000);
                 } catch (InterruptedException e) {
                     e.printStackTrace();
                 }
             }
         }


    }

}
