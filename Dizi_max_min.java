import java.util.Arrays;
import java.util.Scanner;

public class Dizi_max_min{
    public static void main(String[] args) {
        int[] list = {56,34,1,8,101,-2,-33};
        Arrays.sort(list);
        int min = 0;
        int max = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Bir SAyı Giriniz: ");
        int value = input.nextInt();

        for(int i: list){
            if (min < i && i < value){
                min = i;
            }
            if (max < i && i > value){
                max = i;
                break;
            }
        }
        System.out.println("En Yakın Min. Değer: "+min);
        System.out.println("En Yakın Max. Değer: "+max);
    }
}