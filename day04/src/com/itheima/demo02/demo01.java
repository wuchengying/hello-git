package com.itheima.demo02;

import java.util.Scanner;

public class demo01 {
    public static void main(String[] args) {
      String[] arr = new String[5];
      Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个名字");
            arr[i] = sc.next();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
