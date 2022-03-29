import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a, b;
        double c;

        Scanner girdi = new Scanner(System.in);
        System.out.print("birinci kenarı girin: ");
        a = girdi.nextInt();
        System.out.print("ikinci kenarı girin: ");
        b = girdi.nextInt();

        c = Math.sqrt((a * a) + (b * b));
        System.out.print("Hipotenüs " + c);
    }
}
