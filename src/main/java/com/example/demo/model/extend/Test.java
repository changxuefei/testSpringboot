package com.example.demo.model.extend;

/**
 * @author: ChangXuefei
 * @date: 2018/11/30 11:04
 * @Version 1.0
 */
public class Test {
    public void test(Father father){
        father.eat();
    }

    public static void main(String[] args) {
        Test t = new Test();
        Son s = new Son();
        t.test(s);
    }
}
