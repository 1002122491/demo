package com.juc;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * @author ShaoCong Lu
 * @date 2022/10/18 16:20
 */
public class Demo01 {
    public static void main(String[] args) {

        T1 t1 = new T1();
        t1.start(); // 开启线程

        // 实现runnable接口
        new Thread(new T2(),"线程2").start();

        // 内部类
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("匿名内部类");
            }
        }).start();

        // 拉姆达表达式
        new Thread(()->{
            System.out.println("拉姆达表示");
        }).start();

        // Callable 接口
        new Thread(new FutureTask<String>(new T3())).start();

        new Thread(new FutureTask<>(() -> {
            System.out.println( "我爱你");
            return 1024;
        })).start();
    }

}

class T1 extends Thread{

    @Override
    public void run() {
        System.out.println("我是Thread类");
    }
}

class T2 implements Runnable{
    @Override
    public void run() {
        System.out.println("我是Runnable接口 ");
    }
}

class T3 implements Callable<String>{

    @Override
    public String call() throws Exception {
        return "hello world";
    }
}
