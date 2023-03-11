package Ogrenci_Bilgi;

public class Course {
    // nitelikler (Sınıflar birbirlerinin nitelikleri olabilirler)
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int performance;

    Course(String name,String code,String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        int note = 0;
        int performance = 0;
    }

    void addTeacher(Teacher teacher){
        if(teacher.branch.equals(this.prefix))
        {
            this.teacher = teacher;
        }
        else{
            System.out.println("Öğretmen ve ders bölümleri uyuşmuyor");
        }
    }

    void printTeacher(){
        this.teacher.print();
    }
}
