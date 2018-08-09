package com.itheima.demo07;

public class Test {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.setBrand("苹果");
        p.setPrice(8888);
        p.setColor("玫瑰金");
        System.out.println(p.getBrand() + " " + p.getPrice() + " " + p.getColor());
        p.call("老王");
        p.sendMessage();
    }
}
