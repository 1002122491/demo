package com.example.demo;

import com.streamTest.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * @author ShaoCong Lu
 * @date 2022/12/28 10:19
 */
@SpringBootTest
public class DemoApplicationTest02 {

    @Autowired
    private Test test;

    @org.junit.jupiter.api.Test
    void name() {

        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,2,3,4,5,6,7,8,9,10);
        List<Integer> filtering = test.DataFiltering(list);
        filtering.forEach(s-> System.out.println(s));
    }

    @org.junit.jupiter.api.Test
    void test02() {
        ArrayList<String> strings = new ArrayList<>();
        Collections.addAll(strings,"zhangsan,23","lisi,24","wangwu,25");

        Map<String, Integer> nameMap = test.DataFilteringNameMap(strings);
        System.out.println(nameMap);
    }
}
