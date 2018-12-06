package com.example.demo.model.extend;

import lombok.Data;

/**
 * @author: ChangXuefei
 * @date: 2018/11/30 10:56
 * @Version 1.0
 */
@Data
public class Father {

    private String name;

    public void eat(){
        System.out.println("father eating");
    }
}
