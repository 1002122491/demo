package com.streamTest;

import java.util.ArrayList;

/**
 * @author ShaoCong Lu
 * @date 2022/12/27 11:23
 */
public class Demo01 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("张三丰");
        arrayList.add("张五级");
        arrayList.add("张石峰");
        arrayList.add("张浩");
        arrayList.add("重视人");
        arrayList.add("晓峰");
//        for (String s : arrayList) {
//            System.out.println("s = " + s);
//        }
//        System.out.println("----------------------------------");
//        List<String> list = arrayList.stream().filter(s -> s.startsWith("张")).collect(Collectors.toList()); // 以张开头
//
//        for (String s : list) {
//            System.out.println("s = " + s);
//        }
//        System.out.println("----------------------------------");
//        List<String> list3 = list.stream().filter(s -> s.length() == 3).collect(Collectors.toList()); // 名字长度③的
//
//        for (String s : list3) {
//            System.out.println("s = " + s);
//        }
        arrayList.stream().filter(s -> s.startsWith("张")).filter(s -> s.length()==3).forEach(System.out::println);

    }
}
