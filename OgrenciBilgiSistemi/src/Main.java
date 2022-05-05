public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Bekir" , "TRH", "+9054587569524" );
        Teacher t2 = new Teacher("Grahan Bell", "FZK", "0000");
        Teacher t3 = new Teacher("Külyutmaz", "BIO", "11100");

        Course tarih = new Course("Tarih", "101", "TRH");
        tarih.addTeacher(t1);

        Course fizik = new Course("Fizik", "102", "FZK");
        fizik.addTeacher(t2);

        Course biyo = new Course("Biyoloji", "101", "BIO");
        biyo.addTeacher(t3);

        Student s1 = new Student("Fırat", "123", "4", tarih, fizik, biyo);
        s1.addBulkExamNote(80, 60, 80, 60, 80, 60);
        s1.isPase();
    }
}
