package com.lessons.binary_search;

public class Main {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        int left, right, mid;
        left = 0;
        right = array.length - 1;
        int x = 10;
        for (int i = 0; i<array.length;i++) {
            mid = (left+right)/2;
            if (x > array[mid]) {
                left = mid;
            }
            if (x < array[mid]) {
                right = mid;
            }
            if (x == array[mid]){
                System.out.println(mid);
                break;
            }

            if (i == (left + (right-left)/2)){
                System.out.println("Нет числа в массиве");
                break;
            }
        }

    }
}
