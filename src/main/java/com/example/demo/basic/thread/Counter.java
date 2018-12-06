package com.example.demo.basic.thread;

/**
 * @author: ChangXuefei
 * @date: 2018/12/6 10:43
 * @Version 1.0
 */
public class Counter {
    private int i=0;

    public void add(){
        this.i++;
    }


    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}
