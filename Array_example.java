/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.example.project2.array_example;

import java.util.ArrayList;

/**
 *
 * @author nickd
 */
public class Array_example {

public static void main(String[] args) {

    ArrayList<String> list1 = new ArrayList<>();

    list1.add("line1");
    list1.add("line2");
    list1.add("line3");

    for (int i = 0; i < list1.size(); i++) {
        System.out.println(list1.get(i));

        list1.remove(0);
    }

}

}
