package Ogrenci_Bilgi;

public class Teacher {
    String name;
    String mpno;
    String branch;

    Teacher(String name, String branch,String mpno){
        this.name = name;
        this.branch = branch;
        this.mpno = mpno;
    }

    void print(){
        System.out.println("Adı : "+ name);
        System.out.println("Telefonu: "+ mpno);
        System.out.println("bölümü : "+ branch);
    }
}
