package Derlemeler;

public class Dizi_Transpoz {
    public static void main(String[] args) {

        int[][] list = {{2, 3, 4}, {5, 6, 4}};

        System.out.println("Matris:");
        for (int row = 0; row < list.length; row++) {
            for (int column = 0; column < list[row].length; column++) {
                System.out.print(list[row][column] + " ");
            }
            System.out.println();
        }
        System.out.println("Transpoze:");

        for (int row = 0; row < list[0].length; row++) {
            for (int column = 0; column < list.length; column++) {
                System.out.print(list[column][row] + " ");
            }
            System.out.println();
        }


    }

}
