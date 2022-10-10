package com.example.demo;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

/**
 * @author ShaoCong Lu
 * @date 2022/10/9 14:19
 */
public class test05 {
    public static void main(String[] args) {

        String pastDate = "2022-10-9";
        String nowDate = "2022-10-12";
        DateUtils.getDayBetween(pastDate,nowDate);
    }

}
