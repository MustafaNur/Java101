import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz :");
        int n = klavye.nextInt();

        for (int i = 0; i <= n ; i++) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for(int a = n - 1; a >= 1; a--){
            for (int h = 1; h <= (n-a) ; h++) {
                System.out.print(" ");
            }
            for (int g = (2*a)-1; g>=1; g--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}