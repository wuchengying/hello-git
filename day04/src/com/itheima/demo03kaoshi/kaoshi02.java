package com.itheima.demo03kaoshi;

public class kaoshi02 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <= 9; i++) {
            if(i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("偶数和: " + sum);
    }
}
