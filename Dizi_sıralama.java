package Derlemeler;

import java.util.Arrays;
import java.util.Scanner;
import java.util.*;

public class Dizi_sıralama {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Dizinin Boyutunu Giriniz: ");
        int array = input.nextInt();
        int[] list = new int[array];

        System.out.println("Dizinin Elemanlarını Giriniz: ");
        for (int i = 0; i < array;i++){
            System.out.print(i +".Eleman: ");
            list[i] = input.nextInt();
        }
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
    }
}
