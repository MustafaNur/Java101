import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        +değişkenleri tanımla
        +kullanıcıdan 2 sayı al
        kullanıcıdan yapmasını istediğin seçimi iste
        işlemi yaptır
        yapılan işlemi ekrana yazdır
         */
        int n1, n2, select, output;

        Scanner input = new Scanner(System.in);
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-bölme\n5-faktariyel");
        System.out.print("Bir işlem seçiniz: ");
        select = input.nextInt();
        if(select == 5){
            System.out.print("1. sayıyı girin: ");
            n1 = input.nextInt();
            if (n1 == 0){
                output = 1;
                System.out.print("= " + output);
            }
            else{
                int fact = 1;
                for (int i = 1; i <= n1; i++){

                    fact = fact*i;
                }
                System.out.print("= " + fact);
            }
        }
        else {
            System.out.print("1. sayıyı girin: ");
            n1 = input.nextInt();
            System.out.print("2. sayıyı girin: ");
            n2 = input.nextInt();

            switch (select){
                case 1:
                    output = n1 + n2;
                    System.out.print("= " + output);
                    break;
                case 2:
                    output = n1 - n2;
                    System.out.print("= " + output);
                    break;
                case 3:
                    output = n1 * n2;
                    System.out.print("= " + output);
                    break;
                case 4:
                    output = n1 / n2;
                    System.out.print("= " + output);
                    break;
            }

        }

    }
}
