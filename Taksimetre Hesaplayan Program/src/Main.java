import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Taksimetre KM başına 2.20 TL tutmaktadır.
        //Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
        //Taksimetre açılış ücreti 10 TL'dir.
        int km;
        double tutar = 10;
        Scanner alinacak = new Scanner(System.in);
        System.out.print("Gidilen KM giriniz: ");
        km = alinacak.nextInt();

        tutar += km * 2.20;

        tutar = (tutar < 20) ? 20 : tutar;
        System.out.print("Toplam tutarınız = " + tutar);

        /* if (tutar < 20){
            System.out.print("Tutarınız 20 tl'dir");
        }
        else{
            System.out.print("Tutarınız = " + tutar);
        }
        */
    }
}
