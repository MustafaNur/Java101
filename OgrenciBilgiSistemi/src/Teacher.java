public class Teacher {
    String name;
    String mpno;
    String breanch;

    Teacher(String name, String breanch, String mpno){
        this.name = name;
        this.mpno = mpno;
        this.breanch =breanch;
    }

    void print(){
        System.out.println("Adı: " + this.name);
        System.out.println("Adı: " + this.mpno);
        System.out.println("Adı: " + this.breanch);
    }
}
