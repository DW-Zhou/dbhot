package com.dengzhou.Collection2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class CollectionTest {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add("孙悟空");
        c.add(6);
        System.out.println("c集合中的元素个数是："+c.size());
        c.remove(6);
        System.out.println("c集合中的元素个数是："+c.size());

        System.out.println("c集合是否包含\"孙悟空\"字符串："+c.contains("孙悟空"));
        c.add("轻量级jav企业实战");
        System.out.println("c集合中的元素"+c);

        Collection books = new HashSet();
        books.add("轻量级jav企业实战");
        books.add("疯狂java讲义");
        System.out.println("books集合中的元素"+books);

        System.out.println(c.contains(books));

        System.out.println(c.remove(books));
    }
}
