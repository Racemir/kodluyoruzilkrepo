package Ogrenci_Bilgi;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("mahmut", "TRH", "905000");
        Teacher t2 = new Teacher("emir","FZK","90000");
        Teacher t3 = new Teacher("sercan","BIO","4999");

        Course tarih = new Course("tarih", "101", "TRH");
        tarih.addTeacher(t1);

        Course fizik = new Course("fizik", "102", "FZK");
        fizik.addTeacher(t2);

        Course biyoloji = new Course("biyoloji","103","BIO");
        biyoloji.addTeacher(t3);


        Student s1 = new Student("efe","10","2",tarih,fizik,biyoloji);
        s1.addBulkExamNote(60,70,60,70,60,70);
        s1.isPass();

        Student s2 = new Student("emr","8","8",tarih,fizik,biyoloji);
        s2.addBulkExamNote(40,60,40,60,40,60);
        s2.isPass();
    }
}