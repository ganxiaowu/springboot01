package com.example.demo.join;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

/**
 * @author: admin_gan
 * @Date: 2019/5/23.
 * @version: 1.0
 */
public class FightQueryTask extends Thread implements FightQuery{

    private String origin;
    private String destination;
    private List<String> fightList = new ArrayList<>();

    public FightQueryTask(String airLine,String origin,String destination){
        //设置线程名称
        super("["+airLine+"]");
        this.origin = origin;
        this.destination = destination;
    }
    @Override
    public void run() {
        System.out.println(getName()+"==="+origin+"==="+destination);
        int randomVal = ThreadLocalRandom.current().nextInt(10);
        try {
            TimeUnit.SECONDS.sleep(randomVal);
            this.fightList.add(getName()+"--"+randomVal);
            System.out.println("执行==");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    @Override
    public List<String> get() {
        return this.fightList;
    }
}
