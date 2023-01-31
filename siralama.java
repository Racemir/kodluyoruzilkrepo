import java.util.Scanner;

public class siralama {
    public static void main(String[] args) {
        int say1,say2,say3;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz:");
        say1 = input.nextInt();
        System.out.print("Bir Sayı Giriniz:");
        say2 = input.nextInt();
        System.out.print("Bir Sayı Giriniz:");
        say3 = input.nextInt();

        if (say1==say2){
            if (say1==say3){System.out.print(say1+"="+say2+"="+say3);}
            else if (say3>say1) {System.out.print(say3+">"+say2+"="+say1);
            } else {System.out.print(say1+"="+say2+">"+say3);}
        } else if (say1==say3) {
            if (say1>say2){System.out.print(say1+"="+say3+">"+say2);}
            else {System.out.print(say2+">"+say1+"="+say3);}
        } else if (say2==say3) {
            if (say2>say1){
                System.out.print(say3+"="+say2+">"+say1);
            }else System.out.print(say1+">"+say2+"="+say3);

        }else if (say1 > say2){
            if(say1 > say3){
                if(say2 > say3){
                    System.out.print(say1+">"+say2+">"+say3);
                }
                else{System.out.print(say1+">"+say3+">"+say2);}
            }
            else {System.out.print(say3+">"+say1+">"+say2);}
        }
        else if (say1 > say3) {
            System.out.print(say2+">"+say1+">"+say3);
        }
        else if (say2 > say3) {
            System.out.print(say2+">"+say3+">"+say1);
        }
        else {System.out.print(say3+">"+say2+">"+say1);}

    }
}
