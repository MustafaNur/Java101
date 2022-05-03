import  java.util.Scanner;
public class Main {

    static void plus(){
        Scanner scan = new Scanner(System.in);
        int number, result = 0, i=1;
        while (true){
            System.out.print(i++ +". sayıyı giriniz: ");
            number = scan.nextInt();
            if (number == 0){
                break;
            }
            result += number;
        }
        System.out.println("sonuc: " + result);
    }
    // çıkartma
    static void minus(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = scan.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = scan.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }

        System.out.println("Sonuç : " + result);
    }
    // carpma
    static void impact(){
        Scanner scan = new Scanner(System.in);
        int number, result = 1, i = 1;

        while (true) {
            System.out.print(i++ + ". sayı :");
            number = scan.nextInt();

            if (number == 1)
                break;

            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }

        System.out.println("Sonuç : " + result);
    }
    // Bölme işlemi
    static void divide(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = scan.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = scan.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("Böleni 0 giremezsiniz.");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }

        System.out.println("Sonuç : " + result);
    }
    // Üssü işlemi
    static void power() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değeri giriniz :");
        int base = scan.nextInt();
        System.out.print("Üs değeri giriniz :");
        int exponent = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Sonuç : " + result);
    }
    // Faktoriyel
    static void factorial() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz :");
        int n = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Sonuç : " + result);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        String menu = "1- Toplama İşlemi\n" +
                "2- Cıkartma işlemi\n" +
                "3- Çarpma işlemi\n" +
                "4- Bölme işlemi\n" +
                "5- Üssü işlemi\n" +
                "6- faktoriyel işlemi\n"
                ;
        System.out.println(menu);
        System.out.print("Bir işlem seçiniz: ");
        select = scan.nextInt();
        switch (select){
            case 1:
                plus();
                break;
            case 2:
                minus();
                break;
            case 3:
                impact();
                break;
            case 4:
                divide();
                break;
            case 5:
                power();
                break;
            case 6:
                factorial();
                break;
            default:
                System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
        }
    }
}
