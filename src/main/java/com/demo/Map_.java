package com.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Set;

/**
 * @author ShaoCong Lu
 * @date 2022/10/18 11:01
 */
public class Map_ {
    public static void main(String[] args) {

        HashMap<Object, Object> hashMap = new HashMap<>();

//
//        Set<Map.Entry<String, Object>> entries = hashMap.entrySet();
//        entries.forEach(stringObjectEntry -> {
//            String key = stringObjectEntry.getKey();
//            Object value = stringObjectEntry.getValue();
//            System.out.println("value = " + value + "key " + key);
//        });
//
//        hashMap.forEach((key, value) -> {
//            Object o = hashMap.get(key);
//            System.out.println("o = " + o);
//        });
        Staff staff1 = new Staff(100111,"1001","1001");
        Staff staff2 = new Staff(1002,"1002","1002");
        Staff staff3 = new Staff(1003,"1003","1003");

        hashMap.put(staff1.getId(),staff1);
        hashMap.put(staff2.getId(),staff2);
        hashMap.put(staff3.getId(),staff3);

        Set<Object> objects = hashMap.keySet();
        for (Object object : objects) {
            if (Integer.parseInt(object.toString())>18000){
                System.out.println(hashMap.get(object));
            }
        }

    }
}

@Data
@AllArgsConstructor
@NoArgsConstructor
class Staff {

    private Integer id;
    private String name;
    private String money;
}





















