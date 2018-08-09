package com.itheima.demo06;

public class Student {
    private String name;
    private int age;
    public void eat(){
        System.out.println("吃饭");
        }
    public void study () {
        System.out.println("学习");
    }
    public Student () {}
    public Student (String name,int age) {
        this.name = name;
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName () {
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
}
