package Derlemeler;

public class Dizi_Hormanik_ort {
    public static void main(String[] args) {
        float[] list = {34,55,67,44,200,55,84};
        float num = 0;
        float HO = 0;
        for(int i = 0; i < list.length;i++){
            num +=  1/list[i];
            System.out.println(num);
            if(i == list.length-1){
                HO =  list.length / num;
                System.out.println(HO);
            }
        }
    }
}
