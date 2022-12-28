package com.streamTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.stream.Stream;

/**
 * @author ShaoCong Lu
 * @date 2022/12/27 14:58
 */
public class Demo02 {
    public static void main(String[] args) {

        // testArrayList(); // 单列集合stream流
       // testMashMap(); //测试双列集合
        // testArray(); // 测试数组

        testValues();
    }

    private static void testValues() {
        // 散列数据
        Stream.of("a","b","c").forEach(s -> System.out.println(s));
    }

    private static void testArray() {
        // 数组
        int[] arr ={1,2,3};
        Arrays.stream(arr).forEach(s-> System.out.println(s));
    }

    private static void testArrayList() {
        // 单列集合
        ArrayList<String> arrayList = new ArrayList<>();
        Collections.addAll(arrayList,"a","b","C","d");
        arrayList.stream().forEach(System.out::println);
    }

    private static void testMashMap() {
        // 双列集合
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("aa",111);
        hashMap.put("ba",111);
        hashMap.put("ca",111);

        // 输出所有的键值对
        hashMap.entrySet().stream().forEach(stringObjectEntry -> System.out.println(stringObjectEntry));

        // 输出所有的键
        hashMap.keySet().stream().forEach(s -> System.out.println(s));
    }
}
