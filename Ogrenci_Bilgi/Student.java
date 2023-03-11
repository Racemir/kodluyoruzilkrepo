package Ogrenci_Bilgi;

public class Student {
    Course c1;
    Course c2;
    Course c3;

    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avarage = 0.0;
        this.isPass = false;
    }

    void addBulkExamNote(int note1,int performance1 ,int note2,int performance2, int note3,int performance3) {
        if (note1 >= 0 && note1 <= 100) {
            this.c1.note = (int) ((note1 * 0.80) + (performance1 * 0.20));
        }
        if (note2 >= 0 && note2 <= 100) {
            this.c2.note = (int) ((note2 * 0.80) + (performance2 * 0.20));
        }
        if (note3 >= 0 && note3 <= 100) {
            this.c3.note = (int) ((note3 * 0.80) + (performance3 * 0.20));
        }
    }

    void isPass() {
        this.avarage = (this.c1.note + this.c2.note + this.c3.note) / 3.0;
        System.out.println("<<<<<<<<<<<<<<<");
        if (this.avarage > 55) {
            System.out.println("geçtin");
            this.isPass = true;
        } else {
            System.out.println("kaldın");
            this.isPass = false;
        }
        printNote();
    }

    void printNote() {
        System.out.println(this.c1.name + " notu\t:" + this.c1.note);
        System.out.println(this.c2.name + " notu\t:" + this.c2.note);
        System.out.println(this.c3.name + " notu\t:" + this.c3.note);
        System.out.println("ortalamanız : " + this.avarage);
    }
}
