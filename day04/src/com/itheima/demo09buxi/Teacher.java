package com.itheima.demo09buxi;

public class Teacher {
    private String id;
    private String name;
    private String sex;
    private  int age;
    private String subject;

    public Teacher () {}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Teacher(String id, String name, String sex, int age, String subject) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.subject = subject;
    }
    public static void printTeacher(String id,String name,String sex,int age,String subject){

    }

}
