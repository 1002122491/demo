package com.demo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author ShaoCong Lu
 * @date 2022/10/3 23:50
 */
public class test03 {
    public static void main(String[] args) {

        ArrayList<Book> arrayList = new ArrayList<>();
        arrayList.add(Book.builder().name("三国").auth("罗贯中").price(1000).build());
        arrayList.add(Book.builder().name("水浒").auth("罗贯中").price(5000).build());
        arrayList.add(Book.builder().name("西游").auth("罗贯中").price(360).build());
        arrayList.add(Book.builder().name("红楼").auth("罗贯中").price(780).build());

        System.out.println("arrayList = " + arrayList);

        // .reversed()
        List<Book> bookList = arrayList.stream().sorted(Comparator.comparing(Book::getPrice).reversed()).collect(Collectors.toList());


        System.out.println("bookList = " + bookList);

        arrayList.sort(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o2.getPrice() - o1.getPrice();
            }
        });
        System.out.println("arrayList = " + arrayList);

    }
}
