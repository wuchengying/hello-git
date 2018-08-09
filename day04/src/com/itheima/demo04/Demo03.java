package com.itheima.demo04;

public class Demo03 {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("柳岩");
        s.setAge(18);
        System.out.println(s.getName() + " " + s.getAge());
        Student s2 = new Student("范冰冰",20);
        System.out.println(s2.getName() + " " + s2.getAge());
    }
}
