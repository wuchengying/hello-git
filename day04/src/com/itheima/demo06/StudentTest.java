package com.itheima.demo06;

public class StudentTest {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("景甜");
        s.setAge(18);
        System.out.println(s.getName() + " " + s.getAge());
        s.eat();
        s.study();
    }
}
