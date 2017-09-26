package com.lessons.bubble_sort;

public class sort {
    public static void main(String[] args) {
        int[] array = {14, 12, 56, 48, 10, 1, 11, 54, 88, 15};
        int n;
        int a, b, c;
        n = array.length;
        for (int j = 0; j <= n; j++) {
            for (int i = 0; i < n - 1; i++) {
                a = array[i];
                b = array[i + 1];
                if (a > b) {
                    array[i] = b;
                    array[i + 1] = a;
                }
            }
        }
        System.out.println(array[0] + " " + array[1] + " " + array[2] + " " + array[3] + " " + array[4] + " " + array[5] + " " + array[6] + " " + array[7] + " " + array[8] + " " + array[9]);
    }
}