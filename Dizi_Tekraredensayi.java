package Derlemeler;

import java.util.Arrays;

public class Dizi_Tekraredensayi {
    public static void main(String[] args) {
        int[] list = {1, 2, 1, 3, 4, 5, 3, 4, 6, 8, 8};
        int[] update = new int[list.length];
        int startID = 0;

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i] == list[j])) {
                    if (!isFind(update, list[i])) {
                        update[startID++] = list[i];
                    }
                    break;
                }
            }
        }
        for (int value: update){
            if (value != 0){
                System.out.print(value+" ");
            }
        }
    }

    public static boolean isFind (int[] arr, int value){
            for (int i : arr) {
                if (i == value) {
                    return true;
                }
            }
            return false;
    }
}

