import java.util.Scanner;

public class kuvvet4ve5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz : ");
        int say = input.nextInt();
        for (int i = 1; i <= say; i *= 4) {
            System.out.println(i);
        }
            System.out.println("--------------");
            for (int j = 5; j <= say; j *= 5){
                System.out.println(j);
            }
    }
}
