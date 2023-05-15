package Derlemeler;

import com.sun.source.tree.WhileLoopTree;

import java.util.Random;
import java.util.Scanner;

public class Sayi_Tahmin {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100);
        System.out.println(number);
        Scanner input = new Scanner(System.in);
        System.out.println("Aklımdan Bir Sayı Tuttum Tahmin Et Ne: ");
        int value = input.nextInt();
        int right = 4;


        while(right > 1){
            if (value < 0 || value > 99) {
                System.out.println("Tuttuğum sayı 0 ile 100 arasında \nBir daha dene");
                value = input.nextInt();
            }
            if (value > number){
                System.out.println("Sana Biraz Yardımcı Olayım "+value+" Sayısından Daha Küçük ");
            }else if(number < value){
                System.out.println("Sana Biraz Yardımcı Olayım "+value+" Sayısından Daha Büyük");
            }
            if (value == number){
                System.out.println("Doğru Tahmin Çok İyisin :)");
                break;
            }
            else if(right > 1) {
                    right--;
                    System.out.println("Bir Daha dene \n"+right+" Hakkın Kaldı");
                    value = input.nextInt();
            }
        }
        if (right == 1)System.out.println("UPSS !!");
    }
}
