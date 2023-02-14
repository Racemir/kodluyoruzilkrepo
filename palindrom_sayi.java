public class palindrom_sayi {

    static boolean isPalindrom(int number) {
        int tempnumber = number, reversenumber = 0, lastnumber;
        while (tempnumber != 0) {
            //System.out.println("-------");
            //System.out.println("sayı = " + tempnumber);
            lastnumber = tempnumber % 10;
            //System.out.println("basamak = " + lastnumber);
            reversenumber = (reversenumber * 10) + lastnumber;
            //System.out.println("yeni sayı = " + reversenumber);
            tempnumber /= 10;
            //System.out.println("Yeni Temp Number : "+ tempnumber);
        }

        if (number == reversenumber)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
       System.out.println(isPalindrom(322));

    }
}

