import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz :");
        int n = input.nextInt();

        asalMi(n,2);
        if (asalMi(n, 2))
            System.out.println(n + " sayısı ASALDIR !");
        else
            System.out.println(n + " sayısı ASAL değildir !");
    }
    static boolean asalMi(int n, int i)
    {
        if (n <= 2)
            return (n == 2) ? true : false;
        if (n % i == 0)
            return false;
        if (i * i > n)
            return true;

        return asalMi(n, i + 1);
    }
}
