package com.itheima.demo04;

public class demo02 {
    public static void main(String[] args) {
    Phone p = new Phone();
        System.out.println(p);
    p.brand = "小米";
    p.price = 999;
    p.color = "红色";
        System.out.println("品牌" + p.brand);
        System.out.println("价格" + p.price);
        System.out.println("颜色" + p.color);
        showPhone(p);
    }
    public static void showPhone(Phone p1){
        System.out.println(p1);
        System.out.println(p1.brand +" " + p1.price+ " " + p1.color);
    }
}
