package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {

        List<Object> list1 = new ArrayList<>();
        list1.add("A");
        list1.add("B");
        list1.add("C");
        List<Object> list2 = new ArrayList<>();
        list2.add("B");
        list2.add("C");
        list2.add("D");

        // 求差集
        List<Object> list = list1.stream().filter(e -> {
            return !list2.contains(e);
        }).collect(toList());
        System.out.println("集合差集 " + list);
        // 集合差集 [A]


        //并集
        List<Object> listAll = list1.parallelStream().collect(Collectors.toList());
        List<Object> listAll2 = list2.parallelStream().collect(Collectors.toList());
        listAll.addAll(listAll2);
        System.out.println("listAll = " + listAll);
        // listAll = [A, B, C, B, C, D]



        //去重并集
        List<Object> listAllDistinct = listAll.stream().distinct().collect(Collectors.toList());
        System.out.println("listAllDistinct = " + listAllDistinct);
        // listAllDistinct = [A, B, C, D]


        //交集
        List<Object> intersection = list1.stream().filter(item -> list2.contains(item)).collect(toList());
        System.out.println("intersection = " + intersection);
        // intersection = [B, C]
    }

}
