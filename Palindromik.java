package Derlemeler;

public class Palindromik {
    public static void main(String[] args) {
        System.out.println(isPalindromik("aba"));
    }

    public static boolean isPalindromik(String str) {
        String a = "";
        for (int i = str.length()- 1; i >= 0; i--) {
            a += str.charAt(i);

        }
        if (str.equals(a)) // equals : == demek
            return true;
        else
            return false;
    }
}






