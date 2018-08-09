package com.itheima.demo02;
import java.util.Scanner;
public class demo02 {
    public static void main(String[] args) {
        int sum = 0;
        int[] arr = new int[8];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个学生成绩");
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        for (int i1 = 0; i1 < arr.length; i1++) {
            System.out.println(arr[i1]);
        }
        int avg = sum /arr.length;
        System.out.println("总分" + sum +"及平均分" + avg);
    }
}

