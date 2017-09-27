package com.lessons.binary_search;

public class Main {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        int left, right, mid;
        left = array [0];
        right = array[array.length - 1];
        int x = 5;

        for (int i = 0; i<(array.length/2);i++) {
            mid = (left+right)/2;
            if (x == mid){
                System.out.println(i);
                break;
            }
            if (x > mid) {
                left = mid;
            } else {
                right = mid;
            }

        }
    }
}
