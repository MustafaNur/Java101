public class Student {
    Course c1;
    Course c2;
    Course c3;

    String name;
    String stuNo;
    String classes;
    double avarges;
    boolean isPase;


    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avarges = 0.0;
        this.isPase = false;
    }

    void addBulkExamNote(double note1, double verbal1, double note2, double verbal2, double note3, double verbal3){
        if (note1 >= 0 && note1 <= 100){
         c1.note = note1 * 0.80;
         this.c1.verbal = verbal1 * 0.20;
        }
        if (note2 >= 0 && note2 <= 100){
            c2.note = note2 * 0.80;
            this.c2.verbal = verbal2 * 0.20;
        }
        if (note3 >= 0 && note3 <= 100){
            c3.note = note3 * 0.80;
            this.c3.verbal = verbal2 * 0.20;
        }
    }

    void isPase(){
        this.avarges = (this.c1.note + this.c1.verbal + this.c2.note + this.c2.verbal + this.c3.note + this.c3.verbal) / 3.0;
        if (this.avarges > 55){
            System.out.println("Sınıfı başarıyla geçtiniz ! ");
        }else {
            System.out.println("Sınıfta kaldınız !!!");
        }
        printNote();
    }

    void printNote(){
        System.out.println(c1.name + "Notu\t:" + c1.note);
        System.out.println(c2.name + "Notu\t:" + c2.note);
        System.out.println(c3.name + "Notu:" + c3.note);
        System.out.println("Ortalamanız: " + this.avarges);
    }
}
