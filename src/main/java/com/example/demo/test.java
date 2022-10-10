package com.example.demo;

import java.util.ArrayList;
import java.util.List;

class Test {

    public static void union() {

        List<Object> list1 = new ArrayList();
        list1.add("A");
        list1.add("B");
        list1.add("C");

        List<Object> list2 = new ArrayList();
        list2.add("B");
        list2.add("C");
        list2.add("D");

        //求出并集
        list1.addAll(list2);
        System.out.println(list1);

    }

    /**
     * Description: 交集
     *
     * @return
     * @version V1.0 2017/4/7 13:09 by 石冬冬-Heil Hilter(dd.shi02@zuche.com)
     */

    public static void intersection() {

        List list1 = new ArrayList() {{

            add("A");

            add("B");

            add("C");

        }};

        List list2 = new ArrayList() {{

            add("C");

            add("D");

            add("B");

        }};

//求出交集

        list1.retainAll(list2);

        System.out.println(list1);

    }

    /**
     * Description: 差集
     *
     * @return
     * @version V1.0 2017/4/7 13:09 by 石冬冬-Heil Hilter(dd.shi02@zuche.com)
     */

    public static void diff() {

        List list1 = new ArrayList() {{

            add("A");

            add("B");

            add("C");

        }};

        List list2 = new ArrayList() {{

            add("C");

            add("D");

            add("B");

        }};

//求出差集

        list1.removeAll(list2);

        System.out.println(list1);

    }
}
