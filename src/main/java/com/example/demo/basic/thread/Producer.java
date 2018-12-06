package com.example.demo.basic.thread;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: ChangXuefei
 * @date: 2018/12/5 19:44
 * @Version 1.0
 */
public class Producer implements Runnable {

    private List list;
    @Override
    public void run() {
        producer();
    }
    public Producer(List list){
            this.list = list;
    }
     public void producer(){

         synchronized (list){
             while (true){
                 while (list.size()>=10){
                     try {
                         System.out.println("篮子满啦");
                         wait();
                     } catch (InterruptedException e) {
                         e.printStackTrace();
                     }
                 }
                 System.out.println("生产商品啦"+list.add("1"));
                 try {
                     Thread.sleep(1000);
                 } catch (InterruptedException e) {
                     e.printStackTrace();
                 }
             }
         }
     }

    public static void main(String[] args) {
        List list = new ArrayList<String>(10);
        Producer p = new Producer(list);
        Thread t = new Thread(p);
        t.start();
        Customer c = new Customer(list);
        Thread t2 = new Thread(c);
        t2.start();
    }
}
