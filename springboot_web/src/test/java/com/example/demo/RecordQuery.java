package com.example.demo;

import java.lang.Thread;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author: admin_gan
 * @Date: 2019/5/22.
 * @version: 1.0
 */
public class RecordQuery {
    private Connection connection;

    public RecordQuery(Connection connection){
        this.connection = connection;
    }

    public <T> T query(RowHandle<T> handle,String sql,Object... params) throws SQLException{
        try(PreparedStatement sm =connection.prepareStatement(sql)) {
            int index = 1;
            for (Object param : params) {
                sm.setObject(index++,param);
            }
            ResultSet resultSet = sm.executeQuery();
            return handle.handle(resultSet);
        }
    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread thread1 = new Thread(myThread, "窗口一");
        Thread thread2 = new Thread(myThread, "窗口二");
        Thread thread3 = new Thread(myThread, "窗口三");
        Thread thread4 = new Thread(myThread, "窗口四");
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
