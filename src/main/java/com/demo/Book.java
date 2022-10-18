package com.demo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * @author ShaoCong Lu
 * @date 2022/10/3 23:51
 */
@AllArgsConstructor
@Data
@NoArgsConstructor
@Builder
public class Book {
    private String name;
    private String auth;
    private Integer price;
}
