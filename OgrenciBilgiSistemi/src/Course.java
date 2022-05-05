public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    double note;
    double verbal;

    Course(String name, String code, String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        double note = 0;
        double verbal = 0;
    }

    void addTeacher(Teacher teacher){
        if (teacher.breanch.equals(this.prefix)){
            this.teacher = teacher;
            //printTeacherInfo();
        }else {
            System.out.println("Öğretmen ve Ders bölümleri uyuşmuyor");
        }
    }

    void  printTeacherInfo(){
        this.teacher.print();
    }
}
