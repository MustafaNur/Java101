import java.util.Scanner;

public class Mian {
    public static void main(String[] args) {
        Scanner sayi = new Scanner(System.in);
        int a,i;
        System.out.print("Sınır sayısını giriniz: ");
        a = sayi.nextInt();
        for (i = 1; i <= a; i *= 2){
            System.out.println(i);
        }
    }
}
