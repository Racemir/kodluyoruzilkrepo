import java.util.Scanner;

public class Kullanici_giris {
    public static void main(String[] args) {
        String username,deger;
        int password;
        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı Adınızı Giriniz:");
        username = input.nextLine();
        System.out.print("Şifre Giriniz:");
        password = input.nextInt();

        if (username.equals("EMR") && password == (123)) {
            System.out.println("Giriş Başarılı");
        }else {
            System.out.println("Yanlış işlem Yaptınız");
        }

    }
}
