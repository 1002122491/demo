package com.streamTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author ShaoCong Lu
 * @date 2022/12/27 17:05
 */
public class Demo03 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("张三丰");
        arrayList.add("张三丰");
        arrayList.add("张三丰");
        arrayList.add("张五级");
        arrayList.add("张石峰");
        arrayList.add("张浩");
        arrayList.add("重视人");
        arrayList.add("晓峰");

        ArrayList<String> arrayList1 = new ArrayList<>();

        arrayList1.add("张三丰-255");
        arrayList1.add("张五级-23");
        arrayList1.add("张石峰-65");
        arrayList1.add("张浩-70");
        arrayList1.add("重视人-50");
        arrayList1.add("晓峰-45");

        ArrayList<String> strings = new ArrayList<>();
        Collections.addAll(arrayList,"a","b","C","d");

        // 过滤方法  过滤姓张的 名字三个字的
        List<String> listZS = arrayList.stream().filter(s -> s.startsWith("张")).filter(s -> s.length() == 3).collect(Collectors.toList());

        // 去重方法
        List<String> distinctZ = arrayList.stream().distinct().collect(Collectors.toList());

        // 合并两个流
        List<String> concatZ = Stream.concat(arrayList.stream(), strings.stream()).collect(Collectors.toList());
       // concatZ.forEach(s -> System.out.println("s = " + s));

        // map 重新收集
        List<Integer> collect = arrayList1.stream().map(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                String[] split = s.split("-");
                String age = split[1];
                return Integer.parseInt(age);
            }
        }).collect(Collectors.toList());

        //collect.forEach(s -> System.out.println("s = " + s));

        // limit 只输出前俩元素
        arrayList.stream().limit(2).collect(Collectors.toList()).forEach(s -> System.out.println(s));

        // skip 跳过前俩
        arrayList.stream().skip(2).collect(Collectors.toList()).forEach(s -> System.out.print("s = " + s));
    }
}
