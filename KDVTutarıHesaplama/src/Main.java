import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double tutar, kdvOran = 0.18, kdvTutar, kdvliTutar;
        System.out.print("Fiyat giriniz: ");
        tutar = inp.nextDouble();
        kdvTutar = tutar * kdvOran;
        kdvliTutar = tutar + kdvTutar;
        System.out.println("KDV'siz Tutar: " + tutar);
        System.out.println("KDV Oranı: " + kdvOran);
        System.out.println("KDV Tutarı: " + kdvTutar);
        System.out.println("KDV'li Tutar: " + kdvliTutar);

        //0.18
    }
}
