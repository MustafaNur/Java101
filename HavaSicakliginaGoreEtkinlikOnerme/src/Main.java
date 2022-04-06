import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int heat;

        Scanner input = new Scanner(System.in);
        System.out.print("Sıcaklık giriniz: ");
        heat = input.nextInt();

        if (heat < 5){
            System.out.print("Kayak yapabiilirsiniz");
        }else if (heat <= 25){
            if (heat <= 15){
                System.out.print("Sinamaya gidebilirsiniz");
            }
            if (heat >= 10){
                System.out.print("Pikniğe gidebilirsiniz");
            }
        }else {
            System.out.print("Yüzmeye gidebilirsiniz");
        }
    }
}