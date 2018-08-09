package com.itheima.demo10dainzhao1;

import java.util.Random;
import java.util.Scanner;

public class demoArrayList {
    public static void main(String[] args) {
       Random ran = new Random();
       int number = ran.nextInt(100) + 1;
       while (true) {
           Scanner sc = new Scanner(System.in);
           System.out.println("请输入你要猜的数字(1-100)");
           int guessNumber = sc.nextInt();
           if (guessNumber > number) {
               System.out.println("你猜的数字" + guessNumber + "大了");
           } else if (guessNumber < number) {
               System.out.println("你猜的数字" + guessNumber + "小了");
           } else {
               System.out.println("恭喜你猜对了");
               break;
           }
       }
    }
}
