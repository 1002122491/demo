package com.example.demo;

import java.util.*;

/**
 * @author ShaoCong Lu
 * @date 2022/9/30 15:32
 */
public class test {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,2,4,3,6,7,9,11,22,3,4));
        //随机对象
        Random random = new Random();
        int size = list.size();
        Set<Integer> totals = new HashSet<Integer>();
        ArrayList<Integer> resultList = new ArrayList<>();
        while (totals.size() < 3) {//获取3个
            //随机再集合里取出元素，添加到新哈希集合
            totals.add((int) list.get(random.nextInt(size)));
        }
        for (Integer total : totals) {
            int next =  total;
            resultList.add(next);
        }
        for (Integer integer : resultList) {
            System.out.println("integer = " + integer);
        }
    }

}
