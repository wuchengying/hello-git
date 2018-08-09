package com.itheima.demo05;

public class Test1 {
    public static void main(String[] args) {
        Phone p = new Phone();
        System.out.println(p.brand+ " " + p.price + " " + p.color);
        p.brand = "魅族";
        p.price = 2000;
        p.color = "白色";
        System.out.println(p.brand+ " " + p.price + " " + p.color);
        p.call("");
        p.sendMessage();
    }
}
