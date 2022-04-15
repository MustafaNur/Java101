import java.util.Scanner;
public class Cift {
    public static void main(String[] args) {
        Scanner sayi = new Scanner(System.in);
        int n;
        int total = 0;
        do {
            System.out.print("Bir sayi giriniz: ");
            n = sayi.nextInt();
            if (n % 4 == 0){
                total += n;
            }
        }while (n % 2 != 1);
        System.out.print("4 ün katların toplamı = " + total);
    }
}
