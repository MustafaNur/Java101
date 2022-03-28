import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        // Değişkenleri oluştur
        int mat, fizik, kimya, tarih, biyoloji;

        // Scanner sınıfımızı tanımladık
        Scanner inp = new Scanner(System.in);

        // kullanıcıdan değerleri al
        System.out.print("Matematik Notunuz : ");
        mat = inp.nextInt();
        System.out.print("Fizik Notunuz : ");
        fizik = inp.nextInt();
        System.out.print("Kimya Notunuz : ");
        kimya = inp.nextInt();
        System.out.print("Tarih Notunuz : ");
        tarih = inp.nextInt();
        System.out.print("Biyoloji Notunuz : ");
        biyoloji = inp.nextInt();

        // Hesaplama işlemi
        int toplam = (mat + fizik + kimya + tarih + biyoloji);
        double sonuc = toplam / 5.0;
        System.out.println("Ortalamanız = " + sonuc);

        String kosul = (sonuc > 60 ) ? "Geçti" : "Kaldı";
        System.out.println(kosul);

    }
}
