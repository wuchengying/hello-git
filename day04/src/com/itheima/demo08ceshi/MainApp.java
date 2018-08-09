package com.itheima.demo08ceshi;

public class MainApp {
    public static void main(String[] args) {
       /* Teacher t = new Teacher();
        t.setId("001");
        t.setName("薛之谦");
        t.setAge(26);
        t.setSubject("Java");
        System.out.println(t.getId() + "" + t.getName() + " " + t.getAge() +" " + t.getSubject());
        Teacher t1 = new Teacher();
        t1.setId("002");
        t1.setName("张碧晨");
        t1.setAge(24);
        t1.setSubject("Ios");
        System.out.println(t1.getId() + "" + t1.getName() + " " + t1.getAge() +" " + t1.getSubject());
        Teacher t2 = new Teacher();
        t2.setId("003");
        t2.setName("张杰");
        t2.setAge(28);
        t2.setSubject("Java");
        System.out.println(t2.getId() + "" + t2.getName() + " " + t2.getAge() +" " + t2.getSubject());*/
        Teacher t1 = new Teacher("t001","薛之谦","男",26,"Java");
        Teacher t2 = new Teacher("t002","张碧晨","女",24,"Ios");
        Teacher t3= new Teacher("t003","张杰","男",28,"Java");
        System.out.println(t1.getId() + "" + t1.getName() + " " + t1.getAge() +" " + t1.getSubject());
        System.out.println(t2.getId() + "" + t2.getName() + " " + t2.getAge() +" " + t1.getSubject());
        System.out.println(t3.getId() + "" + t3.getName() + " " + t3.getAge() +" " + t1.getSubject());
    }
}
