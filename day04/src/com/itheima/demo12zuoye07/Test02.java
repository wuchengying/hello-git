package com.itheima.demo12zuoye07;

import java.util.ArrayList;

public class Test02 {
    public static void main(String[] args) {
        Soldier s1 = new Soldier("王小兵",25,"打篮球");
        Soldier s2 = new Soldier("李团长",35,"游泳");
        Soldier s3 = new Soldier("杨幂",45,"啪啪");
        ArrayList<Soldier> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        for (int i = 0; i < list.size(); i++) {
            Soldier s = list.get(i);
            if (s.getAge() > 40) {
                s.setLike("再啪啪");
                s.show();
            }
        }
    }
}
