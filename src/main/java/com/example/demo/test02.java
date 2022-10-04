package com.example.demo;

import java.math.BigDecimal;

/**
 * @author ShaoCong Lu
 * @date 2022/9/30 16:28
 */
public class test02 {
    public static void main(String[] args) {
        BigDecimal bigDecimal = new BigDecimal("1000.225");
        System.out.println("bigDecimal = " + bigDecimal);
        System.out.println("bigDecimal.toString() = " + bigDecimal.toString());
    }
}
