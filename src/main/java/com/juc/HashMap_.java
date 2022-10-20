package com.juc;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * @author ShaoCong Lu
 * @date 2022/10/19 10:49
 */
public class HashMap_ {
    public static void main(String[] args) {
      //  HashMap<String, String> hashMap = new HashMap<>();
        ConcurrentHashMap<String, String> hashMap = new ConcurrentHashMap<>();

        // 线程安全的
        CopyOnWriteArrayList<Object> objects = new CopyOnWriteArrayList<>();
        CopyOnWriteArraySet<Object> objects1 = new CopyOnWriteArraySet<>();
        List<Object> objectList = Collections.synchronizedList(new ArrayList<>());
        Set<Object> objects2 = Collections.synchronizedSet(new HashSet<>());
        Map<Object, Object> objectObjectMap = Collections.synchronizedMap(new HashMap<>());

        for (int i = 0; i < 30; i++) {
            new Thread(()->{
                hashMap.put(UUID.randomUUID().toString(),UUID.randomUUID().toString());
                System.out.println("hashMap = " + hashMap);
            }).start();
        }

       // Hashtable<Object, Object> objectObjectHashtable = new Hashtable<>();
       // public synchronized V put(K key, V value) {  使用了synchronized锁


    }
}
