import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName, password;
        int right = 3;
        int blance = 1500, quantity, total;
        int select;
        while (right > 0){
            System.out.print("Kullanıcı adı giriniz: ");
            userName = input.nextLine();
            System.out.print("Şifre giriniz: ");
            password = input.nextLine();
            if (userName.equals("admin") && password.equals("admin123")){
                System.out.println("Bankamatiğe hoşgeldiniz!!");
                System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz");

                do {
                    System.out.println("1-para yatırma\n"+
                            "2- para çekme\n" +
                            "3- Bakiye sorgulama\n" +
                            "4- Çıkış yap");
                    select = input.nextInt();
                    if (select == 1){
                        System.out.print("Yatıracak miktar giriniz:");
                        quantity = input.nextInt();
                        System.out.println("İşlem gerçekleştirildi, yatırdığınız miktar: " + quantity);
                        total = quantity + blance;
                        System.out.println("Güncel bakiyeniz: " + total);
                    }else if (select == 2){
                        System.out.print("Çekeceğiniz para miktarını giriniz: ");
                        quantity = input.nextInt();
                        System.out.println("Gerçekleşen para çekme miktarınız: " + quantity);
                        total =  blance - quantity;
                        System.out.println("Güncel bakiyeniz: " + total);
                    }
                    else if (select == 3){
                        total =+ blance;
                        System.out.println("Güncel bakiyeniz: " + total);
                    }
                }while ( select != 4);
                break;
            }
            else{
                System.out.println("hatalı kullanıcı adı veya şifre girdiniz, lütfen tekrar deneyiniz.");
                System.out.println("Kalan hakkınız: " + --right);
            }
        }
    }
}
