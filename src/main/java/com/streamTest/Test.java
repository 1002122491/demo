package com.streamTest;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author ShaoCong Lu
 * @date 2022/12/28 10:07
 */
@Component
public class Test {

    public List<Integer> DataFiltering(List<Integer> list){

        // 过滤出list中的奇数 留下偶数
        List<Integer> integers = list.stream().filter(s -> s % 2 == 0).collect(Collectors.toList());
        return integers;
    }

    public Map<String,Integer> DataFilteringNameMap(List<String> list){

        // 保留年龄大于24的人 并且收集到map中 姓名为键值对 年龄为键
       return list.stream().filter(s -> Integer.parseInt(s.split(",")[1])>=24)
                .collect(Collectors.toMap(s -> s.split(",")[0],s -> Integer.parseInt(s.split(",")[1])));
    }


}
