package com.daniu101.chapter11.hw1;
/**
 * trim主要用于去除字符串两边的空格
 */
public class TrimDemo {
    public static void main(String[] args) {
        String s ="    我    你     ";
        System.out.println("加trim前:\n"+s);
        System.out.println("加trim后:\n"+s.trim());
    }
}
