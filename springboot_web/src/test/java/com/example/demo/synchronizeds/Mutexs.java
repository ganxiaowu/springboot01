package com.example.demo.synchronizeds;

import java.util.concurrent.TimeUnit;

/**
 * @author: admin_gan
 * @Date: 2019/5/23.
 * @version: 1.0
 */
public class Mutexs {
    final static Object MUTEX = new Object();
    public void accessResource(){
        synchronized(MUTEX){
            try {
                TimeUnit.MINUTES.sleep(5);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Mutexs mutexs = new Mutexs();
        for (int i = 0; i <5 ; i++) {
            new Thread(mutexs::accessResource).start();
        }


    }

}
