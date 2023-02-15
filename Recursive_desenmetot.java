import java.util.Scanner;

public class Recursive_desenmetot {
    static int method(int sayi){
        Scanner input = new Scanner(System.in);
        System.out.print("Bir Saytı Giriniz : ");
        int number = input.nextInt();
        int tempnumber = number;

            if (tempnumber > 0){
                while(tempnumber > 0){
                    System.out.println(tempnumber);
                    tempnumber-=5;
                }
            }
            if (tempnumber <= 0){
                while(number >= tempnumber){
                    System.out.println(tempnumber);
                    tempnumber+=5;
                }
            }


        return 1;
    }
    public static void main(String[] args) {
        method(1);

    }
}
