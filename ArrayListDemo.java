package com.dengzhou.Collection2;

import java.util.Arrays;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        String[] s = new String[]{"a","b","c","d"};
        System.out.println(s.getClass().getName());
        List<String> list = Arrays.asList(s);
        System.out.println(list.getClass().getName());
        s[0] = "哈哈";
        System.out.println(list);
        System.out.println(list.get(2));
        System.out.println(list.size());

        //我要在这个方法进行改进
        System.out.println("wohahah");
    }
}
