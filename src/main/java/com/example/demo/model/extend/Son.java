package com.example.demo.model.extend;

import lombok.Data;

/**
 * @author: ChangXuefei
 * @date: 2018/11/30 10:56
 * @Version 1.0
 */
@Data
public class Son extends Father {

    @Override
    public void eat(){
        System.out.println("son eating");
    }
    public void play(String game){
        System.out.println("son play football");
    }

    public static void main(String[] args) {
        Father son = new Son();
        son.eat();
    }
}
