import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // değişkenler
        double armut, elma, domates, muz, patlıcan, tutar;
        Scanner ürün = new Scanner(System.in);
        System.out.print("Armut Kaç kilo? : ");
        armut = ürün.nextDouble();
        System.out.print("Elma Kaç kilo : ");
        elma = ürün.nextDouble();
        System.out.print("Domates kaç kilo : ");
        domates = ürün.nextDouble();
        System.out.print("Muz kaç kilo : ");
        muz = ürün.nextDouble();
        System.out.print("Patlıcan kaç kilo : ");
        patlıcan = ürün.nextDouble();
        // işlem
        tutar = (armut * 2.14) + (elma * 3.67) + (domates * 1.11) + (muz * 0.95) + (patlıcan * 5.00);
        // çıktı
        System.out.print("Toplam tutar = " + tutar);
    }
}
