package com.juc;

/**
 * @author ShaoCong Lu
 * @date 2022/10/18 16:20
 */
public class Demo01 {
    public static void main(String[] args) {

        T1 t1 = new T1();
        t1.start(); // 开启线程

        new Thread(new T2(),"线程2").start();
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
