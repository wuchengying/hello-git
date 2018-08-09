package com.itheima.demo09buxi;

public class MainApp {
    public static void main(String[] args) {
        Teacher t = new Teacher("t001","薛之谦","男",26,"Java");
        Teacher t1 = new Teacher("t002","张碧晨","女",22,"Ios");
        Teacher t2 = new Teacher("t003","张杰","男",28,"Java");
        System.out.println(t.getId() + " " + t.getName() + " " + t.getSex() + " " + t.getAge() + " " + t.getSubject() );
        System.out.println(t1.getId() + " " + t1.getName() + " " + t1.getSex() + " " + t1.getAge() + " " + t1.getSubject() );
        System.out.println(t2.getId() + " " + t2.getName() + " " + t2.getSex() + " " + t2.getAge() + " " + t2.getSubject() );

    }
}
