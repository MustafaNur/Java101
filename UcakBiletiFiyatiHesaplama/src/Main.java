import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int mesafe, yas, yolcuTipi;
        double normalTutar, yasIndirimi, yolcuTipiIndirimi, toplamTutar;
        Scanner input = new Scanner(System.in);

        System.out.print("Mesafe km cinsinden giriniz :");
        mesafe = input.nextInt();
        if (mesafe < 0 ){
            System.out.print("Hatalı giriş");
        }else {
            System.out.print("Yaşınızı giriniz: ");
            yas = input.nextInt();
            if (yas < 0 ){
                System.out.print("Hatalı giriş");
            }
            else {
                System.out.print("Yolculuk tipi giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
                yolcuTipi = input.nextInt();
                normalTutar = mesafe * 0.1;
                switch (yolcuTipi){
                    case 1:
                        if (yas > 0 && yas < 12){
                            yasIndirimi = normalTutar - (normalTutar * 0.50);
                            System.out.print("Toplam tutarınız = " + yasIndirimi);
                        }
                        else if (yas >= 12 && yas <= 24){
                            yasIndirimi = normalTutar - (normalTutar * 0.1);
                            System.out.print("Toplam tutarınız = " + yasIndirimi);
                        }
                        else if (yas > 65) {
                            yasIndirimi = normalTutar - (normalTutar * 0.30);
                            System.out.print("Toplam tutarınız = " + yasIndirimi);
                        }else {
                            System.out.print("Toplam tutarınız = " + normalTutar);
                        }
                        break;
                    case 2:
                        if (yas > 0 && yas < 12){
                            yasIndirimi = normalTutar - (normalTutar * 0.50);
                            yolcuTipiIndirimi = yasIndirimi * 0.20;
                            toplamTutar = (yasIndirimi - yolcuTipiIndirimi) * 2;
                            System.out.print("Toplam tutarınız = " + toplamTutar);
                        }
                        else if (yas >= 12 && yas <= 24){
                            yasIndirimi = normalTutar - (normalTutar * 0.1);
                            yolcuTipiIndirimi = yasIndirimi * 0.2;
                            toplamTutar = (yasIndirimi - yolcuTipiIndirimi) * 2;
                            System.out.print("Toplam tutarınız = " + toplamTutar);
                        }
                        else if (yas > 65) {
                            yasIndirimi = normalTutar - (normalTutar * 0.30);
                            yolcuTipiIndirimi = yasIndirimi * 0.20;
                            toplamTutar = (yasIndirimi - yolcuTipiIndirimi) * 2;
                            System.out.print("Toplam tutarınız = " + toplamTutar);
                        }else {
                            System.out.print("Toplam tutarınız = " + normalTutar);
                        }
                        break;
                    default:
                        System.out.print("Hatalı giriş yaptınız");

                }
            }

        }
    }
}