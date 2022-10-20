package com.juc;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author ShaoCong Lu
 * @date 2022/10/20 15:37
 */
public class ThreadPool {
    public static void main(String[] args) {

        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(
                3,
                5,
                3,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(3),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy()
        );

        // 最大处理业务 开辟的线程数量是 最大线程数量+阻塞队列的数量   如果超过8个 就会走拒绝策略
        // 默认是抛出异常 还有是
        // 调用者也就是main方法执行
        // 抛弃阻塞队列中等待时间最长的
        // 直接抛弃
        for (int i = 0; i < 8; i++) {

            poolExecutor.execute(()->{
                System.out.println(Thread.currentThread().getName() + " 处理业务 ");
            });
        }
    }
}
