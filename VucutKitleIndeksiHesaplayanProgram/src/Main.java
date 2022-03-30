import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Kilo (kg) / Boy(m) * Boy(m)
        Scanner body = new Scanner(System.in);
        double size, weight, bodyMassIndex;
        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz: ");
        size = body.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz: ");
        weight = body.nextDouble();
        bodyMassIndex = weight / (size * size);
        System.out.print("Vücut Kitle İndeksiniz : " + bodyMassIndex);
    }
}
