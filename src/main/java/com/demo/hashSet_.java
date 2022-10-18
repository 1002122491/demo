package com.demo;

import java.util.HashSet;
import java.util.Objects;

/**
 * @author ShaoCong Lu
 * @date 2022/10/17 11:26
 */
public class hashSet_ {
    public static void main(String[] args) {
        HashSet<Object> hashSet = new HashSet<>();
        /**
         * set 集合的特点
         * 1. 无序 存放的数据和取出来的数据是无序的
         * 2. 不能重复 如果有重复的数据 就是会被替代
         * 3. 可以存放null 只能放一个
         * 4. 遍历不能用普通的for循环 因为根本没有顺序 也没有get方法
         *     public HashSet() {
         *         map = new HashMap<>();
         *     }
         *     hashset无参构造就是new一个hashmap
         */

        hashSet.add(new Emp("lixi", 18));
        hashSet.add(new Emp("lixi", 18));
        hashSet.add(new Emp("lixi", 18));
        hashSet.add(new Emp("lixi", 19));


        System.out.println("hashSet = " + hashSet);

    }

   static class Emp {
        private String name;
        private Integer age;

       public Emp() {
       }

       public Emp(String name, Integer age) {
           this.name = name;
           this.age = age;
       }

       @Override
       public boolean equals(Object o) {
           if (this == o) return true;
           if (o == null || getClass() != o.getClass()) return false;
           Emp emp = (Emp) o;
           return Objects.equals(name, emp.name) && Objects.equals(age, emp.age);
       }

       @Override
       public int hashCode() {
           return Objects.hash(name, age);
       }

       @Override
       public String toString() {
           return "Emp{" +
                   "name='" + name + '\'' +
                   ", age=" + age +
                   '}';
       }

       public String getName() {
           return name;
       }

       public void setName(String name) {
           this.name = name;
       }

       public Integer getAge() {
           return age;
       }

       public void setAge(Integer age) {
           this.age = age;
       }
   }
}
