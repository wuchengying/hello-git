package com.itheima.demo12zuoye07;

import java.util.ArrayList;

public class Test01 {
    public static void main(String[] args) {
        Stu s1 = new Stu(1001,61.0);
        Stu s2 = new Stu(1002,59.9);
        Stu s3 = new Stu(1003,29.8);
        ArrayList<Stu> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        for (int i = 0; i < list.size(); i++) {
            Stu s = list.get(i);
           if(s.getSnum() == 1002) {
               list.remove(i);
           }
        }
        for (int i = 0; i < list.size(); i++) {
            Stu s = list.get(i);
            System.out.println(s.getScore() + " " + s.getSnum());
        }

    }
}
