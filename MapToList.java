package com.dengzhou.Collection2;

import com.dengzhou.bean.User;

import java.util.*;

public class MapToList {
    public static void main(String[] args) {
            MapToList();
    }
    public static void MapToList(){
        User user1 = new User(1,"张三",18,"女");
        User user2 = new User(2,"李四",18,"女");
        User user3 = new User(3,"王五",18,"男");
        User user4 = new User(4,"老王",18,"男");

        ArrayList<User> list = new ArrayList<User>();
        HashMap<Integer,User> map = new HashMap<Integer, User>();

        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);

        for (User user : list){
            System.out.println(user);
            map.put(user.getId(),user);
        }
//        System.out.println(map.size());
        Set<Map.Entry<Integer,User>> entrySet = map.entrySet();
        for (Map.Entry<Integer,User> entry: entrySet){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
        System.out.println("----------------------------");
        for (Iterator<Map.Entry<Integer,User>> iterator = entrySet.iterator();iterator.hasNext();){
            Map.Entry<Integer,User> entry2 = iterator.next();
            System.out.println(entry2);
        }

    }
}
