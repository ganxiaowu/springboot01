package com.example.demo;

import java.lang.*;
import java.lang.Thread;

/**
 * @author: admin_gan
 * @Date: 2019/5/22.
 * @version: 1.0
 */
public class MyThread implements Runnable{
    private int index = 1;
    private final int MAX = 100;
    private final static Object NUTEX = new Object();
    @Override
    public void run() {
        synchronized (NUTEX){
            while(index<MAX){
                System.out.println(java.lang.Thread.currentThread().getName() +"的排队号是："+ index++);
                try {
                    Thread.sleep(100);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
    }
}
