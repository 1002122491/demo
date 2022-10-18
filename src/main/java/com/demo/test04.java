package com.demo;

import org.springframework.beans.BeanUtils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;

/**
 * @author ShaoCong Lu
 * @date 2022/10/4 20:51
 */
public class test04 {
    public static void main(String[] args) {
//        String time =LocalDate.now().toString();
//        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("uuuu-MM-dd HH:mm:ss");
//        LocalDateTime localTime = LocalDateTime.parse(time, dtf);


        LocalDateTime now = LocalDateTime.now();
        LocalDateTime startTime = LocalDate.now().atTime(0, 0, 0);
        LocalDateTime endTime = LocalDate.now().atTime(23, 59, 59);
        //如果小于今天的开始日期
        if (now.isAfter(startTime) && now.isBefore(endTime)) {
            System.out.println("今天");
        }else {
            System.out.println("不是今天");
        }


    }
}
