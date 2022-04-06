import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int fizik, matematik, edebiyat, kimya, biyoloji, sayac = 0, ort=0;
        System.out.print("Matematik notunu giriniz: ");
        matematik = input.nextInt();
        if (matematik > 0 && matematik < 101){
            ort += matematik;
            sayac++;
        }
        System.out.print("fizik notunu giriniz: ");
        fizik = input.nextInt();
        if (fizik > 0 && fizik < 101){
            ort += fizik;
            sayac++;
        }
        System.out.print("edebiyat notunu giriniz: ");
        edebiyat = input.nextInt();
        if (edebiyat > 0 && edebiyat < 101){
            ort += edebiyat;
            sayac++;
        }
        System.out.print("kimya notunu giriniz: ");
        kimya = input.nextInt();
        if (kimya > 0 && kimya < 101){
            ort += kimya;
            sayac++;
        }
        System.out.print("biyoloji notunu giriniz: ");
        biyoloji = input.nextInt();
        if (biyoloji > 0 && biyoloji < 101){
            ort += biyoloji;
            sayac++;
        }
        ort /= sayac;
        if (ort >= 55){
            System.out.println("Tebrikler sınıfı geçtiniz");
        }
        else {
            System.out.println("Malesef sınıfta kaldınız");
        }
        System.out.print("Ortalamanız = " + ort);
    }
}
