package com.example.demo.join;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


/**
 * @author: admin_gan
 * @Date: 2019/5/23.
 * @version: 1.0
 */
public class FightQueryExample {
    //航空公司
    private static List<String> figntCompany = Arrays.asList("CAS", "CEA", "HNA");

    public static void main(String[] args) {
        List<String> results = search("SH", "BJ");
        System.out.println("-------------------result----------------------");
        for (String result : results) {
            System.out.println(result);
        }
    }
    private static List<String> search(String sh, String bj) {
        List<String> result = new ArrayList<>();
        //跟进航空公司 创建各自航空公司的查询线程
        List<FightQueryTask> tasks = figntCompany.stream().map(f -> new FightQueryTask(f, sh, bj)).collect(Collectors.toList());
        //启动每一个线程
        tasks.forEach(Thread::start);
        //调用每一个线程的join方法，阻塞当前线程
        tasks.forEach(t -> {
            try{t.join();}catch (Exception e){}
        });
        //获取每个查询线程的查询结果add到result中
        tasks.stream().map(FightQuery::get).forEach(result::addAll);
        return result;

    }

}
