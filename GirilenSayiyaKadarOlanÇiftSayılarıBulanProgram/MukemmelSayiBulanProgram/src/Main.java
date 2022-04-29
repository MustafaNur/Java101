import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner girdi = new Scanner(System.in);
        int total = 0;
        System.out.print("Bir sayi giriniz: ");
        int sayi = girdi.nextInt();

        for (int i = 0; i < sayi; i++){
            if(sayi%2 == 0){
                total =+ sayi;
            }
        }
        if (total == sayi){
            System.out.print("Mükemmel sayı");
        }
        else {
            System.out.print("Mükemmel sayı değildir");
        }
    }
}
