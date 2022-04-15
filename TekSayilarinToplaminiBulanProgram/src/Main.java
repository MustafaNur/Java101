import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
            Scanner sayi = new Scanner(System.in);
            int n;
            int total = 0;
            do {
                System.out.print("Bir sayı giriniz: ");
                n = sayi.nextInt();
                if (n % 2 == 1){
                    total += n;
                }
            }while (n > 0);
            System.out.print("Tek sayıların toplamı = " + total);
    }
}
