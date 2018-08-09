package com.itheima.demo03kaoshi;

public class kaoshi03 {
    public static void main(String[] args) {
        int count1 = 0;
        for (int i = 1; i < 500; i++) {
           if (i % 3 == 0 && i % 5 == 0){
               System.out.print(i + " ");
               count1++;
               if (count1 % 5 == 0){
                   System.out.println();
               }
           }
        }
        System.out.println();
        System.out.println("个数: " + count1);
    }
}
