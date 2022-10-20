package com.juc;

/**
 * @author ShaoCong Lu
 * @date 2022/10/18 16:40
 */
public class Phone_ {

    public synchronized void sendMsg(){
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("发送短信 ");
    }

    public synchronized void sendEmail(){
        System.out.println("发送邮件");
    }

    public void getHello(){
        System.out.println("hello");
    }
}

class test {
    public static void main(String[] args) {
        Phone_ phone = new Phone_();

        new Thread(()->{

            phone.sendMsg();
        }).start();

        new Thread(() -> {
            phone.sendEmail();
        }).start();
    }
}
